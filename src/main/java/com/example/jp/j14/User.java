package com.example.jp.j14;

import java.util.Objects;

public record User(Integer id, String password) {

    public static String a="A";
    public static String getA(){
        return a;
    };

    public User{
        Objects.requireNonNull(id);
        Objects.requireNonNull(password);
    }
    public User(int id){
        this(id,"");
    }

//    public User(int id,String password){
//        this.id=id;
//        this.password=password;
//    }
}
