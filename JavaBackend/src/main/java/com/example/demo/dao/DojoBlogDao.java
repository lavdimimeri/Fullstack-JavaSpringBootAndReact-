package com.example.demo.dao;

import com.example.demo.model.DojoBlog;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public interface DojoBlogDao {
    int insertDojoBlog(int id, DojoBlog dojoBlog );

    default int insertDojoBlog(DojoBlog dojoBlog){
        Random random = new Random();
        int upperbound = 25;

        int id = random.nextInt(upperbound);
        return insertDojoBlog(id, dojoBlog);
    }

    List<DojoBlog> selectAllDojoBlogs();

    Optional<DojoBlog> selectDojoBlogById(int id);

    int deleteDojoBlogById(int id);

    int updateDojoBlogById(int id, DojoBlog dojoBlog);

}
