package com.groupeisi.service;

import com.groupeisi.doa.IAppRolesRepository;
import com.groupeisi.entities.AppRolesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppRolesServiceImpl implements AppRolesService {

    @Autowired
    private IAppRolesRepository rolesRepository;

    @Override
    public AppRolesEntity saveRole(AppRolesEntity role) {
        return rolesRepository.save(role);
    }

    @Override
    public AppRolesEntity getRoleById(int id) {
        return rolesRepository.findById(id).orElse(null);
    }

    @Override
    public List<AppRolesEntity> getAllRoles() {
        return rolesRepository.findAll();
    }

}
