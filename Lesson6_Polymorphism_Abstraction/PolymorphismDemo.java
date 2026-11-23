
class Payment {

    public void makePayment() {
        System.out.println("Processing a payment...");
    }
}

// Child Class 1
class CashPayment extends Payment {

    @Override
    public void makePayment() {
        System.out.println("Payment made using Cash.");
    }
}

// Child Class 2
class GCashPayment extends Payment {

    @Override
    public void makePayment() {
        System.out.println("Payment made using GCash.");
    }
}

// Main Class
public class PolymorphismDemo {

    public static void main(String[] args) {

        Payment payment1 = new CashPayment();
        Payment payment2 = new GCashPayment();

        System.out.println("=== POLYMORPHISM DEMO ===");

        payment1.makePayment();
        payment2.makePayment();
    }
}
