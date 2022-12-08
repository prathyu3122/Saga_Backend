package com.example.SagaBackend.Controller;

import com.example.SagaBackend.Model.Author;
import com.example.SagaBackend.Model.Genre;
import com.example.SagaBackend.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This is Authors controller
@RestController
@RequestMapping("/saga")
public class AuthorsController {
    @Autowired
    private AuthorService authorService;

    @CrossOrigin
    @GetMapping("/all-authors")
    public List<Author> displayAllGenres() {
        return authorService.displayAuthors();
    }
}
