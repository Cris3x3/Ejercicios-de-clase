public class LegacyPaymentAdapter implements PaymentGateway {
    private CreditCard card;
    private LegacyPaymentService legacyService;

    public LegacyPaymentAdapter(CreditCard card) {
        this.card = card;
        this.legacyService = new LegacyPaymentService();
    }

    @Override
    public void pay(double amount) {
        if (card.authorize()) {
            System.out.println("Monto a pagar: $" + amount);
            legacyService.makePayment();
        } else {
            throw new RuntimeException("Pago no autorizado");
        }
    }
}