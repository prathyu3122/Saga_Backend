package com.example.SagaBackend.Model;

import lombok.*;
import javax.persistence.*;


// This is Article Model connected to article table in the database
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String genre;
    private String description;
    private String author;
    private String imageurl;
    private String publishingdate;

}
