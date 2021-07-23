package com.auth.oauthresource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/users")
    public String findAllUser() {
        return "나와랏!!";
    }
}
