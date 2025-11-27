public class TestPayment {
    public static void main(String[] args) {
        Payment p1 = new PayPal();
        Payment p2 = new TarjetaCredito();

        p1.pay(100.0);
        p2.pay(250.0);
    }
}
