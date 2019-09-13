package com.example.marii.signup;

public class Food {

    private String Name;
    private String Recipe;
    private String Price;
    private int Photo;

    public Food() {
    }

    public Food(String name, String recipe, String price, int photo) {
        Name = name;
        Recipe = recipe;
        Price = price;
        Photo = photo;
    }

    //Getter methods

    public String getName() {
        return Name;
    }

    public String getRecipe() {
        return Recipe;
    }

    public String getPrice() {
        return Price;
    }

    public int getPhoto() {
        return Photo;
    }


    //Setter methods


    public void setName(String name) {
        Name = name;
    }

    public void setRecipe(String recipe) {
        Recipe = recipe;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
