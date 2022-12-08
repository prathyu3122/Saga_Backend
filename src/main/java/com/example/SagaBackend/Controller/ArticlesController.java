package com.example.SagaBackend.Controller;

import com.example.SagaBackend.Model.Article;
import com.example.SagaBackend.Service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is Articles controller
@RestController
@RequestMapping("/saga")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @CrossOrigin
    @PostMapping("/addarticle")
    public void addingNewArticle(@RequestBody Article article) {
            articlesService.addArticle(article);
    }

    @CrossOrigin
    @GetMapping("/all_articles")
    public List<Article> viewAllArticles() {
        return articlesService.viewArticles();
    }

    @CrossOrigin
    @GetMapping("/genre_articles/{param_genre}")
    public List<Article> displayArticlesOfGenre(@PathVariable String param_genre) {
        return articlesService.displayGenreArticles(param_genre);
    }

    @CrossOrigin
    @GetMapping("/author_articles/{param_author}")
    public List<Article> displayArticlesOfAuthor(@PathVariable String param_author) {
        return articlesService.displayAuthorArticles(param_author);
    }
}
