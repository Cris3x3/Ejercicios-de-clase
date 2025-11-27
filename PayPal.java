public class PayPal implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con PayPal: " + amount);
    }
}
