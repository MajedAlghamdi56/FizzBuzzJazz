package day2;

public class Account {

    private static double annualRate = 0.04;
    public String name;
    public double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getMonthlyRate() {
        // Calculate the monthly interest rate
        return annualRate / 12;
    }

    public double getMonthlyInterest() {
        // Calculate the monthly interest
        return balance * getMonthlyRate();
    }

    public void deposit(double amount) {
        // Deposit an amount to the account
        balance += amount;
    }

    public void withdraw(double amount) {
       balance -= amount;

    }


        public static void setAnnualRate ( double rate){
            // Set the annual interest rate
            annualRate = rate;
        }

        public double getBalance () {
            return balance;
        }
    }

