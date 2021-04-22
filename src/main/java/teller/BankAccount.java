package teller;

public class BankAccount {


    public int getBalance;
    private String accountNumber;
    private String type;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance(){
        return balance;


    }


    public BankAccount(String accountNumber, String type, int balance) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;
    }

    public void withdrawal(int amountToWithdrawal) {
        balance -= amountToWithdrawal;
    }

    public String getType() {
        return type;
    }



    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
    }
}

