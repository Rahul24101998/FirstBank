package com.Bank.FirstBank.Service.Impl;

import com.Bank.FirstBank.Execptions.ErrorCode;
import com.Bank.FirstBank.Execptions.NoSuchCustomerException;
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
        Optional<Account> account= accountRepository.findByAccountNumber(id);
        return account.map(value -> AccountDTO.builder().
                accountNumber(value.getAccountNumber()).
                accountType(value.getAccountType()).
                balance(value.getBalance()).
                build()).orElseThrow(() -> new NoSuchCustomerException(ErrorCode.NO_SUCH_ENTRY));
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
