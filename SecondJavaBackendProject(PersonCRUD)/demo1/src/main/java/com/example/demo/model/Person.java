package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
    private  Integer id;
    private  String name;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }


        public void setId(Integer id){
        this.id = id;
        }

        public void setName(String name){
        this.name = name;
        }




}
