package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesRepository extends JpaRepository<Article, Long> {

}
