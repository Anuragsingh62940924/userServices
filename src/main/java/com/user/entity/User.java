package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String  name;
    private String phone;

    /**
     * For lists when you r having list
     * @param userId
     * @param name
     * @param phone
     * @param contacts
     */
    public User(Long userId, String name, String phone, List<contacts> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    /**
     * for none
     */
    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<contacts> contacts) {
        this.contacts = contacts;
    }

    /**
     * constructor who do not have list(list nhi h to)
     * @param userId
     * @param name
     * @param phone
     */

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    List<contacts> contacts = new ArrayList<>();
}
