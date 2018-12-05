package com.test.okta.oktademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
@EnableOAuth2Sso
@SpringBootApplication
public class OktademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktademoApplication.class, args);
    }

    @GetMapping("/")
    public String echoTheUsersEmailAddress(Principal principal) {
        return "Hey there! Your email address is: " + principal.getName();
    }
}