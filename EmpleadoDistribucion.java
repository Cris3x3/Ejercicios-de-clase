public class EmpleadoDistribucion extends Empleado {
    private String zona;

    public EmpleadoDistribucion(String nombre, int id, int diasTrabajados, double salarioBase, String zona) {
        super(nombre, id, diasTrabajados, salarioBase);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", zona='" + zona + "'}";
    }
}
