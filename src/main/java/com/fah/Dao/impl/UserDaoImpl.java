package com.fah.Dao.impl;


import com.fah.DTO.UserDTO;
import com.fah.Dao.UserDao;
import com.fah.entity.UserOld;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {


    /*@Autowired
    private UserRepo userRepo;*/

    public void addUser(UserOld userOld) {

        //em.persist(userOld);

    }


    @Override
    public List<UserOld> findAll() {
        //return userRepo.findAll();
        return new ArrayList<UserOld>();
    }


    @Override
    public UserDTO findById(int id) {


        /*UserOld user = null;
        UserDTO userDTO = UserUtils.convertEntityToDTO(user);
        return userDTO;*/
        return new UserDTO();

    }

    public void updateUser(UserDTO userDTO) {
        //em.createQuery("update UserOld set username=" + userDTO.getUsername() + " where id=" + userDTO.getId()).executeUpdate();


    }

    @Override
    public void deleteUserById(int id) {


        //userRepo.delete((long) id);
    }


}


