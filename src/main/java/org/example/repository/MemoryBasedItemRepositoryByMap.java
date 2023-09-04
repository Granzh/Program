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
        item.setId(String.valueOf(System.currentTimeMillis()));
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
        return (List<Item>) mapOfRepository.values();
    }

    @Override
    public List<Item> findByUdername(String Username) {
        List<Item> listOfItems = new ArrayList<>();
        for(int i = 0; i < mapOfRepository.size(); i++) {
            String key = String.valueOf(mapOfRepository.get(i));
            Item value = mapOfRepository.get(key);
            if (value.getUsername().equals(Username)) {
                listOfItems.add(value);
            }
        }
        return null;
    }

    @Override
    public Item findByUserId(String id) {
        return mapOfRepository.get(id);
    }
    public int getSize() {
        return mapOfRepository.size();
    }
}
