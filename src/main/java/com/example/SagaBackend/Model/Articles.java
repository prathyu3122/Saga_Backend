package com.example.SagaBackend.Model;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
@Entity
public class Articles {
    @Id
    private int id;
    private String title;
    private String subtitle;
    private String genre;
    private String description;
    private String author;
    private String imageurl;
    private String publishingdate;

}
