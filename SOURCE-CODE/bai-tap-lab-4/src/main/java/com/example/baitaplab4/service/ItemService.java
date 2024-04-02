package com.example.baitaplab4.service;

import com.example.baitaplab4.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItem(int id, String newName) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.setName(newName);
                break;
            }
        }
    }

    public void deleteItem(int id) {
        items.removeIf(item -> item.getId() == id);
    }
}
