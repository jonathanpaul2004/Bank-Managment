package com.example.bankingsystem.BankMangement.exception;


public class UserNotFoundException extends RuntimeException{
    String name;
    String acc_no;

    public UserNotFoundException(String acc_no) {
        super(String.format("search the user with acc_number ending with xxxx%s in not found",acc_no.subSequence(6,10)));
        this.name = name;
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }
}
