package com.example;

import java.time.LocalDate;

public class Watch {


    private String company;
    private String model;
    private LocalDate year;
    private long price;

    public Watch(String company, String model, LocalDate year, long price) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Watch(){

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
