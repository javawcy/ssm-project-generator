package com.lowdad.dev.deps.web.interceptor;

import com.lowdad.dev.deps.web.context.ServiceContext;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Chongyu
 * @time 2020/4/28
 */
public class ContextInterceptor implements HandlerInterceptor {

    /**
     * 清除上下文
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        ServiceContext.getInstance().clear();
    }
}
