package com.gk.service.fallback;

import com.gk.entity.CommonResult;
import com.gk.service.ProviderClient;
import org.springframework.stereotype.Component;

@Component
public class ProviderServiceFallback implements ProviderClient {
    @Override
    public CommonResult login(String username, String password) {
        return new CommonResult(401,"调用错误服务降级",null);
    }

    @Override
    public CommonResult test(int n) {
        return new CommonResult(401,"调用错误服务降级",null);
    }
}
