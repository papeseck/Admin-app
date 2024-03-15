package com.groupeisi.controller;

import com.groupeisi.entities.AppUserEntity;
import com.groupeisi.service.AppUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AppUserController {

    @Autowired
    private AppUserServiceImpl userService;

    @PostMapping("/add")
    public AppUserEntity addUser(@RequestBody AppUserEntity user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public AppUserEntity getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/all")
    public List<AppUserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

}
