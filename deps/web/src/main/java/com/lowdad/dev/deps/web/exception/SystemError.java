package com.lowdad.dev.deps.web.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Chongyu
 * @time 2020/4/28
 */
@AllArgsConstructor
@Getter
public enum SystemError implements ServiceError {

    /**
     * 系统异常
     */
    SYSTEM_ERROR(-1, "系统异常"),
    SYSTEM_BUSY(1000, "系统繁忙,请稍候再试"),

    NOT_FOUND_SERVICE(1001, "服务未找到"),
    CONNECT_TIME_OUT(1002, "连接超时"),

    PARAMS_NOT_VALID(1003, "请求参数校验失败"),
    INVALID_TOKEN(1004, "无效token"),
    REQUEST_SIZE_LIMIT(1005, "上传文件大小超过限制"),
    ;

    private final int code;
    private final String msg;
}
