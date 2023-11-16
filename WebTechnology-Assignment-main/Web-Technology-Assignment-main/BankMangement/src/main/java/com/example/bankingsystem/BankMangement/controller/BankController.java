package com.example.bankingsystem.BankMangement.controller;

import com.example.bankingsystem.BankMangement.model.Account;
import com.example.bankingsystem.BankMangement.model.Withdraw;
import com.example.bankingsystem.BankMangement.service.impl.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class BankController {
    @Autowired
    BankService bankService;
    @PostMapping("/postdetails")
    public ResponseEntity<Account> acc_creation(@RequestBody Account account){
    return new ResponseEntity<Account>(bankService.account_creation(account), HttpStatus.CREATED);
    }
    @PutMapping("/withdrawl")
    public ResponseEntity<Account> amt_withdraw(@RequestBody Withdraw withdraw)
    {
        return new ResponseEntity<Account>(bankService.amount_withdraw(withdraw), HttpStatus.ACCEPTED);
    }
}
