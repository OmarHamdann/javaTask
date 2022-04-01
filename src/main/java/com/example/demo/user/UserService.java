package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<User> usersList = new ArrayList<>(Arrays.asList(
            new User("1", "omar", "hamdan", UserType.EMPLOYEE),
            new User("2", "abood", "srour", UserType.EMPLOYEE),
            new User("3", "ali", "ahmad", UserType.CUSTOMER),
            new User("4", "salah", "ali", UserType.CUSTOMER),
            new User("5", "moath", "mohammad", UserType.CUSTOMER)
    ));

    public List<User> getAllUsers() {
        return usersList;
    }
    public User getUserById(String id) {
        return usersList.stream().filter(user->user.getId().equals(id)).findFirst().get();
    }

}
