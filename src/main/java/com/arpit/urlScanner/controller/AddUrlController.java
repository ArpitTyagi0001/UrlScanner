package com.arpit.urlScanner.controller;

import com.arpit.urlScanner.dto.UserDto;
import com.arpit.urlScanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUrlController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUrl")
    public UserDto addUrl(@RequestBody UserDto userDto){
        return userService.addUrl(userDto);
    }
}
