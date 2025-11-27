public class EmpleadoProduccion extends Empleado {
    private String turno;

    public EmpleadoProduccion(String nombre, int id, int diasTrabajados, double salarioBase, String turno) {
        super(nombre, id, diasTrabajados, salarioBase);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", turno='" + turno + "'}";
    }
}
