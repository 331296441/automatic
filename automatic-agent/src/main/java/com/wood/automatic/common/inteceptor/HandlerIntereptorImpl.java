package com.wood.automatic.common.inteceptor;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class HandlerIntereptorImpl implements HandlerInterceptor {

    @Override
    public boolean preHandle(final HttpServletRequest request, HttpServletResponse reponse, Object handler)
            throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse reponse, Object handler,
            ModelAndView modelAndView) throws Exception {

    }

    @override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse reponse, Object handler, Exception ex)
            throws Exception {

    }
}