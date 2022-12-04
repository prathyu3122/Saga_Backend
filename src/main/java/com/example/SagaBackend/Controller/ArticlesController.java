package com.example.SagaBackend.Controller;

import com.example.SagaBackend.Model.Article;
import com.example.SagaBackend.Service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/articles/{param_genre}")
    public List<Article> displayArticlesOfGenre(@PathVariable String param_genre) {
        return articlesService.displayGenreArticles(param_genre);
    }

    //Displaying complete article
//    @CrossOrigin
//    @GetMapping("/article/{param_title}")
//    public List<Article> displayArticle(@PathVariable String param_title) {
//        return articlesService.displayArticle(param_title);
//    }
}
