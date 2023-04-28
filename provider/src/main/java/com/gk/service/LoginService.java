package com.gk.service;


import com.gk.entity.Admin;
import com.gk.entity.CommonResult;

public interface LoginService {
    Admin login(String username,String password);


    CommonResult test(int n);
}
