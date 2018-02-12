package com.shangxuefeng.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptorOne implements HandlerInterceptor {
    public MyInterceptorOne(){
        System.out.println("MyInterceptorOne执行构造函数");
    }
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println(">>>>>>>>>>>>> preHandle <<<<<<<<<<<<<<<<");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>>>>>>>>>>> postHandle <<<<<<<<<<<<<<<<");

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println(">>>>>>>>>>>>> afterCompletion <<<<<<<<<<<<<<<<");

    }
}