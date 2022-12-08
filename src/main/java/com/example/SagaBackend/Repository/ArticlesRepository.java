package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//This is Articles Repository
@Repository
public interface ArticlesRepository extends JpaRepository<Article, Long> {

    //Find genre to display
    public List<Article> findByGenre(String param_genre);

    //Find author to display
    public List<Article> findByAuthor(String param_author);

}
