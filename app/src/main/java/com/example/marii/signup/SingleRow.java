package com.example.marii.signup;

public class SingleRow {
    String name;
    String price;
    String quantity;
    int image;

    public SingleRow(String name, String price, String quantity, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    //get methods

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public int getImage() {
        return image;
    }

    //setter methods


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
