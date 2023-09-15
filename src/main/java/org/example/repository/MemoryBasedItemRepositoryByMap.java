package org.example.repository;

import org.example.entity.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryBasedItemRepositoryByMap implements itemRepository{
    Map<String, Item> mapOfRepository = new HashMap<>();
    @Override
    public Item add(Item item) {
        item.setId(String.valueOf(System.currentTimeMillis() + (mapOfRepository.size() + 1)));
        mapOfRepository.put(item.getId(), item);
        return item;
    }

    @Override
    public void replace(String id, Item replace) {
        mapOfRepository.replace(id, replace);
    }

    @Override
    public void delete(String id) {
        mapOfRepository.remove(id);
    }

    @Override
    public List<Item> getAll() {
        return new ArrayList<>(mapOfRepository.values());
    }

    @Override
    public List<Item> findByUsername(String Username) {
        List<Item> listOfItems = new ArrayList<>(mapOfRepository.values());
        List<Item> result = new ArrayList<>();
        for (Item item : listOfItems) {
            if(item.getUsername().equals(Username)) result.add(item);
        }
        return result;
    }

    @Override
    public Item findByUserId(String id) {
        return mapOfRepository.get(id);
    }
    public int getSize() {
        return mapOfRepository.size();
    }
}
