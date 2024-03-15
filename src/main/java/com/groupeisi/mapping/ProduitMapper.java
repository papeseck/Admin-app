package com.groupeisi.mapping;

import org.mapstruct.Mapper;
import com.groupeisi.dto.Produit;
import com.groupeisi.entities.ProduitEntity;

@Mapper
public interface ProduitMapper {
    Produit toProduit(ProduitEntity produitEntity);
    ProduitEntity fromProduit(Produit produit);
}
