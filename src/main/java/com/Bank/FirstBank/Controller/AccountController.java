package com.Bank.FirstBank.Controller;

import com.Bank.FirstBank.Service.AccountService;
import com.Bank.FirstBank.Util.Dto.AccountDTO;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;


        @GetMapping("/welcome")
    String home() {
        return "Welcome to First Bank";
    }

    @GetMapping("/details/{id}")
    ResponseEntity<AccountDTO> getAccount(@PathVariable("id") Long id) {
       AccountDTO accountDTO = accountService.getAccount(id);
         return ResponseEntity.ok(accountDTO);
    }

    @PostMapping("/add")
    ResponseEntity<AccountDTO> addAccount(@RequestBody AccountDTO account) {
        AccountDTO accountDTO = accountService.addAccount(account);
        return ResponseEntity.ok(accountDTO);
    }



}
