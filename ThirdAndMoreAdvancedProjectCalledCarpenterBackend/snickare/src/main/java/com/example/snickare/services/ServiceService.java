package com.example.snickare.services;

import com.example.snickare.daos.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.snickare.models.MyService;


import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceService {

@Autowired
  ServiceRepo serviceRepo;

   public List<MyService> getAllMyServices(){
       List<MyService> myServices =new ArrayList<>();
serviceRepo.findAll().forEach(myService -> myServices.add(myService));
return myServices;
   }


   public void saveService(MyService myService){
    serviceRepo.save(myService);
   }

  public MyService getMyServiceById(int id){
       return serviceRepo.findById(id).get();
  }

  public void deleteMyService(int id){
     serviceRepo.deleteById(id);
  }

public void updateMyService(MyService myServiceUpdate){
       serviceRepo.save(myServiceUpdate);
}



  







}
