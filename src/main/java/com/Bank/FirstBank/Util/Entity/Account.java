package com.Bank.FirstBank.Util.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Table(name = "account")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_number")
    private Long accountNumber;
    private String accountHolderName;
    @Column(name = "account_type", length = 20)
    private String accountType;
    private double balance;
    private String branchName;
    @Column(name = "ifsc_code", length = 11)
    private String ifscCode;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Double.compare(account.balance, balance) == 0 && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountHolderName, account.accountHolderName) && Objects.equals(accountType, account.accountType) && Objects.equals(branchName, account.branchName) && Objects.equals(ifscCode, account.ifscCode) && Objects.equals(user, account.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountHolderName, accountType, balance, branchName, ifscCode, user);
    }
}
