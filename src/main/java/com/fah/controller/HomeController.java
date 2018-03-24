package com.fah.controller;


import com.fah.DTO.UserDTO;
import com.fah.service.UserService;
import com.fah.service.impl.UserServiceImpl;
import com.fah.utils.UserUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
