package com.example.Temporary.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Total_Order")
public class TotalOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "total_order_id")
    private Long totalOrderId;

    @ManyToMany
    @JoinColumn(name = "pizza_order_id")
    private List<PizzaOrder> pizzaOrders;

    @Column(name = "raw_total")
    private Double rawTotal;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;

    @Column(name = "discounted_price")
    private Double discountedPrice;



    public TotalOrder() {
    }

    public Long getTotalOrderId() {
        return totalOrderId;
    }

    public void setTotalOrderId(Long totalOrderId) {
        this.totalOrderId = totalOrderId;
    }

    public List<PizzaOrder> getPizzaOrders() {
        return pizzaOrders;
    }

    public void setPizzaOrders(List<PizzaOrder> pizzaOrders) {
        this.pizzaOrders = pizzaOrders;
    }

    public Double getRawTotal() {
        return rawTotal;
    }

    public void setRawTotal(Double rawTotal) {
        this.rawTotal = rawTotal;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(Double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
