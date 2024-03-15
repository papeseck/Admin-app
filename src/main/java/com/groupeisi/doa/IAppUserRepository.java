package com.groupeisi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.groupeisi.entities.AppUserEntity;

import java.util.List;

public interface IAppUserRepository extends JpaRepository<AppUserEntity, Integer> {
    AppUserEntity findByEmail(String email);
    List<AppUserEntity> findByAppRoleEntities_Nom(String roleName);
}
