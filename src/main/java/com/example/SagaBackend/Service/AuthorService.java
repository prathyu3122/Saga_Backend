package com.example.SagaBackend.Service;

import com.example.SagaBackend.Model.Author;
import com.example.SagaBackend.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    // Display all authors in authors page
    public List<Author> displayAuthors() {
        return authorRepository.findAll();
    }

}
