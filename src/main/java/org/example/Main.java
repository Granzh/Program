package org.example;

import org.example.entity.Item;
import org.example.repository.MemoryBasedItemRepositoryByMap;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MemoryBasedItemRepositoryByMap test = new MemoryBasedItemRepositoryByMap();
        test.add(new Item("", " ", 4, ""));
        List<Item> listOfItems = test.getAll();

    }
}