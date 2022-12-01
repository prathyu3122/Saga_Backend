package com.example.SagaBackend.Repository;

import com.example.SagaBackend.Model.Articles;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

public interface ArticlesRepository extends JpaAttributeConverter<Long, Articles> {
    
}
