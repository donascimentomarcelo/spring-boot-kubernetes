package br.com.microservice.one.resources;

import br.com.microservice.one.feignclients.TwoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class OneController {

    @Autowired
    private TwoFeignClient twoFeignClient;

    @GetMapping("/healthCheck")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok("One is working");
    }

    @GetMapping("/get")
    public ResponseEntity<?> getHealthCheck() {
        return ResponseEntity.ok(twoFeignClient.healthCheck().getBody());
    }
}
