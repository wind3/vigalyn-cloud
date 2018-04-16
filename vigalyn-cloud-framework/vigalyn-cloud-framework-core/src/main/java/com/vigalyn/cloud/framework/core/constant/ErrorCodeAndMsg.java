package com.vigalyn.cloud.framework.core.constant;

public enum ErrorCodeAndMsg {
    
    /**
     *  -1 到 -100 参数异常
     */
    PARAM_IS_NULL(-2,"关键参数为空"),
    SESSION_TIME_OUT(-3,"登录超时，请重新登录"),
    PWD_OR_USER_ERROR(-4,"请填写正确的用户名或密码"),
    SSO_ERROR(-5,"SSO服务器异常"),
    SYS_ERROR(-6,"系统异常"),
    NO_AUTHORITY(-7,"没有权限"),
    NOT_LOGIN(-8,"您尚未登录"),
    PARTICIPATED(-9,"已报名"),
    NOT_INITIATOR(-10,"您非活动发起人"),
    USER_NAME_OR_PSW_EMPTY(-10,"请填写用户名或密码"),
    NO_USER_INFO(-11,"没有找到您的用户信息"),
    NO_LOGIN_AUTH(-12,"您无权限登录金融集团内网"),
    ISSUESTATUS_IS_DIFFERENT(-13,"选择的新闻状态不可进行此操作或状态不一致!"),
    NOT_FIND_FILE(-14,"没有找到您要的文件"),
    ACTION_NOTALLOW_CANCLE(-15,"活动进行中或已过期,不能取消!"),
    FOR_IS_DIFFERENT(-16,"不可删除非已下架或未发布状态的数据!"),
    NOT_MANAGER(-17,"您非活动管理员"),
    NOT_ALLOWED_CANCLE(-18,"活动已过期,无法取消"),
    ACTION_IS_CANCEL(-19,"该活动已经下架！"),

    /**
     * -101 到 -200 数据库异常
     */
    EXE_SQL_ERR(-101,"执行SQL报错"),
    INSERT_FAILED(-102,"保存失败，服务器返回信息，执行SQL报错"),
    DELETE_FAILED(-103,"删除失败"),
    UPDATE_FAILED(-104,"更新失败"),
    
    
    /**
     * -201 到 -300 其他异常
     */
    FORMAT_DATE_ERR(-201,"格式化时间解析错误"),
    NETWORK_ERR(-202,"网络异常"),
    UNKNOWN_ERR(-203,"未知异常"),
    NOT_CONFORM_PROVISION_ERR(-204,"已过报名截至日期"),
    SEND_MAIL_ERR(-205,"邮件发送失败"),
    MAIL_MESSAGE_ERR(-206,"邮件格式错误"),
    ESB_SERVICE_ERR(-207,"调用ESB服务异常"),
    UPLOAD_FAIL_ERR(-208,"下载失败"),
    MOBILE_FORMAT_ERR(-209,"手机号格式不正确"),
    NO_PARTICIPATOR(-210,"活动暂无参与者"),
    WEATHER_TRANSFORM_ERR(-211,"中文转义错误"),
    NO_ADVICEFEEDBACK_ERR(-212,"暂无意见反馈信息"),
    EXIST_PARTICIPATOR_ERR(-213,"活动已有参与者,暂时无法取消"),
    WEATHER_INVOKE_ERR(-214,"天气接口调用出错"),
    VALID_PARAM_ERR(-215,"参数校验不通过"),

    ;
    
    private ErrorCodeAndMsg(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    private int errorCode;
    private String errorMsg;
    
    public String getMsg() {  
        return this.errorMsg; 
    }  
    public int getCode() {  
      return this.errorCode; 
  } 
}
