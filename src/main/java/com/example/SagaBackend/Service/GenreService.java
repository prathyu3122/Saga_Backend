package com.example.SagaBackend.Service;

import com.example.SagaBackend.Model.Genre;
import com.example.SagaBackend.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//This is Genres Service
@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    // Displaying all genres
    public List<Genre> viewGenres() {
        return  genreRepository.findAll();
    }
}
