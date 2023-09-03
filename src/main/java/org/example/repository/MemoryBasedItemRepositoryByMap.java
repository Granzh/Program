package org.example.repository;

import org.example.entity.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryBasedItemRepositoryByMap implements itemRepository{
    Map<String, Item> mapOfRepository = new HashMap<>();
    @Override
    public Item add(Item item) {
        return null;
    }

    @Override
    public void replace(String id, Item replace) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Item> getAll() {
        return null;
    }

    @Override
    public List<Item> findByUdername(String Username) {
        return null;
    }

    @Override
    public Item findByUserId(String id) {
        return null;
    }
}
