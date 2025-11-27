public class TarjetaCredito implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con Tarjeta de Crédito: " + amount);
    }
}
