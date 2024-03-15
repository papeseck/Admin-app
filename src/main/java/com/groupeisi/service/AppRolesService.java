package com.groupeisi.service;

import com.groupeisi.entities.AppRolesEntity;
import java.util.List;

public interface AppRolesService {
    AppRolesEntity saveRole(AppRolesEntity role);
    AppRolesEntity getRoleById(int id);
    List<AppRolesEntity> getAllRoles();

}
