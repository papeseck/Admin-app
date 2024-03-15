package com.groupeisi.service;

import com.groupeisi.dto.Produit;
import com.groupeisi.entities.ProduitEntity;
import java.util.List;

public interface ProduitService {
    ProduitEntity saveProduit(ProduitEntity produit);
    ProduitEntity getProduitById(int id);
    List<ProduitEntity> getAllProduits();

    List<Produit> getAllProduitsDto();
}

