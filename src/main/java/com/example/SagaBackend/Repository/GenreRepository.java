package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

//This is Genres Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
