package com.groupeisi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.groupeisi.entities.ProduitEntity;

public interface IProduitRepository extends JpaRepository<ProduitEntity, Integer> {
}
