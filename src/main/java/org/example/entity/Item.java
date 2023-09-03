package org.example.entity;

import java.util.Objects;

public class Item {
    private String id;
    private String username;
    private String description;
    private int date;
    private String comments;

    public Item(String username, String description, int date, String comments) {
        this.username = username;
        this.description = description;
        this.date = date;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && date == item.date && Objects.equals(username, item.username) && Objects.equals(description, item.description) && Objects.equals(comments, item.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, description, date, comments);
    }
}
