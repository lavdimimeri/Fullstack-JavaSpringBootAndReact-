package com.example.demo.dao;

import com.example.demo.model.DojoBlog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("fakeDao")
public class FakeDojoBlogDataAccessService implements DojoBlogDao{

    private static List<DojoBlog> DB  = new ArrayList<>();
    @Override
    public int insertDojoBlog(int id, DojoBlog dojoBlog) {
        DB.add(new DojoBlog(id, dojoBlog.getTitle(),dojoBlog.getAuthor(),dojoBlog.getBody()));
        return 1;
    }





    @Override
    public List<DojoBlog> selectAllDojoBlogs() {
        return DB;
    }

    @Override
    public Optional<DojoBlog> selectDojoBlogById(int id) {
        return DB.stream()
                .filter(dojoBlog -> dojoBlog.getId() == id)
                .findFirst();
    }

    @Override
    public int deleteDojoBlogById(int id) {
        Optional<DojoBlog> dojoBlogMaybe=selectDojoBlogById(id);
        if (dojoBlogMaybe.isEmpty()){
            return 0;
        }else {
            DB.remove(dojoBlogMaybe.get());
            return 1;
        }
    }

    @Override
    public int updateDojoBlogById(int id, DojoBlog update) {
       return selectDojoBlogById(id)
               .map(dojoBlog -> {
                   int indexOfDojoBlogToUpdate = DB.indexOf(dojoBlog);
                   if (indexOfDojoBlogToUpdate>=0){
                       DB.set(indexOfDojoBlogToUpdate, new DojoBlog(id,update.getTitle(),update.getAuthor(),update.getBody()));
                       return 1;
                   }
                   return 0;
               })
               .orElse(0);
    }
}
