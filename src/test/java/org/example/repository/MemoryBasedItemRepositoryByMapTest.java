package org.example.repository;

import org.example.entity.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class MemoryBasedItemRepositoryByMapTest {

    MemoryBasedItemRepositoryByMap test = new MemoryBasedItemRepositoryByMap();
    @BeforeEach
    void setUp() {
        for (int i = 0; i < 100; i++) {
            test.add(new Item("User" + i, "description" + i, System.currentTimeMillis(), "Comment" + i));
        }
    }

    @Test
    void add() {
        int newSize = 101;
        test.add(new Item("", "", 10, ""));
        assert newSize == test.getSize();
    }

    @Test
    void replace() {
        List<Item> listOfItems = test.getAll();
        Item item = new Item("", "", 15, "");
        test.replace(listOfItems.get(0).getId(), item);
        String userName = test.findByUserId(listOfItems.get(0).getId()).getUsername();
        assert item.getUsername().equals(userName);
    }

    @Test
    void delete() {
    }

    @Test
    void findByUsername() {
    }

    @Test
    void findByUserId() {
    }
}