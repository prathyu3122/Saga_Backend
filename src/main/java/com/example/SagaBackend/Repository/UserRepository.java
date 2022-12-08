package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//This is Users Repository
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    public Optional<Users> findByUsername(String param_user);
}
