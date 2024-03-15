package com.groupeisi.mapping;

import org.mapstruct.Mapper;
import com.groupeisi.dto.AppRoles;
import com.groupeisi.entities.AppRolesEntity;

@Mapper
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
