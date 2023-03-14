package com.example.snickare.daos;

import com.example.snickare.models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepo extends JpaRepository<Purchase,Integer> {

}
