package com.planet.admin.domain;

import org.springframework.stereotype.Component;

@Component("admin")
public class Admin {
    private Integer id;

    private String name;

    private String age;

public Admin(){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

   public  Admin(int id, String name, String age){
       this.id =id;
       this.name = name;
       this.age = age;
   }
}