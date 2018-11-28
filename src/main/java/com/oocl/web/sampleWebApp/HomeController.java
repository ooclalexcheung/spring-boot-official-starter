package com.oocl.web.sampleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/users")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
    @GetMapping(path = "/{username}",  produces = {"application/json"})
    public user setuser(@PathVariable String username) {

        user user = user.setUsername(username);
        return user;
    }
}