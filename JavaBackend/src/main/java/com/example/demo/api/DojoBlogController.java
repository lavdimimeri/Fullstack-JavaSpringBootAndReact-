package com.example.demo.api;

import com.example.demo.model.DojoBlog;
import com.example.demo.service.DojoBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/v1/dojoBlog")
@RestController
public class DojoBlogController {
    private final DojoBlogService dojoBlogService;
    @Autowired
    public DojoBlogController(DojoBlogService dojoBlogService) {
        this.dojoBlogService = dojoBlogService;
    }
    @PostMapping
    public void addDojoBlog(@RequestBody DojoBlog dojoBlog){
        dojoBlogService.addDojoBlog(dojoBlog);
    }
    @CrossOrigin(origins = "*")
    @GetMapping
    public List<DojoBlog> getAllDojoBlogs(){
        return dojoBlogService.getAllDojoBlogs();
    }

    @GetMapping(path="{id}")
    public DojoBlog getDojoBlogById(@PathVariable("id") UUID id){
        return dojoBlogService.getDojoBlogById(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deleteDojoBlogById(@PathVariable("id") UUID id){
        dojoBlogService.deleteDojoBlog(id);
    }

    @PutMapping(path="{id}")
    public void updateDojoBlog(@PathVariable("id") UUID id, @RequestBody DojoBlog dojoBlogToUpdate){
        dojoBlogService.updateDojoBlog(id, dojoBlogToUpdate);
    }








}
