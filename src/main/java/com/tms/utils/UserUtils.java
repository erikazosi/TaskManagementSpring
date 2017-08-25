package com.tms.utils;

import com.tms.DTO.DashboardDTO;
import com.tms.DTO.UserDTO;
import com.tms.entity.User;
import com.tms.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {

    public static UserDTO convertEntityToDTO(User user) {
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

    public static List<DashboardDTO> convertToDashboardDTO(List<User> user) {

        List<DashboardDTO> result = new ArrayList<DashboardDTO>();
        for (User u : user) {
            DashboardDTO dash = new DashboardDTO();
            dash.setFirstName(u.getFirstName());
            dash.setEmail(u.getEmail());
            dash.setId(u.getId());
            dash.setLastName(u.getLastName());
            dash.setPassword(u.getPassword());
            dash.setUsername(u.getUsername());
            result.add(dash);
        }
    return result;
    }

}
