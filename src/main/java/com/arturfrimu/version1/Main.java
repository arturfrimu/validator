package com.arturfrimu.version1;

public class Main {
    public static void main(String[] args) {
        User user = new User("");
        if (user.isReasonValid(new Validator.StringEmptyValidator(), new Validator.StringGreaterThanValidator(20))) {
            System.out.println("VALID");
        } else {
            System.out.println("I'm sorry, lenght need to be between 5 and 10");
        }
    }
}
