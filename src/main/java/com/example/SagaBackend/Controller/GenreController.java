package com.example.SagaBackend.Controller;

import com.example.SagaBackend.Model.Genre;
import com.example.SagaBackend.Service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//This is Genre controller
@RestController
@RequestMapping("/saga")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @CrossOrigin
    @GetMapping("/all-genres")
    public List<Genre> displayAllGenres() {
        return genreService.viewGenres();
    }
}
