package com.rheetham.shoppingcart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    //Lob stands for Large Object - Blob for Binary Large Object
    @Lob
    private Blob image;
    private String downloadUrl;

    //Image class owns the product property
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
