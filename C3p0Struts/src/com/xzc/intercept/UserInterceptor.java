package com.xzc.intercept;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import java.util.Map;

/**
 * @author xzc
 * @date 2024/10/15 01 21:44
 * @description
 */
//第一种创建interceptor的方法
public class UserInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {

        //获取session
        Map<String,Object> session= ActionContext.getContext().getSession();
        //获取session中的user
        Object object= session.get("user");
        //判断session中是否有user数据
        if (object!=null){
            //有，放行
            return invocation.invoke();
        }
        //没有，重定向到login.jsp
        return "toLogin";

    }
}
