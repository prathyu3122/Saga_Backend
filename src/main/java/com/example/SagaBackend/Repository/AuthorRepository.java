package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
