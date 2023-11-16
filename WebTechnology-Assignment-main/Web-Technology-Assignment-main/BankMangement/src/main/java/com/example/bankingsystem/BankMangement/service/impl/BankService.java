package com.example.bankingsystem.BankMangement.service.impl;

import com.example.bankingsystem.BankMangement.model.Account;
import com.example.bankingsystem.BankMangement.model.Withdraw;

public interface BankService {
    Account amount_withdraw(Withdraw withdraw);
    Account account_creation(Account account);
}
