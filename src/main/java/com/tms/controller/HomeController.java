package com.tms.controller;


import com.tms.DTO.UserDTO;
import com.tms.entity.User;
import com.tms.service.UserService;
import com.tms.service.impl.UserServiceImpl;
import com.tms.utils.UserUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller

@RequestMapping(value = "/")
public class HomeController {

    public UserService userService;

    public HomeController(UserServiceImpl userServiceImpl) {
        this.userService = userServiceImpl;
    }

    @RequestMapping(value = "/home", method = GET)
    public String Home(Model model) {


        List li = userService.findAll();
        List<UserDTO> userDTO = UserUtils.convertToDashboardDTO(li);
        model.addAttribute("list", userDTO);

        return "home";
    }





}
