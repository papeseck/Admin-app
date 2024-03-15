package com.groupeisi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.groupeisi.entities.AppUserEntity;

public interface IAppUserRepository extends JpaRepository<AppUserEntity, Integer> {
    AppUserEntity findByEmail(String email);
}
