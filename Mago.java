public class Mago extends Personaje {

    private int mana;

    public Mago(String nombre, int vida, int nivel, int mana) {
        super(nombre, vida, nivel);
        this.mana = mana;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (!estaVivo())
            return;
        lanzarHechizo(objetivo);
    }

    public void lanzarHechizo(Personaje objetivo) {
        if (mana < 10) {
            System.out.println(nombre + " no tiene suficiente mana.");
            return;
        }
        mana -= 10;
        int danio = 15 + nivel;
        System.out.println(nombre + " lanza un hechizo contra " + objetivo.nombre);
        objetivo.defender(danio);
    }
}
