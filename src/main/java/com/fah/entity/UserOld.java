package com.fah.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL) //only shows non null values
@JsonPropertyOrder({"email","firstname"})//shows email first
@JsonIgnoreProperties({"lastName"})//doesn't show value of last name
@Entity
@Table(name = "user")
public class UserOld {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String firstName;
    private String lastName;
   // @JsonProperty("username") //changes firstName to UserOld FirstName
    private String username;
    private String password;
    private String email;

}
