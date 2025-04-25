package aiss.bitbucketminer.controller;

import aiss.bitbucketminer.model.User;
import aiss.bitbucketminer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/bitbucket/users/{username}")
    public User getUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

    @PostMapping("/bitbucket/users/{username}")
    public User postUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

}
