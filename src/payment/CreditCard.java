
package payment;

public class CreditCard implements IPaymentStrategy {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            return false;
        }

        System.out.println("Payment of ₹" + amount + " completed using Credit Card.");
        return true;
    }
}
