package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesRepository extends JpaRepository<Article, Long> {
}
