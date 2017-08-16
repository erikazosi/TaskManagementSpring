package com.tms.service.impl;

import com.tms.DTO.UserDTO;
import com.tms.Dao.UserDao;
import com.tms.Dao.impl.UserDaoImpl;
import com.tms.entity.User;
import com.tms.service.UserService;
import com.tms.utils.UserUtils;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl() {
        this.userDao = new UserDaoImpl();
    }

    public void addAdmin(UserDTO userDTO) {
        User user= UserUtils.convertDTOToEntity(userDTO);

        userDao.addAdmin(user);
    }
}
