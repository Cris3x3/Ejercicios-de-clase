public class Main {
    public static void main(String[] args) {

        InicioViajeFacade inicio = new InicioViajeFacade();

        inicio.prepararViaje("Oficina");

        System.out.println("\n--- Conduciendo... ---\n");

        inicio.terminarViaje();
    }
}
