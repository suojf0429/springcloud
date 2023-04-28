package com.gk.service;

import com.gk.entity.CommonResult;
import com.gk.service.fallback.ProviderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider",fallback = ProviderServiceFallback.class)
public interface ProviderClient {
    @PostMapping("user/login")
     CommonResult login(@RequestParam("username") String username, @RequestParam("password") String password);

    @GetMapping("user/test")
     CommonResult test(@RequestParam("n") int n);
}

