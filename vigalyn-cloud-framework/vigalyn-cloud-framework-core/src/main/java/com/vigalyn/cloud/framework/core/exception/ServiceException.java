package com.vigalyn.cloud.framework.core.exception;

import com.vigalyn.cloud.framework.core.constant.ErrorCodeAndMsg;

public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -5995379535146322842L;
    
    private int errCode;
	
	public ServiceException(){
		super();
	}
	
	public ServiceException(String errMsg){
		super(errMsg);
	}
	
	public ServiceException(ErrorCodeAndMsg errorCodeAndMsg){
		super(errorCodeAndMsg.getMsg());
		this.setErrCode(errorCodeAndMsg.getCode());
	}
	
	public ServiceException(String errMsg, Throwable t){
		super(errMsg, t);
	}
	
	public ServiceException(int errCode, String errMsg){
		super(errMsg);
		this.setErrCode(errCode);
	}

	public int getErrCode() {
		return errCode;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

}
