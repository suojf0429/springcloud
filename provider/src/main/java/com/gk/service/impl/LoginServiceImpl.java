package com.gk.service.impl;

import com.gk.dao.LoginDao;
import com.gk.entity.Admin;
import com.gk.entity.CommonResult;
import com.gk.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    LoginDao loginDao;

    @Override
    public Admin login(String username,String password) {
        return loginDao.findAdmin(username,password);
    }

    @Override
    public CommonResult test(int n) {
        return new CommonResult(200,"成功",n);
    }
}
