package day2;

public class SavingsAccount extends Account{
    private double withdrawalLimit;

    public SavingsAccount(String name, double balance, double withdrawalLimit) {
        super(name, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount>= withdrawalLimit) {
            super.withdraw(amount);

        }

    }
}
