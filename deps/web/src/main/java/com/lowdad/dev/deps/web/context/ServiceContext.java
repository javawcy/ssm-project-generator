package com.lowdad.dev.deps.web.context;

import java.util.Map;

/**
 * @author Chongyu
 * @time 2020/4/28
 * @descrip
 */
public class ServiceContext {

    /**
     * 线程级上下文
     */
    private ThreadLocal<Map<String, Object>> threadLocal;

    private ServiceContext() {
        this.threadLocal = new ThreadLocal<>();
    }

    /**
     * 使用静态内部类创建单例
     */
    private static class Context {
        private static final ServiceContext INSTANCE = new ServiceContext();
    }

    public static ServiceContext getInstance() {
        return Context.INSTANCE;
    }

    public void setContext(Map<String, Object> map) {
        threadLocal.set(map);
    }

    public Map<String, Object> getContext() {
        return threadLocal.get();
    }

    public Object getContextKey(String key) {
        Map<String,Object> map = threadLocal.get();
        return map.get(key);
    }

    public void clear() {
        threadLocal.remove();
    }
}
