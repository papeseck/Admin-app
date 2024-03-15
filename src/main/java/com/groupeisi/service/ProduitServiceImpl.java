package com.groupeisi.service;

import com.groupeisi.doa.IProduitRepository;
import com.groupeisi.dto.Produit;
import com.groupeisi.entities.ProduitEntity;
import com.groupeisi.mapping.ProduitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private IProduitRepository produitRepository;


    @Autowired
    private ProduitMapper produitMapper;

    @Override
    public ProduitEntity saveProduit(ProduitEntity produit) {
        return produitRepository.save(produit);
    }

    @Override
    public ProduitEntity getProduitById(int id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public List<ProduitEntity> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public List<Produit> getAllProduitsDto() {
        List<ProduitEntity> produitsEntities = produitRepository.findAll();
        return produitsEntities.stream()
                .map(produitMapper::toProduit)
                .collect(Collectors.toList());
    }

}
