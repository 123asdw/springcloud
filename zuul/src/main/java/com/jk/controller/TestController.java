package com.jk.controller;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import io.micrometer.core.instrument.util.StringUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: springcloud-feign
 * @description:
 * @author: 刘洋朋
 * @create: 2021-01-08 20:19
 */
@Component
public class TestController extends ZuulFilter {
    /**
     * * pre：路由之前
     * * routing：路由之时
     * * post： 路由之后
     * * error：发送错误调用
     */

    private final static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(TestController.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String requestUri = request.getRequestURI();
        LOGGER.info("请求的URI：{}",requestUri);
        if(requestUri.equals("/api-a/emp/toLogin")){
            return false;
        }
        if(requestUri.contains("/api-a/js")){
            return false;
        }
        if(requestUri.contains("/api-a/emp/login")){
            return false;
        }
        /*RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("user");
        if(StringUtils.isNotEmpty(name)){
            return true;
        }*/
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("走过滤器‐‐‐‐‐‐‐‐");
        /*HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String requestUri = request.getRequestURI();
        LOGGER.info("请求的URI：{}",requestUri);*/
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("user");
        System.out.println("用户名："+name);
        if(StringUtils.isNotEmpty(name)){
            //用户名不为空
            ctx.setSendZuulResponse(true);
            System.out.println("没有拦截");
        }else{
            //用户名为空
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(404);
            System.out.println("拦截请求");
        }
        return null;
    }
}
