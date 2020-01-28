package com.syne.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.syne.api.model.User;
import com.syne.api.service.impl.UserServiceImpl;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserInfo(@PathVariable(value = "userId") String userId) {
        return userService.getUserInfo(userId);
    }
    
//    @RequestMapping(value = "/user/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//    public User saveUserInfo(@RequestBody(required = "true") User user) {
//        return userService.saveUserInfo(user);
//    }
    
    @PostMapping("/saveuser")
    public void saveUserInfo(@RequestBody User user) {
      userService.saveUserInfo(user);
    }

}
