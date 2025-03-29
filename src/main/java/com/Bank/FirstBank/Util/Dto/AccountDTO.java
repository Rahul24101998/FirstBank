package com.Bank.FirstBank.Util.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
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
