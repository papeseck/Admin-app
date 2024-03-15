package com.groupeisi.mapping;

import org.mapstruct.Mapper;
import com.groupeisi.dto.AppUser;
import com.groupeisi.entities.AppUserEntity;

@Mapper
public interface AppUserMapper {
    AppUser toAppUser(AppUserEntity appUserEntity);
    AppUserEntity fromAppUser(AppUser appUser);
}
