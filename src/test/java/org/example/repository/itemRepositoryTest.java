package org.example.repository;

import org.example.entity.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class itemRepositoryTest {
    private MemoryBasedItemRepository test = new MemoryBasedItemRepository();
    @BeforeEach
    void setUp() {
        for (int i = 0; i < 100; i++) {
            test.add(new Item("User" + i, "description" + i, System.currentTimeMillis(), "Comment" + i));
        }
    }

    @Test
    void add() {
        int newSize = 101;
        test.add(new Item(" ", " ", 1, ""));
        assert test.getSize() == newSize;
    }

    @Test
    void replace() {
        int index = 5;
        Item item = new Item("1", "", 7, "");
        String id = test.getItem(index).getId();
        test.replace(id, item);
        String name = test.getItem(index).getUsername();
        assert item.getUsername().equals(name);
    }

    @Test
    void delete() {
        int newSize = test.getSize() - 1;
        String id = test.getItem(5).getId();
        test.delete(id);
        assert test.getSize() == newSize;
    }

    @Test
    void getAll() {
    }

    @Test
    void findByUdername() {
        String username = "User1";
        List<Item> items = test.findByUsername(username);
        assert items.get(0).getUsername().equals(username);
    }

    @Test
    void findByUserId() {
        String id = test.getItem(10).getId();
        assert test.findByUserId(id).getId().equals(id);
    }
}