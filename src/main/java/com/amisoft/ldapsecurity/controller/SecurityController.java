package com.amisoft.ldapsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SecurityController {

    @GetMapping("/greeting")
    public String securityGreeting(Principal principal){
        return "LDAP Security welcomes : " + principal.getName() + "!";
    }
}
