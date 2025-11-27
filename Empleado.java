public class Empleado {
    private String nombre;
    private int id;
    private int diasTrabajados;
    private double salarioBase;

    public Empleado(String nombre, int id, int diasTrabajados, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.diasTrabajados = diasTrabajados;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id +
                ", nombre='" + nombre + '\'' +
                ", diasTrabajados=" + diasTrabajados +
                ", salarioBase=" + salarioBase + '}';
    }
}
