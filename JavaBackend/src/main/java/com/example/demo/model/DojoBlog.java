package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class DojoBlog {


    private final int id;

    private final String title;

    private final String author;

    private final String body;

    public DojoBlog(@JsonProperty("ID") int id, @JsonProperty("title") String title,@JsonProperty("author") String author,@JsonProperty("body") String body) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }



}
