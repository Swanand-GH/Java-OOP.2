import java.util.Scanner;

class Payment {
    void pay(int amount) {
        System.out.println("Payment method: Payment");
        System.out.println("Amount: " + amount);
    }
}

class CreditCard extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Payment method: Credit Card");
        System.out.println("Amount: " + amount);
    }
}

class UPI extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Payment method: UPI");
        System.out.println("Amount: " + amount);
    }
}

public class paymentpay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int amount = sc.nextInt();

        Payment payment;  // Superclass reference

        if (choice == 1) {
            payment = new CreditCard();
        } else {
            payment = new UPI();
        }

        payment.pay(amount);  // Runtime polymorphism
    }
}
