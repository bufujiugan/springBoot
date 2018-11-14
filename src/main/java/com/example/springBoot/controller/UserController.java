package com.example.springBoot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springBoot.domain.user.User;
import com.example.springBoot.service.user.UserService;

/**
 * 测试与用户表链接
 * @author 于志强
 *
 * 2018年11月13日 下午2:45:59
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        return user;
    }

}