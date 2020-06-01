package com.example.Temporary.models;


import javax.persistence.*;

@Entity
@Table(name = "Pizza_Sizes")
public class Sizes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private Long sizeId;

    @Column(name = "size_name")
    private String sizeName;

    @Column(name = "size_price")
    private Double sizePrice;

    public Sizes() {
    }

    public Long getSizeId() {
        return sizeId;
    }

    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public Double getSizePrice() {
        return sizePrice;
    }

    public void setSizePrice(Double sizePrice) {
        this.sizePrice = sizePrice;
    }
}
