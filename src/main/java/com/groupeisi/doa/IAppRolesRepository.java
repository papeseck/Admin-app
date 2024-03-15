package com.groupeisi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.groupeisi.entities.AppRolesEntity;

public interface IAppRolesRepository extends JpaRepository<AppRolesEntity, Integer> {
}
