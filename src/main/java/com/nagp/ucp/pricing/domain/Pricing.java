package com.nagp.ucp.pricing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Pricing {

    /**
     * Unique identifier for a pricing.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * id of service in catalog DB.
     */
    @Column
    private int serviceId;

    /**
     * Price of service.
     */
    @Column
    private double price;

    /**
     * Discount on pricing.
     */
    @Column
    private int discount;

    /**
     * Tells if pricing to be required after inspection by provider.
     */
    @Column
    private boolean onInspection;

    public Pricing() {

    }

    public Pricing(int id, int serviceId, double price, int discount, boolean onInspection) {
        super();
        this.id = id;
        this.serviceId = serviceId;
        this.price = price;
        this.discount = discount;
        this.onInspection = onInspection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public boolean isOnInspection() {
        return onInspection;
    }

    public void setOnInspection(boolean onInspection) {
        this.onInspection = onInspection;
    }

    @Override
    public String toString() {
        return "Pricing [id=" + id + ", serviceId=" + serviceId + ", price=" + price + ", discount=" + discount
            + ", onInspection=" + onInspection + "]";
    }

}
