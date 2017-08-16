package com.tms.controller;


import com.tms.DTO.UserDTO;
import com.tms.entity.User;
import com.tms.service.UserService;
import com.tms.service.impl.UserServiceImpl;
import com.tms.utils.UserUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/user")
public class UserController {
    public final UserService userService;

    public UserController() {
        // todo improve
        this.userService = new UserServiceImpl();
    }


    @RequestMapping(value="/register", method=GET)
    public String showSignupForm() {
        return "signup";
    }


    @RequestMapping(value = "/register", method=POST)
    public String processRegistration(User users) {

        UserDTO userDTO = UserUtils.convertRequestToDTO(users);
        userService.addAdmin(userDTO);
        return "redirect:/home";


    }

}
