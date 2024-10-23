package com.xzc.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xzc.domain.User;
import com.xzc.service.UserService;

import java.util.UUID;


/**
 * @author xzc
 * @date 2024/10/10 15 25:31
 * @description
 */
public class UserAction extends ActionSupport  implements ModelDriven<User> {
    public User user = new User();

    public String login() throws Exception {


        UserService userService = new UserService();


        boolean success = userService.findUser(user);
        if(success){
            ActionContext.getContext().getSession().put("user",user);
            return "toIndex";
        }
        else {
            ActionContext.getContext().put("error","用户名或密码错误!!!");
            return "toLogin";
        }
    }

    public String register() throws Exception {


//        user.setId(UUID.randomUUID().toString());

        UserService userService = new UserService();
        userService.addUser(user);

        return "toLogin";
    }


    @Override
    public User getModel() {
        return user;
    }
}
