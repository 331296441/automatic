package com.wood.automatic.common.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

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