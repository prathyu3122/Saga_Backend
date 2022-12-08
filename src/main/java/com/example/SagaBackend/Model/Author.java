package com.example.SagaBackend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// This is Author Model connected to Author table in the database
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
@Entity
public class Author {
    @Id
    private int id;
    private String author;
}
