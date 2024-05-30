package day2;

public class AccountTest {
    public static void main(String[] args) {
// Create a new account
      /*
                Account myAccount = new Account("Majed Alghamdi", 1000);

                // Get the monthly rate and interest
                double monthlyRate = myAccount.getMonthlyRate();
                double monthlyInterest = myAccount.getMonthlyInterest();
                System.out.println("Monthly rate: " + monthlyRate * 100 + "%");
                System.out.println("Monthly interest: $" + monthlyInterest);

                // Deposit and withdraw some money
                myAccount.deposit(500);
                myAccount.withdraw(200);
                System.out.println("Current balance: $" + myAccount.getBalance());

                // Change the annual interest rate
                Account.setAnnualRate(0.06);
                monthlyRate = myAccount.getMonthlyRate();
                monthlyInterest = myAccount.getMonthlyInterest();
                System.out.println("New monthly rate after changing: " + monthlyRate * 100 + "%");
                System.out.println("New monthly interest after changing: $" + monthlyInterest);
*/

        // Create a savings account
        SavingsAccount savingsAccount = new SavingsAccount("Anas", 1000, 500);
        savingsAccount.withdraw(300);

        // Create a checking account
        CheckingAccount checkingAccount = new CheckingAccount("Wael", 500);
        checkingAccount.withdraw(300);

            }
        }

