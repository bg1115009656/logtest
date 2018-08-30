package com.gbai.tips;

/**
 * 提示枚举
 */
public enum TipEnum {

    SUCCESS(200,"处理成功"),
    NO_LOGIN(200,"登录已过期,请重新登录");

    private Integer code;

    private String message;
    TipEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
