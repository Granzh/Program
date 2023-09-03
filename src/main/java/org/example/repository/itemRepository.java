package org.example.repository;

import org.example.entity.Item;

import java.util.List;

public interface itemRepository {
    Item add(Item item);
    void replace(String id, Item replace);
    void delete(String id);
    List<Item> getAll();
    List<Item> findByUdername(String Username);
    Item findByUserId(String id);

}
