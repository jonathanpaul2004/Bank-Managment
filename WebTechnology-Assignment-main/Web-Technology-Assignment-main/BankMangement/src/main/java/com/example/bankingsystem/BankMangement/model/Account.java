package com.example.bankingsystem.BankMangement.model;
import lombok.Data;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name="Indusind")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long acc_number;

    @Column(name="name",nullable = false)
    public String name;
    @Column(name="aadhar",nullable = false)
    private String aadhar;
    @Column(name="gender",nullable = false)
    public String gender;
    @Column(name="dob",nullable = false)
    public String DOB;
    @Column(name="address",nullable = false)
    public String address;
    @Column(name="acc_type",nullable = false)
    public String acc_type;
    @Column(name="acc_bal",nullable = false)
    public Double acc_bal;
    @Column(name="phone_number",nullable = false)
    public BigInteger phone_number;
    @Column(name="email_id",nullable = false)
    public String email_id;


}
