package com.example.demo.user;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private UserType type;
    private double discount;
    private double total;
    private double netPayableAmount;

    public User(String id, String firstName, String lastName, UserType type, double total) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.total = total;

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


    public void setDiscount(UserType type) {
        if (type == UserType.CUSTOMER) {
            this.discount = 0.1;
        } else {
            this.discount = 0.3;
        }
    }

    //total
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getNetPayableAmount() {
        return netPayableAmount;
    }

    public void setNetPayableAmount(double total) {
        if (total >= 100) {
            int num = (int) (total / 100);

            this.netPayableAmount = (total - (total * this.discount )) - 5 * num;

        } else {
            this.netPayableAmount = total - (total * (this.discount));
        }
    }
}


