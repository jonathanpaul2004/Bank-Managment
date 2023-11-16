package com.example.bankingsystem.BankMangement.repository;

import com.example.bankingsystem.BankMangement.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Account, Long> {
}
