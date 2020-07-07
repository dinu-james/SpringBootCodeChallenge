package com.telstra.codechallenge.controller;

import com.telstra.codechallenge.DTO.User;
import com.telstra.codechallenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GitController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/oldUserAccounts/{noOfAccounts}", method = RequestMethod.GET)
    public List<User> oldUserAccounts(@PathVariable("noOfAccounts") long noOfAccounts) {
        return userService.getOldUserAccounts(noOfAccounts);
    }
}

