public class Arquero extends Personaje {

    private int flechas;

    public Arquero(String nombre, int vida, int nivel, int flechas) {
        super(nombre, vida, nivel);
        this.flechas = flechas;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (flechas <= 0) {
            System.out.println(nombre + " no tiene flechas!");
            return;
        }
        flechas--;
        int danio = 12 + nivel;
        System.out.println(nombre + " dispara una flecha a " + objetivo.nombre);
        objetivo.defender(danio);
    }
}
