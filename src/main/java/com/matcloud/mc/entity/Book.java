package com.matcloud.mc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Book entity.
 */
@Data
@Entity
@Table(name = "book")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String title;
    private String author;
    private String date;
    private String press;
    private String abs;
    private String cover;
    @ManyToOne
    @JoinColumn(name="cid")
    private Category category;
}
