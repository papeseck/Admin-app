package com.groupeisi.controller;

import com.groupeisi.entities.AppRolesEntity;
import com.groupeisi.service.AppRolesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class AppRolesController {

    @Autowired
    private AppRolesServiceImpl rolesService;

    @PostMapping("/add")
    public AppRolesEntity addRole(@RequestBody AppRolesEntity role) {
        return rolesService.saveRole(role);
    }

    @GetMapping("/{id}")
    public AppRolesEntity getRoleById(@PathVariable int id) {
        return rolesService.getRoleById(id);
    }

    @GetMapping("/all")
    public List<AppRolesEntity> getAllRoles() {
        return rolesService.getAllRoles();
    }

}
