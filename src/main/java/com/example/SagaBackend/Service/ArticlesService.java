package com.example.SagaBackend.Service;

import com.example.SagaBackend.Model.Article;
import com.example.SagaBackend.Model.Genre;
import com.example.SagaBackend.Repository.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {

    @Autowired
    private ArticlesRepository articlesRepository;

    // Adding new Articles
    public void addArticle(Article article) {
        articlesRepository.save(article);
    }

    // Displaying all articles
    public List<Article> viewArticles() {
        return articlesRepository.findAll();
    }

    //Displaying Articles of that genre
    public List<Article> displayGenreArticles(String param_genre) {
        return articlesRepository.findByGenre(param_genre);
    }

    //Displaying Articles of that Author
    public List<Article> displayAuthorArticles(String param_author) {
        return articlesRepository.findByAuthor(param_author);
    }
    
}
