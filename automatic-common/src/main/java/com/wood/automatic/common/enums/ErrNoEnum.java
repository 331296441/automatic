package com.wood.automatic.common.enums;
import lombok.Getter;

@Getter
public enum ErrNoEnum{
    SUCCESS_REQUEST(200,"请求成功"),
    ERROR_REQUEST(400,"请求失败"),
    ERROR_NOT_FOUND(404,"请求资源不存在"),
    

}