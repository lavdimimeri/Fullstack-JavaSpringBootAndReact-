package com.example.snickare.services;

import com.example.snickare.daos.PurchaseRepo;
import com.example.snickare.models.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseService {
@Autowired
    PurchaseRepo purchaseRepo;

   public Purchase getPurchaseById(int id){
     return purchaseRepo.findById(id).get();
   }

   public List<Purchase> getAllPurchases(){
       List<Purchase> purchases = new ArrayList<>();
       purchaseRepo.findAll().forEach(purchase -> purchases.add(purchase));
       return purchases;
   }

   public void savePurchase(Purchase purchase){
       purchaseRepo.save(purchase);
   }

    public void deletePurchaseById(int id){
       purchaseRepo.deleteById(id);
    }

    public void updatePurchase(Purchase purchaseUpdated){
       purchaseRepo.save(purchaseUpdated);
    }
}
