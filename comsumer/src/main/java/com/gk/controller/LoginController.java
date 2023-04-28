package com.gk.controller;

import com.gk.entity.CommonResult;
import com.gk.service.ProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {
    @Resource
    ProviderClient providerClient;

    @PostMapping("con/login")
    public CommonResult login(@RequestParam("username") String username,@RequestParam("password") String password){
        return providerClient.login(username, password);
    }
    @GetMapping("con/test")
    public CommonResult test(@RequestParam("n") int n){
        return providerClient.test(n);
    }

}
