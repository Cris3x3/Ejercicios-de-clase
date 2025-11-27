public class TestCombate {
    public static void main(String[] args) {
        Guerrero g = new Guerrero("Thorin", 100, 5);
        Mago m = new Mago("Harry", 80, 7, 40);
        Arquero a = new Arquero("Legolas", 90, 6, 5);

        g.atacar(m);
        m.atacar(g);
        a.atacar(g);
        m.atacar(a);
        g.atacar(a);
    }
}
