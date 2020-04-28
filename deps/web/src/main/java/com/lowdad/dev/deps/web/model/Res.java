package com.lowdad.dev.deps.web.model;

import com.lowdad.dev.deps.web.exception.ServiceError;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Chongyu
 * @time 2020/4/28
 * @description 统一返回值封装
 */
@Data
public class Res<T> implements Serializable {

    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_MSG = "success";
    private static final long serialVersionUID = -7006019016089975751L;

    private int code = SUCCESS_CODE;
    private String msg = SUCCESS_MSG;
    private T data = (T) new EmptyModel();

    public Res(ServiceError error, T data) {
        this.data = data;
        this.code = error.getCode();
        this.msg = error.getMsg();
    }

    public Res(T data) {
        this.data = data;
    }

    public Res(ServiceError error) {
        this.code = error.getCode();
        this.msg = error.getMsg();
    }

    public Res(String msg,int code) {
        this.code = code;
        this.msg = msg;
    }

    public Res(String msg,int code,T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Res() {
    }

    public static <T> Res<T> success() {
        return new Res<>();
    }

    public static <T> Res<T> success(T data) {
        return new Res<>(data);
    }

    public static <T> Res<T> error(ServiceError error) {
        return new Res<>(error);
    }

    public static <T> Res<T> error(ServiceError error, T data) {
        return new Res<>(error,data);
    }

    public static <T> Res<T> error(String msg, int code, T data) {
        return new Res<>(msg,code,data);
    }

    public static <T> Res<T> error(String msg, int code) {
        return new Res<>(msg,code);
    }

    private boolean isSuccess() {
        return this.code == SUCCESS_CODE;
    }

    private boolean isFail() {
        return this.code != SUCCESS_CODE;
    }
}
