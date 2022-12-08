package com.example.SagaBackend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// This is Genre Model connected to Genre table in the database
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Genre {
    @Id
    private int id;
    private String gname;
    private String gimage;
}
