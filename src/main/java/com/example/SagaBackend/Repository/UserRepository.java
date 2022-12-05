package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
