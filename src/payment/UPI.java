
package payment;

public class UPI implements IPaymentStrategy {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            return false;
        }

        System.out.println("Payment of ₹" + amount + " completed using UPI.");
        return true;
    }
}
