package com.example.SagaBackend.Controller;
import com.example.SagaBackend.Model.Users;
import com.example.SagaBackend.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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



}
