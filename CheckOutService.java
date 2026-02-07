//step1:Create an interface.
interface PaymentMethod {
    String pay(double amount);
    String invoice(double amount);
}

//step2: Create concrete classes implementing the same interface
class CardPayment implements PaymentMethod {
    public String pay(double a) { return "Paid by card: " + a; }
    public String invoice(double a) { return "Invoice: card for " + a; }
}

class WalletPayment implements PaymentMethod {
    public String pay(double a) { return "Paid by wallet: " + a; }
    public String invoice(double a) { return "Invoice: wallet for " + a; }
}

class CashOnDelivery implements PaymentMethod {
    public String pay(double a) { return "COD placed: " + a; }
    public String invoice(double a) { return "Invoice: COD for " + a; }
}

// Step 3: Factory Class for object creation
class PaymentFactory {
    public static PaymentMethod create(String method) {
        return switch (method) {
            case "CARD" -> new CardPayment();
            case "WALLET" -> new WalletPayment();
            case "COD" -> new CashOnDelivery();
            default -> throw new IllegalArgumentException("Unknown method: " + method);
        };
    }
}

// Step 4: : Create Client/Main Class
public class CheckOutService {
    public String pay(String method, double amount) {
        PaymentMethod pm = PaymentFactory.create(method);
        return pm.pay(amount);
    }

    public static void main(String[] args) {
        CheckOutService checkout = new CheckOutService();
        System.out.println(checkout.pay("COD", 900.0));
    }
}