package com.groupeisi.controller;

import com.groupeisi.entities.ProduitEntity;
import com.groupeisi.service.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produits")
public class ProduitController {

    @Autowired
    private ProduitServiceImpl produitService;

    @PostMapping("/ajouter")
    public ProduitEntity ajouterProduit(@RequestBody ProduitEntity produit) {
        return produitService.saveProduit(produit);
    }

    @GetMapping("/{id}")
    public ProduitEntity getProduitById(@PathVariable int id) {
        return produitService.getProduitById(id);
    }

    @GetMapping("/liste")
    public List<ProduitEntity> getAllProduits() {
        return produitService.getAllProduits();
    }


}

