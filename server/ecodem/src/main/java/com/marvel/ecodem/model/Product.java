package com.marvel.ecodem.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    @Getter
    private String imageType;
    @Getter
    @Lob
    private byte[] imageData;

    public void setImageName(String originalFilename) {
    }

    public void setImageType(String contentType) {
    }

    public void setImageData(byte[] bytes) {
    }
}
