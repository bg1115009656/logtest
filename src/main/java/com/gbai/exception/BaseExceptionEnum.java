package com.gbai.exception;

/**
 * 异常枚举
 *
 */
public enum BaseExceptionEnum implements ServiceExceptionEnum {

    /**
     * 其他
     */
    INVLIDE_DATE_STRING(400, "输入日期格式不对"),

    /**
     * 其他
     */
    WRITE_ERROR(500, "渲染界面错误"),

    /**
     * 文件上传
     */
    FILE_READING_ERROR(400, "FILE_READING_ERROR!"),
    FILE_NOT_FOUND(400, "FILE_NOT_FOUND!"),

    /**
     * 错误的请求
     */
    REQUEST_NULL(400, "请求有错误"),
    VERIFICATION_CODE(400, "验证码已过期"),
    INVALID_ARGUMENT(400, "非法参数"),
    SERVER_ERROR(500, "服务器异常");
    BaseExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
