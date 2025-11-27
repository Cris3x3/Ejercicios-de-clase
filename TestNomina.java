public class TestNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        Empleado e1 = new EmpleadoProduccion("Ana", 1, 20, 1200, "Noche", 3);
        Empleado e2 = new EmpleadoDistribucion("Luis", 2, 18, 1100, "Norte", 100);

        nomina.agregarEmpleado(e1);
        nomina.agregarEmpleado(e2);

        nomina.mostrarNomina();
    }
}
