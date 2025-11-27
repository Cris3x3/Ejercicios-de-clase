public class InicioViajeFacade {

    private Motor motor;
    private Neumaticos neumaticos;
    private Combustible combustible;
    private Asiento asiento;
    private Navegador navegador;
    private SistemaAudio audio;

    public InicioViajeFacade() {
        motor = new Motor();
        neumaticos = new Neumaticos();
        combustible = new Combustible();
        asiento = new Asiento();
        navegador = new Navegador();
        audio = new SistemaAudio();
    }

    public void prepararViaje(String destino) {
        System.out.println("=== Preparando viaje ===");

        neumaticos.verificarPresion();
        combustible.verificarNivel();
        asiento.ajustarPosicion();
        navegador.configurarRuta(destino);
        motor.encender();
        audio.reproducirListaFavorita();

        System.out.println("=== El carro está listo para partir ===");
    }

    public void terminarViaje() {
        System.out.println("=== Terminando viaje ===");

        audio.detenerMusica();
        motor.apagar();

        System.out.println("=== Viaje finalizado ===");
    }
}
