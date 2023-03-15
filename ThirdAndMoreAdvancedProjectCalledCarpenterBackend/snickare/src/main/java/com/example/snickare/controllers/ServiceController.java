package com.example.snickare.controllers;

import com.example.snickare.daos.ServiceRepo;
import com.example.snickare.models.MyService;
import com.example.snickare.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This means that this class is a Controller
@RequestMapping(path="/services")
public class ServiceController {
@Autowired
   private ServiceRepo serviceRepo;

@Autowired
    ServiceService serviceService;




    @GetMapping(path="/all")
     public List<MyService> getAllMyServices(){
        return serviceService.getAllMyServices();
    }

    @PostMapping(path="/add")
    public void addMyService(@RequestBody MyService myService){
        serviceService.saveService(myService);
    }

    @GetMapping(path="/all/{id}")
    public MyService getMyServiceById(@PathVariable("id") int id){
        return serviceService.getMyServiceById(id);
    }

    @DeleteMapping(path="/all/{id}")
    public void deleteMyServiceById(@PathVariable("id") int id){
        serviceService.deleteMyService(id);
    }

    @PutMapping(path="/all/{id}")
    public void updateMyService(@RequestBody MyService myService){
      serviceService.updateMyService(myService);
    }



}


