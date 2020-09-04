package com.e.untammeddragons;

public class MenuItems {

    private int image;
    private String itemName;
    private int price;

    public MenuItems(int image, String itemName, int price) {
        this.image = image;
        this.itemName = itemName;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }
}
