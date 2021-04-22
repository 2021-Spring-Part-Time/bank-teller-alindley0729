package teller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map<String, BankAccount> accounts = new HashMap<>();


    public void add(BankAccount accountToAdd) {
        accounts.put(accountToAdd.getAccountNumber(), accountToAdd);
    }

    public BankAccount findAccount(String accountNumber) {
        return accounts.get(accountNumber);

    }

    public Collection<BankAccount> getAllAccounts() {
        return accounts.values();
    }

    public void close(String account) {
        accounts.remove(account.getAccountNumber(), account);
    }

    public void withdrawal(String accountNumber, int amountToWithdrawal) {
        BankAccount withdrawalFromAccount = findAccount(accountNumber);
        withdrawalFromAccount.withdrawal(amountToWithdrawal);

    }

    public void deposit(String accountNumber, int amountToDeposit) {
        BankAccount depositToAccount = findAccount(accountNumber);
        depositToAccount.deposit(amountToDeposit);

    }

    public void showAccounts() {
        for(BankAccount account: accounts.values()){
            System.out.println(account.getAccountNumber() + " " + account.getType() + " " + account.getBalance());
        }
    }
}