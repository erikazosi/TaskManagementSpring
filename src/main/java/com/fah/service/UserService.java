package com.fah.service;

import com.fah.DTO.UserDTO;
import com.fah.entity.UserOld;

import java.util.List;

public interface UserService {

    void addAdmin(UserDTO userDTO);

    List<UserOld> findAll();
    UserDTO findById(int id);

    void updateUser(UserDTO userDTO);

    void deleteUser(UserOld userOld);
}
