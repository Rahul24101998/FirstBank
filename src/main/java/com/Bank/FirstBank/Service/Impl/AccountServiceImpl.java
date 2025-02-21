package com.Bank.FirstBank.Service.Impl;

import com.Bank.FirstBank.Repository.AccountRepository;
import com.Bank.FirstBank.Service.AccountService;
import com.Bank.FirstBank.Util.Dto.AccountDTO;
import com.Bank.FirstBank.Util.Entity.Account;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "AccountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public AccountDTO addAccount(AccountDTO account) {
        Account sacAccount=accountRepository.save(new ObjectMapper().convertValue(account, Account.class));
        AccountDTO accountDTO = new ObjectMapper().convertValue(sacAccount, AccountDTO.class);
        return accountDTO;

        // TODO Auto-generated method stub
    }

    @Override
    public AccountDTO getAccount(Long id) {
        Optional<Account> account= accountRepository.findById(id);
        if(account.isPresent()) {
            AccountDTO accountDTO = new ObjectMapper().convertValue(account.get(), AccountDTO.class);
            return accountDTO;
        }
        return null;
    }

    @Override
    public List<AccountDTO> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateAccount(Long id, String email) {
        // TODO Auto-generated method stub
    }

    @Override
    public void deleteAccount(Long id) {
        // TODO Auto-generated method stub
    }
}
