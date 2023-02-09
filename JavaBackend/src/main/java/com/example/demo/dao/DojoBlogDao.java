package com.example.demo.dao;

import com.example.demo.model.DojoBlog;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DojoBlogDao {
    int insertDojoBlog(UUID id, DojoBlog dojoBlog );

    default int insertDojoBlog(DojoBlog dojoBlog){
        UUID id = UUID.randomUUID();
        return insertDojoBlog(id, dojoBlog);
    }

    List<DojoBlog> selectAllDojoBlogs();

    Optional<DojoBlog> selectDojoBlogById(UUID id);

    int deleteDojoBlogById(UUID id);

    int updateDojoBlogById(UUID id, DojoBlog dojoBlog);

}
