package com.example.bankingsystem.BankMangement.service.impl.impl;

import com.example.bankingsystem.BankMangement.exception.UserNotFoundException;
import com.example.bankingsystem.BankMangement.model.Account;
import com.example.bankingsystem.BankMangement.model.Withdraw;
import com.example.bankingsystem.BankMangement.repository.BankRepository;
import com.example.bankingsystem.BankMangement.service.impl.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceimpl implements BankService {
    @Autowired
    BankRepository bankRepository;
    @Override
    public Account amount_withdraw(Withdraw withdraw)
    {
       Account account= bankRepository.findById(withdraw.getAccount_num()).
                orElseThrow(() ->new UserNotFoundException(withdraw.getAccount_num().toString()));
                if(account.getAcc_bal()>withdraw.getWithdraw())
                {
                    double updated_bal;
                    updated_bal = account.getAcc_bal()- withdraw.getWithdraw();
                    account.setAcc_bal(updated_bal);
                    return bankRepository.save(account);
                }
        return account;
    }
    @Override
    public Account account_creation(Account account){
        return bankRepository.save(account);
       // return account;
    }
}
