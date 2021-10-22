package br.com.microservice.one.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "app-two", url = "localhost:8002", path = "/api/healthCheck")
public interface TwoFeignClient {

    @GetMapping
    ResponseEntity<String> healthCheck();
}
