package com.ismailportfolio.backend.brand;

import javax.persistence.*;

@Entity
@Table
public class Brand {
    @Id
    @SequenceGenerator(
            name = "brand_sequence",
            sequenceName = "brand_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "brand_sequence"
    )
    private Long id;
    private String brandName;
    private String brandImage;

    public Brand() {
    }

    public Brand(Long id, String brandName, String brandImage) {
        this.id = id;
        this.brandName = brandName;
        this.brandImage = brandImage;
    }

    public Brand(String brandName, String brandImage) {
        this.brandName = brandName;
        this.brandImage = brandImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", brandImage='" + brandImage + '\'' +
                '}';
    }
}