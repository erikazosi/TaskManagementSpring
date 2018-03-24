package com.fah.DTO;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable  {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;

}
