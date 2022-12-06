package com.example.SagaBackend.Service;
import com.example.SagaBackend.Model.Users;
import com.example.SagaBackend.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Adding new users (Registration)
    public void addUser(Users user) {
        userRepository.save(user);
    }


}
