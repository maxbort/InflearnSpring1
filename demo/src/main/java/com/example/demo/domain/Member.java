package com.example.demo.domain;

public class Member {
    private Long id;
    private String name;

    public Long getId(){
        return id;
    }

    public void setId(long l){
        this.id = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
