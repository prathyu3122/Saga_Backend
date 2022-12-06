package com.example.SagaBackend.Service;
import com.example.SagaBackend.Model.Users;
import com.example.SagaBackend.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Adding new users (Registration)
    public void addUser(Users user) {
        userRepository.save(user);
    }


    //Verify User
    public String verifyUser(Users loginUser) {
        Optional<Users> u = userRepository.findByUsername(loginUser.getUsername());

        if(u.isPresent()) {
            String loginUserName = u.get().getUsername();
            String pass = u.get().getPassword();

            if(pass.compareTo(loginUser.getPassword()) == 0) {
                return loginUserName;
            }
            else {
                return null;
            }
        }
        else {
            return "no user";
        }
    }
}
