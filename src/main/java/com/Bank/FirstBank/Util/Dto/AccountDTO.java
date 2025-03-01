package com.Bank.FirstBank.Util.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private Long accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;
    private String branchName;
    private String ifscCode;
    private UserDTO user;

}
