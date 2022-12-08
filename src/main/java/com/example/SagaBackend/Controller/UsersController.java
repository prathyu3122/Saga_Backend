package com.example.SagaBackend.Controller;
import com.example.SagaBackend.Model.Users;
import com.example.SagaBackend.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is users controller
@RestController
@RequestMapping("/saga")
public class UsersController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping("/addUser")
    public void addingNewUser(@RequestBody Users user) {
        userService.addUser(user);
    }


    // Verifying User Login
    @CrossOrigin
    @PostMapping("/verifyUser")
    public String verifyingUser(@RequestBody Users loginUser) {
        String result = userService.verifyUser(loginUser);
        if(result != null && result != "no user") {
            return result;
        }
        else if(result == null) {
            return "Incorrect Username/Password!";
        }
        else {
            return "User Not Registered!!!";
        }
    }

}
