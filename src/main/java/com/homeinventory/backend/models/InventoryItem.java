package com.homeinventory.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class InventoryItem {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "modelNumber")
    private String modelNumber;

    @Column(name = "serialNumber")
    private String serialNumber;

    @Column(name = "description", length = 16384)
    private String description;

    @Column(name = "amountPaid")
    private Double amountPaid;

    @Column(name = "purchasedDate")
    private Date purchasedDate;

    @Column(name = "purchasedFrom")
    private String purchasedFrom;

    @Column(name = "location")
    private String location;

    /**
     *  Future variables:
     *  - Photo
     *  - Rent, Own, Lease?
     *  - Notes Section / Pros and Cons
     *  - Repair Log / Repair Person? Who did you call?
     *  - Filter, etc replacement schedule
     *  - Contact list for handy/service people
     *  - Wish list
     *  - House Info
     *  - Door Size etc
     */

    public InventoryItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public String getPurchasedFrom() {
        return purchasedFrom;
    }

    public void setPurchasedFrom(String purchasedFrom) {
        this.purchasedFrom = purchasedFrom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
