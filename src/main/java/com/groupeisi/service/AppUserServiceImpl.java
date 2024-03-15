package com.groupeisi.service;

import com.groupeisi.doa.IAppUserRepository;
import com.groupeisi.entities.AppUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private IAppUserRepository userRepository;


    @Override
    public AppUserEntity saveUser(AppUserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public AppUserEntity getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<AppUserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<AppUserEntity> getUsersByRole(String roleName) {
        return userRepository.findByAppRoleEntities_Nom(roleName);
    }

    // Ajoutez d'autres méthodes si nécessaire
}
