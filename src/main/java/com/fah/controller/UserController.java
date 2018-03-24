package com.fah.controller;


import com.fah.DTO.UserDTO;
import com.fah.service.UserService;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService UserServiceImpl) {
        this.userService = UserServiceImpl;
    }


    @RequestMapping(value = "/register", method = GET)
    public ModelAndView showSignupForm(ModelMap model) {
        model.addAttribute(new UserDTO());

        return new ModelAndView("signup","" ,new UserDTO());
    }


    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(UserDTO userDTO, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "home";
        }

        userService.addAdmin(userDTO);

        model.addAttribute("success", "Dear " + userDTO.getFirstName() + " , your Registration completed successfully");


        return "redirect:/home";


    }

    @RequestMapping(value = "/edit/{userId}", method = GET)
    public ModelAndView showEditForm(UserDTO userDTO, @PathVariable("userId") int userId) {


        UserDTO userDTo = userService.findById(userId);


        return new ModelAndView("edit", "user", userDTo);
    }

    @RequestMapping(value = "/edit/{userId}", method = POST)
    public ModelAndView processEditUser(UserDTO userDTO, @PathVariable("userId") int userId) {


        UserDTO userDTo = userService.findById(userId);


        return new ModelAndView("edit", "user", userDTo);
    }


}
