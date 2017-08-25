package com.tms.controller;

import com.tms.entity.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RestController
public class RestApiController {
    //@ResponseBody //required if the class is not annotated with @RestController
    @GetMapping(value = "/users")
    public ArrayList<User> users() {

        System.out.println("here");
        User user = new User();
        user.setUsername("erika");

        ArrayList<User> a = new ArrayList<User>();
        a.add(user);
        return a;

    }


    @RequestMapping(value = "/users/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> updateUser(@PathVariable("name") String name, @RequestBody User user) {

        System.out.println("put");
        System.out.println(name);
        System.out.println("Username: " + user.getUsername() + " Id: " + user.getId());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("key1", "value1");
        httpHeaders.add("key2", "value2");

        return new ResponseEntity<Boolean>(true, HttpStatus.NOT_FOUND);


    }

    @RequestMapping(value = "/users", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> postUser(@RequestBody User user) {

        System.out.println("Username: " + user.getUsername() + " Id: " + user.getId());

        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }

    public ModelAndView model() {

        ModelAndView model = new ModelAndView("");
        model.addObject("headerMessage", "ok");



        return model;
    }
}
