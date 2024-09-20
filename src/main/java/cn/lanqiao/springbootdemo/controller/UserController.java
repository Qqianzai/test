package cn.lanqiao.springbootdemo.controller;

import cn.lanqiao.springbootdemo.entity.User;
import cn.lanqiao.springbootdemo.mapper.UserMapper;
import cn.lanqiao.springbootdemo.util.Result;
import cn.lanqiao.springbootdemo.vo.QueryUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/aaa")
    public Result query(){
    return Result.success(userMapper.queryUserList());
    }
    @PostMapping("/bbb")
    public Result query2(@RequestBody User user) {
        return Result.success(userMapper.query2(user));
    }

}
