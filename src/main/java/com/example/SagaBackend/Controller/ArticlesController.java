package com.example.SagaBackend.Controller;

import com.example.SagaBackend.Model.Article;
import com.example.SagaBackend.Service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
