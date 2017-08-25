package com.tms.Dao.impl;


import com.tms.DTO.UserDTO;
import com.tms.Dao.UserDao;
import com.tms.entity.User;
import com.tms.repository.UserRepo;
import com.tms.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(value = "transactionManager")
public class UserDaoImpl implements UserDao {


    @Autowired
    private UserRepo userRepo;

    @PersistenceContext
    private EntityManager em;

    public void addUser(User user) {

        em.persist(user);

    }


    @Override
    public List<User> findAll() {
        return userRepo.findAll();

    }


    @Override
    public UserDTO findById(int id) {


        User user = userRepo.findOne((long) id);
        UserDTO userDTO = UserUtils.convertEntityToDTO(user);
        return userDTO;


    }

    public void updateUser(UserDTO userDTO) {
        em.createQuery("update User set username=" + userDTO.getUsername() + " where id=" + userDTO.getId()).executeUpdate();


    }

    @Override
    public void deleteUserById(int id) {


        userRepo.delete((long) id);
    }


}


