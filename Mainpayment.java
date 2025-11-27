public class Mainpayment {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(
                "1234-5678-9012-3456",
                "Juan Pérez",
                "12/25",
                123);

        PaymentGateway gateway = new LegacyPaymentAdapter(card);

        // Prueba del sistema
        try {
            gateway.pay(150.75);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}