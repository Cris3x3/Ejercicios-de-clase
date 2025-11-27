public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void defender(int danio) {
        if (!estaVivo())
            return;
        vida -= danio;
        if (vida < 0)
            vida = 0;
        System.out.println(nombre + " recibe " + danio + " daño. Vida restante: " + vida);
    }

    public abstract void atacar(Personaje objetivo);
}
