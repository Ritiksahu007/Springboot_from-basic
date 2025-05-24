package com.Springboot_by_teleusko.First;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Component ;

@Component
public class Dev{

    @Autowired
    private Laptop  lappy;
    public void build(){

        lappy.compile();
        System.out.println("jay shree ram");
    }
}
