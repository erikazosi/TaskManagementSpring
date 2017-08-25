package com.tms.service;

import com.tms.DTO.UserDTO;
import com.tms.entity.User;

import java.util.List;

public interface UserService {

    void addAdmin(UserDTO userDTO);

    List<User> findAll();
    UserDTO findById(int id);

    void updateUser(UserDTO userDTO);

    void deleteUser(User user);
}
