package com.gk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderloginApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderloginApplication.class, args);
    }
}
