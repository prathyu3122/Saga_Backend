package com.example.SagaBackend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// This is Users Model connected to login users table in the database
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "login_users")
@Entity
public class Users {
    @Id
    private String username;
    private String email;
    private String password;

}
