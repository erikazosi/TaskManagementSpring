package com.fah.controller;

import FothabyCompany.FothabyApp.User;
import com.fah.entity.UserOld;
import com.fah.utils.ConnectDb;
import com.matisse.MtDatabase;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

@RestController
public class RestApiController {
    //@ResponseBody //required if the class is not annotated with @RestController

    @GetMapping(value = "/users")
    public ArrayList<UserOld> users() {

        System.out.println("here");
        UserOld userOld = new UserOld();
        userOld.setUsername("erika");

        ArrayList<UserOld> a = new ArrayList<UserOld>();
        a.add(userOld);
        return a;

    }

    @GetMapping(value = "/test")
    public String test() {
        Connection connection = null;
        try {
            /*connection = ConnectDb.getConn();

            String findUser = "select * from FothaByCompany.FothabyApp.UserOld";
            Statement stm = connection.createStatement();
            ResultSet res = stm.executeQuery(findUser);
            if (res.next()) {
                System.out.println(res.getString(5));
            }
            connection.close();*/

            MtDatabase db = new MtDatabase("localhost", "fotheby");

            db.open();
            db.startTransaction();

            User user = new User(db);
            user.setFirstName("hari");
            user.setLastName("sharma");
            user.setUsername("hari");
            user.setPassword("hari123");
            user.setEmail("sadlf@sdf.com");
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            user.setCreatedDate(gregorianCalendar);
            user.setUserType("Admin");

            User user2 = new User(db);
            user2.setFirstName("ram");
            user2.setLastName("kumar");
            user2.setUsername("ram");
            user2.setPassword("ram123");
            user2.setEmail("sadlf@sdf.com");
            gregorianCalendar = new GregorianCalendar();
            user2.setCreatedDate(gregorianCalendar);
            user2.setUserType("Admin");

            db.commit();
            db.close();

        }catch(Exception e){
            /*try {
                connection.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }*/
            e.printStackTrace();
        }

        return "end";

    }

    @GetMapping(value = "/test2")
    public String test2() {
        Connection connection = null;
        try {

            MtDatabase db = new MtDatabase("localhost", "fotheby");

            db.open();
            db.startVersionAccess();

            Iterator<User> iter = User.instanceIterator(db);

            while(iter.hasNext()){
                User user = iter.next();
                System.out.println(user.getUsername());
            }

            db.endVersionAccess();
            db.close();

        }catch(Exception e){
            /*try {
                connection.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }*/
            e.printStackTrace();
        }

        return "end";

    }

    @GetMapping(value = "/test3")
    public String test3() {
        Connection connection = null;
        try {
            connection = ConnectDb.getConn();

            String findUser = "select * from FothaByCompany.FothabyApp.User";
            Statement stm = connection.createStatement();
            ResultSet res = stm.executeQuery(findUser);
            while (res.next()) {
                System.out.println(res.getString(3));
            }
            connection.close();

        }catch(Exception e){
            try {
                connection.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
            e.printStackTrace();
        }

        return "end";

    }

    @GetMapping(value = "/test4")
    public String test4() {
        Connection connection = null;
        try {
            connection = ConnectDb.getConn();
            String findUser = "SELECT REF(u) FROM FothaByCompany.FothabyApp.User u";
            Statement stm = connection.createStatement();
            ResultSet res = stm.executeQuery(findUser);
            while (res.next()) {
                User u = (User)res.getObject(1);
                System.out.println(u.getUsername());
            }
            res.close();
            stm.close();
            connection.close();

        }catch(Exception e){
            try {
                connection.close();
            }catch(Exception ee){
                ee.printStackTrace();
            }
            e.printStackTrace();
        }

        return "end";

    }

    @RequestMapping(value = "/users/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> updateUser(@PathVariable("name") String name, @RequestBody UserOld userOld) {

        System.out.println("put");
        System.out.println(name);
        System.out.println("Username: " + userOld.getUsername() + " Id: " + userOld.getId());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("key1", "value1");
        httpHeaders.add("key2", "value2");

        return new ResponseEntity<Boolean>(true, HttpStatus.NOT_FOUND);


    }

    @RequestMapping(value = "/users", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> postUser(@RequestBody UserOld userOld) {

        System.out.println("Username: " + userOld.getUsername() + " Id: " + userOld.getId());

        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }



    public ModelAndView model() {

        ModelAndView model = new ModelAndView("");
        model.addObject("headerMessage", "ok");



        return model;
    }
}
