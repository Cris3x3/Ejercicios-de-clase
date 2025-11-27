import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public double calcularTotalPago() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalarioPago();
        }
        return total;
    }

    public void mostrarNomina() {
        for (Empleado e : empleados) {
            System.out.println(e + " | Pago: " + e.calcularSalarioPago());
        }
        System.out.println("Total a pagar: " + calcularTotalPago());
    }
}
