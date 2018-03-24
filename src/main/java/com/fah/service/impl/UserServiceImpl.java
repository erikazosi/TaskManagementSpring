package com.fah.service.impl;

import com.fah.DTO.UserDTO;
import com.fah.Dao.UserDao;
import com.fah.entity.UserOld;
import com.fah.service.UserService;
import com.fah.utils.UserUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    public void addAdmin(UserDTO userDTO) {
        UserOld userOld = UserUtils.convertDTOToEntity(userDTO);

        userDao.addUser(userOld);
    }

    public List<UserOld> findAll() {

      return userDao.findAll();
    }

    public UserDTO findById(int id) {
        return userDao.findById(id);
    }

    public void updateUser(UserDTO userDTO) {
         userDao.updateUser(userDTO);
    }

    public void deleteUser(UserOld userOld) {

    }


}
