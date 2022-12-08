package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

//This is Authors Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
