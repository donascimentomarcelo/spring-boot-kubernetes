package br.com.microservice.one.resources;

import br.com.microservice.one.feignclients.ThreeFeignClient;
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

    @Autowired
    private ThreeFeignClient threeFeignClient;

    @GetMapping("/healthCheck")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok("One is working");
    }

    @GetMapping("/getTwo")
    public ResponseEntity<?> getTwo() {
        return ResponseEntity.ok(twoFeignClient.healthCheck().getBody());
    }

    @GetMapping("/getThree")
    public ResponseEntity<?> getThree() {
        return ResponseEntity.ok(threeFeignClient.healthCheck().getBody());
    }
}
