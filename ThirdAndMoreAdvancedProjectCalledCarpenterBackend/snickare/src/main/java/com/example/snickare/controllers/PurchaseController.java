package com.example.snickare.controllers;

import com.example.snickare.models.Purchase;
import com.example.snickare.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/purchases")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;


    @PostMapping(path="/add")
    public void addPurchase(@RequestBody Purchase purchase){
        purchaseService.savePurchase(purchase);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Purchase> getAllPurchases() {
        // This returns a JSON or XML with the users
        return purchaseService.getAllPurchases();
    }

    @GetMapping(path="/all/{id}")
    public Purchase getPurchaseById(@PathVariable("id") int id){
        return purchaseService.getPurchaseById(id);
    }

    @DeleteMapping(path="/all/{id}")
    public void deletePurchaseById(@PathVariable("id") int id){
        purchaseService.deletePurchaseById(id);
    }


    @PutMapping(path="/all/{id}")
    public void updatePurchase(@RequestBody Purchase purchase){

        purchaseService.updatePurchase(purchase);
    }

}
