package com.fah.controller;

import com.fah.utils.ConnectDb;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;

@Getter
public class Test {

    private String name;
    private String address;

    public void setName(String name) {
        this.name = "tset mthod";
    }

}
