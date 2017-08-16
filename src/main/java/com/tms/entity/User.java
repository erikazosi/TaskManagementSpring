package com.tms.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name="user")
public class User{
    @Id
    @GeneratedValue
    int id;
    String firstName;
    String lastName;
    String username;
    String password;
    String email;

}
