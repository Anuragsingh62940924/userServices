package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{

    List<User> list = List.of(
            new User(1311L,"Shubham singh","7379157389"),
            new User(1312L,"Ankit tiwari","7379157389"),
            new User(1313L,"naddem singh","7379157389")

    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
