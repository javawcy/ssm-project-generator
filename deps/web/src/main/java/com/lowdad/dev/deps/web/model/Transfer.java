package com.lowdad.dev.deps.web.model;

/**
 * @author Chongyu
 * @time 2020/4/28
 */
public interface Transfer<P> {

    /**
     * 转为来源
     * @param p
     */
    void from(P p);

    /**
     * 转为Pojo
     * @param clazz
     * @return P
     */
    P toPo(Class<P> clazz);
}
