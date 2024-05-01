package com.polarbookshop.catalogservicedev;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @GetMapping
    public ResponseEntity<String> sayingHello(){
        log.info("Trying to say hello through the say hello api");
        return ResponseEntity.ok("Hello to you to friend.");
    }
}
