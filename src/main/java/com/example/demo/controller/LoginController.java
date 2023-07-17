package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
            Model model) {
        List<User> users = userMapper.get();
        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassWord().equals(password))
                return "redirect:/manage";
        }
        model.addAttribute("msg", "用户名或密码错误！");
        return "index";
    }

}
