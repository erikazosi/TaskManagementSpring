package com.tms.Dao;

import com.tms.DTO.UserDTO;
import com.tms.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> findAll();

   UserDTO findById(int id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(int id);
}
