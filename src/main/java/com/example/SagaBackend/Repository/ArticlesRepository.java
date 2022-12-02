package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesRepository extends JpaRepository<Article, Long> {

    //Find genre to display
    public List<Article> findByGenre(String param_genre);

    //Displaying Complete Article
    public List<Article> findByTitle(String param_title);

}
