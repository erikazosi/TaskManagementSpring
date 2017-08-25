package com.tms.service.impl;

import com.tms.DTO.UserDTO;
import com.tms.Dao.UserDao;
import com.tms.entity.User;
import com.tms.service.UserService;
import com.tms.utils.UserUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    public void addAdmin(UserDTO userDTO) {
        User user= UserUtils.convertDTOToEntity(userDTO);

        userDao.addUser(user);
    }

    public List<User> findAll() {

      return userDao.findAll();
    }

    public UserDTO findById(int id) {
        return userDao.findById(id);
    }

    public void updateUser(UserDTO userDTO) {
         userDao.updateUser(userDTO);
    }

    public void deleteUser(User user) {

    }


}
