abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends Account {
    private static final double SAVINGS_RATE = 0.04;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * SAVINGS_RATE;
    }
}

class CurrentAccount extends Account {
    private static final double CURRENT_RATE = 0.005;

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * CURRENT_RATE;
    }
}

public class Abstraction4 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(10000.0);

        System.out.println(
            "SavingsAccount - Balance: " + savings.getBalance()
            + ", Interest Earned: " + savings.calculateInterest()
        );

        CurrentAccount current = new CurrentAccount(10000.0);

        System.out.println(
            "CurrentAccount - Balance: " + current.getBalance()
            + ", Interest Earned: " + current.calculateInterest()
        );

        SavingsAccount empty = new SavingsAccount(0.0);

        System.out.println(
            "\nEmpty SavingsAccount - Balance: " + empty.getBalance()
            + ", Interest Earned: " + empty.calculateInterest()
        );

        System.out.println("\n--- Polymorphism Demo ---");

        Account[] accounts = {savings, current};

        for (Account acc : accounts) {
            System.out.println(
                "Account type: " + acc.getClass().getSimpleName()
                + ", Interest: " + acc.calculateInterest()
            );
        }
    }
}
