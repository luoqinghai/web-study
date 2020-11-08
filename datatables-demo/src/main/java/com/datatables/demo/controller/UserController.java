package com.datatables.demo.controller;

import com.datatables.demo.bean.User;
import com.datatables.demo.common.res.R;
import com.datatables.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/list")
    public R list(User user) {
        R r = userService.getPageUserList(user);
        return r;
    }

    @PostMapping("/add")
    public String add(User user) {
        try {
            userService.insert(user);
            return "添加成功";
        }catch (Exception e){
            e.printStackTrace();
            return "添加失败";
        }
    }

    @GetMapping("/delete")
    public String delete(Integer userId) {
        try {
            userService.delete(userId);
            return "删除成功";
        }catch (Exception e){
            e.printStackTrace();
            return "删除失败";
        }
    }

    @GetMapping("/get")
    public User getById(Integer userId) {
        return userService.getById(userId);
    }

    @PostMapping("/update")
    public String update(User user) {
        try {
            userService.updateById(user);
            return "修改成功";
        }catch (Exception e){
            e.printStackTrace();
            return "修改失败";
        }
    }
}
