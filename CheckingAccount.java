package day2;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            super.withdraw(amount);
        }

    }}

