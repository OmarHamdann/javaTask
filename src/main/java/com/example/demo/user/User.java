package com.example.demo.user;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private UserType type;
    private double discount;

    public User(String id, String firstName, String lastName, UserType type ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;

    }
                //getter
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserType getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }
                //setter
    public void setId(String id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}


