package withdraw.model.entities;

import withdraw.model.exceptions.DomainException;

public class Account {
    Integer accountNumber;
    String holder;
    Double balance, withdrawLimit;

    public Account(Integer accountNumber, String holder, Double balance, Double withdrawLimit) {
        if (accountNumber < 0) {
            throw new DomainException("Account number can not be a negative number.");
        }
        if (holder.trim().length() < 1) {
            throw new DomainException("Holder name can not be empty.");
        }
        if (balance < 0) {
            throw new DomainException("Account balance can not be a negative.");
        }
        if (withdrawLimit < 0) {
            throw new DomainException("Account withdraw limit can not be a negative.");
        }
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(Double value) {
        if (this.balance < value) {
            throw new DomainException("Not enough balance.");
        }
        if (this.withdrawLimit < value) {
            throw new DomainException("Withdraw limit: $ " + this.getWithdrawLimit());
        }
        if (value < 0) {
            throw new DomainException("You can not withdraw a negative amount.");
        }
        this.balance -= value;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber +
               "Balance: $%.2f" + balance;
    }
}
