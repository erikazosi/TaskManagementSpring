package com.fah.utils;

import com.fah.DTO.DashboardDTO;
import com.fah.DTO.UserDTO;
import com.fah.entity.UserOld;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {

    public static UserDTO convertEntityToDTO(UserOld userOld) {
        UserDTO userDTO= new UserDTO();
        userDTO.setUsername(userOld.getUsername());
        userDTO.setFirstName(userOld.getFirstName());
        userDTO.setLastName(userOld.getLastName());
        userDTO.setPassword(userOld.getPassword());
        userDTO.setEmail(userOld.getEmail());
        userDTO.setId(userOld.getId());

        return userDTO;
      //  String username
    }

    public static UserOld convertDTOToEntity(UserDTO userDTO) {
        UserOld userOld = new UserOld();
        userOld.setUsername(userDTO.getUsername());
        userOld.setPassword(userDTO.getPassword());
        userOld.setEmail(userDTO.getEmail());
        userOld.setFirstName(userDTO.getFirstName());
        userOld.setLastName(userDTO.getLastName());
        userOld.setId(userDTO.getId());
        return userOld;
    }

    public static List<DashboardDTO> convertToDashboardDTO(List<UserOld> userOld) {

        List<DashboardDTO> result = new ArrayList<DashboardDTO>();
        for (UserOld u : userOld) {
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
