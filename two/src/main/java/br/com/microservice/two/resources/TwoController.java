package br.com.microservice.two.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TwoController {

    private static Logger logger = LoggerFactory.getLogger(TwoController.class);

    @Autowired
    private Environment env;

    @GetMapping("/healthCheck")
    public ResponseEntity<?> healthCheck() {
        logger.info("PORT = "+ env.getProperty("local.server.port"));
        return ResponseEntity.ok("Two is working");
    }
}
