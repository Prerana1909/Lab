package arrays;

abstract class BankAcc{
    private int accountNumber;
    private double balance;

    public BankAcc(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class CheckingAcc extends BankAcc {
    public CheckingAcc(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double currentBalance = getBalance();
        currentBalance += amount;
        System.out.println("Deposited Rs." + amount);
        System.out.println("Current balanc is Rs." + currentBalance);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (currentBalance - amount < 0) {
            System.out.println("Insufficient funds");
            return;
        }
        currentBalance -= amount;
        System.out.println("Withdrawn Rs." + amount);
        System.out.println("Current balance is Rs." + currentBalance);
        System.out.println();
    }
}

public class BankAccountChecking {
    public static void main(String[] args) {
        CheckingAcc checkingAccount = new CheckingAcc( 1, 2000.0);
        checkingAccount.deposit(500.0);
        checkingAccount.withdraw(200.0);
        
        CheckingAcc checkingAccount1 = new CheckingAcc( 2, 1000.0);
        checkingAccount1.deposit(300.0);
        checkingAccount1.withdraw(1200.0);
        
    }
}
