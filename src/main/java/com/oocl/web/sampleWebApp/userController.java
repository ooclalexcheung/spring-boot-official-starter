package com.oocl.web.sampleWebApp;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;


@RestController
@RequestMapping("/users")
public class userController {
    @GetMapping(path = "/{username}",  produces = {"application/json"})
    public ResponseEntity<String> get(@PathVariable int userId) {
        return ResponseEntity.ok("hi");
    }

    @PostMapping(produces = {"application/json"})
    public ResponseEntity<String> add(@RequestBody user user) {
        return ResponseEntity.created(URI.create("/users/"+user.getId())).body("hi");
    }
}
