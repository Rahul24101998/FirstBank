package com.Bank.FirstBank.Util.Dto;


public class AccountDTO {
    private Long accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;
    private String branchName;
    private String ifscCode;

    public AccountDTO() {
    }

    public AccountDTO(Long accountNumber, String accountHolderName, String accountType, double balance, String branchName, String ifscCode) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", branchName='" + branchName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}
