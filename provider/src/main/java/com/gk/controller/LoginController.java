package com.gk.controller;

import com.gk.dao.LoginDao;
import com.gk.entity.Admin;
import com.gk.entity.CommonResult;
import com.gk.service.LoginService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RefreshScope //实现nacos配置自动更新
public class LoginController {
    @Resource
    LoginService loginService;

    @Value("${server.port}")
    private Integer port;

    @Value("${spring.datasource.username}")
    private String u;

    @PostMapping("user/login")
    public CommonResult login(@RequestParam("username") String username, @RequestParam("password") String password){

        Admin user = loginService.login(username,password);
        if (user!=null){
            return new CommonResult(200,"成功登录",user);
        }

            return new CommonResult(400,"登录失败",null);


    }

    @GetMapping("user/test")
    public CommonResult test(@RequestParam("n") int n){
        return loginService.test(n);
    }
}
