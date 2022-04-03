package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<User> usersList = new ArrayList<>(Arrays.asList(
            new User("1", "omar", "hamdan", UserType.EMPLOYEE, 990.0),
            new User("2", "abood", "srour", UserType.EMPLOYEE, 55.5),
            new User("3", "ali", "ahmad", UserType.CUSTOMER, 990.0),
            new User("4", "salah", "ali", UserType.CUSTOMER, 55.5),
            new User("5", "moath", "mohammad", UserType.CUSTOMER, 320.0)
    ));


    public List<User> getAllUsers() {

        usersList.stream().forEach(el -> el.setDiscount(el.getType()));
        usersList.stream().forEach(el -> el.setNetPayableAmount(el.getTotal()));


        return usersList;
    }

    public User getUserById(String id) {
        usersList.stream().forEach(el -> el.setDiscount(el.getType()));
        usersList.stream().forEach(el -> el.setNetPayableAmount(el.getTotal()));
        return usersList.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }

    public User createUser(User user){
//        usersList.add(new User("77", "nono", "gg", UserType.CUSTOMER, 55.5));
        usersList.add(user);
        return user;
    }

}
