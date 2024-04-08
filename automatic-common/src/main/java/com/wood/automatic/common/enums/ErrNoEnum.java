package com.wood.automatic.common.enums;
import lombok.Getter;

@Getter
public enum ErrNoEnum{
    SUCCESS_REQUEST(200,"请求成功"),
    ERROR_REQUEST(400,"请求失败"),
    ERROR_NOT_FOUND(404,"请求资源不存在"),
    ERROR_SERVER(500,"服务器错误"),
    ERROR_DECODE(5001,"解码失败"),
    ERROR_ENCODE(5002,"编码失败"),
    ;
    private final int code;
    private final String msg;
    ErrNoEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

}