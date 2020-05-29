package com.example.Temporary.models;


import javax.persistence.*;

@Entity
@Table(name = "discount")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "discount_id")
    private Long discountId;

    @Column(name = "discount_name")
    private String discountName;

    @Column(name = "discount_percentage")
    private Double discountCalculationPercentage;

    public Discount() {
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public Double getDiscountCalculationPercentage() {
        return discountCalculationPercentage;
    }

    public void setDiscountCalculationPercentage(Double discountCalculationPercentage) {
        this.discountCalculationPercentage = discountCalculationPercentage;
    }
}
