package com.fah.Dao;

import com.fah.DTO.UserDTO;
import com.fah.entity.UserOld;

import java.util.List;

public interface UserDao {

    void addUser(UserOld userOld);

    List<UserOld> findAll();

   UserDTO findById(int id);

    void updateUser(UserDTO userDTO);

    void deleteUserById(int id);
}
