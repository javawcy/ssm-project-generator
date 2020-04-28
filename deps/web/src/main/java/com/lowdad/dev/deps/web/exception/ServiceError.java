package com.lowdad.dev.deps.web.exception;

/**
 * @author Chongyu
 * @time 2020/4/28
 */
public interface ServiceError {

    /**
     * 获取状态码
     * @return int
     */
    int getCode();

    /**
     * 获取状态信息
     * @return String
     */
    String getMsg();
}
