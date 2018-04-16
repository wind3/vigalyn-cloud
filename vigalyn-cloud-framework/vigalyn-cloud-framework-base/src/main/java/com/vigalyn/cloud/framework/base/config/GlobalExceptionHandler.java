package com.vigalyn.cloud.framework.base.config;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vigalyn.cloud.framework.core.constant.ErrorCodeAndMsg;
import com.vigalyn.cloud.framework.core.dto.ResultDTO;
import com.vigalyn.cloud.framework.core.exception.ServiceException;



/**
 * 统一错误码异常处理
 */
@ControllerAdvice(annotations = {RestController.class,Controller.class})
public class GlobalExceptionHandler {
	private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = ServiceException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public ResultDTO<String> businessExceptionHandler(ServiceException e) throws IOException {
        LOG.info(e.toString());
        ResultDTO<String> resultDTO= new ResultDTO<String>(e.getErrCode(), e.getMessage());
        return resultDTO;
    }
    
    @ExceptionHandler(value = BindException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public ResultDTO<String> bindExceptionHandler(BindException e ,BindingResult bindingResult) throws IOException {
        LOG.error(e.toString());
        StringBuffer buffer = new StringBuffer();
        for (ObjectError err : e.getAllErrors()) {
        	buffer.append(err.getObjectName());
        	buffer.append(" : ");
        	buffer.append(err.getDefaultMessage());      
        	buffer.append(" ; ");
        }
        ResultDTO<String> resultDTO= new ResultDTO<String>(ErrorCodeAndMsg.VALID_PARAM_ERR.getCode(),buffer.toString());
        return resultDTO;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    public ResultDTO<String> otherExceptionHandler(Exception e) throws IOException {
        LOG.error(e.toString());
        ResultDTO<String> resultDTO= new ResultDTO<String>(ErrorCodeAndMsg.SYS_ERROR.getCode(),e.getMessage());
        return resultDTO;
    }
}