package com.tms.utils;

import com.tms.DTO.UserDTO;
import com.tms.entity.User;

public class UserUtils {

    public static UserDTO convertRequestToDTO(User user) {
        UserDTO userDTO= new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setPassword(user.getPassword());
        userDTO.setEmail(user.getEmail());
        userDTO.setId(user.getId());

        return userDTO;
      //  String username
    }

    public static User convertDTOToEntity(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setId(userDTO.getId());
        return user;
    }
}
