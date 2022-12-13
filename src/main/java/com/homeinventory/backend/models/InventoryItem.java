package com.homeinventory.backend.models;

import java.util.Date;

public class InventoryItem {

    private Long id;
    private String name;
    private String modelNumber;
    private String serialNumber;
    private String description;
    private Double amountPaid;
    private Date purchasedDate;
    private String purchasedFrom;
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
