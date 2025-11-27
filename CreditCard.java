public class CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    public CreditCard(String cardNumber, String cardHolder, String expiryDate, int cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public boolean authorize() {
        // Lógica de autorización simulada
        System.out.println("Autorizando tarjeta " + this.cardNumber);
        return true; // Simulamos autorización exitosa
    }
}