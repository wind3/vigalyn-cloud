package com.vigalyn.cloud.framework.core.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResultDTO<T> implements Serializable{

	private static final long serialVersionUID = 3367998227214031299L;
	public static final int CODE_SUCCESS = 0;
    public static final int CODE_DEFAULT_FAIL = -1;
    public static final String SUCCESS_MSG = "操作成功";
    public static final String FAIL_MSG = "操作失败";
    
    private int resCode;
    private String resMsg;
    
    @Override
    public String toString() {
        return "ResultDTO [resCode=" + resCode + ", resMsg=" + resMsg + ", resData=" + resData + "]";
    }

    private T resData;
    
    public ResultDTO() {
        this(CODE_SUCCESS,SUCCESS_MSG,null);
    }
    
    public boolean success(){
        return this.resCode == CODE_SUCCESS;
    }
    
    public ResultDTO(int resCode) {
    	 this(CODE_SUCCESS, resCode == 0 ? SUCCESS_MSG : FAIL_MSG ,null);
    }
    
    public ResultDTO(int resCode, String resMsg) {
        this(resCode, resMsg ,null);
    }
 
    public ResultDTO(T resData) {
    	 this(CODE_SUCCESS,SUCCESS_MSG,resData);
    }  
    
    public ResultDTO(int resCode, String resMsg, T resData) {
        this.resCode = resCode;
        this.resMsg = resMsg;
        this.resData = resData;
    }  
}
