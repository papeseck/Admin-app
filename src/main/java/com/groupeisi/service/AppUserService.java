package com.groupeisi.service;

import com.groupeisi.entities.AppUserEntity;
import java.util.List;

public interface AppUserService {
    AppUserEntity saveUser(AppUserEntity user);
    AppUserEntity getUserById(int id);
    List<AppUserEntity> getAllUsers();
    List<AppUserEntity> getUsersByRole(String roleName);

}
