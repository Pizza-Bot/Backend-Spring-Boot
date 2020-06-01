package com.example.Temporary.models;


import javax.persistence.*;

@Entity
@Table(name = "Toppings")
public class Toppings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toppings_id")
    private Long toppingsId;

    @Column(name = "toppings_name")
    private String toppingsName;

    @Column(name = "toppings_price")
    private Double toppingsPrice;

    public Toppings() {
    }

    public Long getToppingsId() {
        return toppingsId;
    }

    public void setToppingsId(Long toppingsId) {
        this.toppingsId = toppingsId;
    }

    public String getToppingsName() {
        return toppingsName;
    }

    public void setToppingsName(String toppingsName) {
        this.toppingsName = toppingsName;
    }

    public Double getToppingsPrice() {
        return toppingsPrice;
    }

    public void setToppingsPrice(Double toppingsPrice) {
        this.toppingsPrice = toppingsPrice;
    }
}
