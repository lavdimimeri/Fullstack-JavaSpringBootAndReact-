package com.example.demo.service;

import com.example.demo.dao.DojoBlogDao;
import com.example.demo.model.DojoBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DojoBlogService {

    private final DojoBlogDao dojoBlogDao;

    @Autowired
    public DojoBlogService(@Qualifier("fakeDao") DojoBlogDao dojoBlogDao){
        this.dojoBlogDao=dojoBlogDao;
    }

    public int addDojoBlog(DojoBlog dojoBlog){
        return dojoBlogDao.insertDojoBlog(dojoBlog);
    }

    public List<DojoBlog> getAllDojoBlogs(){
        return dojoBlogDao.selectAllDojoBlogs();
    }

    public Optional<DojoBlog> getDojoBlogById(int id){
        return dojoBlogDao.selectDojoBlogById(id);
    }

    public int deleteDojoBlog(int id){
        return dojoBlogDao.deleteDojoBlogById(id);
    }

    public int updateDojoBlog(int id, DojoBlog dojoBlog){
        return dojoBlogDao.updateDojoBlogById(id, dojoBlog);
    }

}
