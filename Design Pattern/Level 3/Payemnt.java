abstract class Payment {
    abstract void processPayment();
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PaypalPayment();
        p1.processPayment();
        p2.processPayment();
    }
}

class CreditCardPayment extends Payment{
    void processPayment(){
        System.out.println("Processing creadit card payment ");
    }
}

class PaypalPayment extends Payment{
    void processPayment(){
        System.out.println("Processing PayPal Payment");
    }
} 
