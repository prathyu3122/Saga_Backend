package com.example.SagaBackend.Service;

import com.example.SagaBackend.Model.Article;
import com.example.SagaBackend.Repository.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {

    @Autowired
    private ArticlesRepository articlesRepository;

    public void addArticle(Article article) {
        articlesRepository.save(article);
    }

    public List<Article> viewArticles() {
        return articlesRepository.findAll();
    }

}
