package com.example.snickare.daos;

import com.example.snickare.models.MyService;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepo extends CrudRepository<MyService, Integer> {

}
