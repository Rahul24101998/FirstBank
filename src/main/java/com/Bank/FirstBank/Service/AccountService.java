package com.Bank.FirstBank.Service;

import com.Bank.FirstBank.Util.Dto.AccountDTO;

import java.util.List;

public interface AccountService {
    public AccountDTO addAccount(AccountDTO account) ;
    public AccountDTO getAccount(Long id) ;
    public List<AccountDTO> findAll() ;

    public void updateAccount(Long id, String email);

    public void deleteAccount(Long id) ;
}
