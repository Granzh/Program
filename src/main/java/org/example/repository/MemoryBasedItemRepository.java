package org.example.repository;

import org.example.entity.Item;
import java.util.ArrayList;
import java.util.List;

public class MemoryBasedItemRepository implements itemRepository{
    private List<Item> listOfAplications= new ArrayList<>();
    @Override
    public Item add(Item item) {
        item.setId(String.valueOf(System.currentTimeMillis()));
        listOfAplications.add(item);
        return item;
    }

    @Override
    public void replace(String id, Item replace) {
        for (int i = 0; i < listOfAplications.size(); i++) {
            if (listOfAplications.get(i).getId().equals(id)) {
                listOfAplications.set(i, replace);
            }
        }
    }

    @Override
    public void delete(String id) {
        listOfAplications.remove(findByUserId(id));
    }

    @Override
    public List<Item> getAll() {
        return listOfAplications;
    }

    @Override
    public List<Item> findByUsername(String Username) {
        List<Item> arrayByUserName = new ArrayList<>();
        for (Item item : listOfAplications) {
            if (item.getUsername().equals(Username)) {
                arrayByUserName.add(item);
            }
        }
        return arrayByUserName;
    }

    @Override
    public Item findByUserId(String id) {
        for (Item item : listOfAplications) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public int getSize() {
        return listOfAplications.size();
    }
    public Item getItem(int index) {
        return listOfAplications.get(index);
    }
}
