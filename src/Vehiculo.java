import java.util.ArrayList;
public class Vehiculo {
String placa;
String marca;
double precioBaseimpuestos;


public Vehiculo(String placa, String marca, double precioBaseimpuestos) {
this.placa=placa;
this.marca =marca;
this.precioBaseimpuestos =precioBaseimpuestos;
}

public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Vehiculo vehiculo = (Vehiculo) obj;
    return placa.equals(vehiculo.placa);
}


public int hashCode() {
    return placa.hashCode();
}
public double calcularImpuestos() {
    return precioBaseimpuestos * 0.1;}       

public static double CalcularTotalImpuestos(ArrayList<Vehiculo> vehiculos) {
    double total = 0;
    for (Vehiculo vehiculo : vehiculos) {
        total += vehiculo.calcularImpuestos();
    }
    return total;
}
public static ArrayList<Vehiculo> FiltrarVehiculosPorImpuesto(ArrayList<Vehiculo> vehiculos, double limite) {
    ArrayList<Vehiculo> vehiculosFiltrados = new ArrayList<>();
    for (Vehiculo vehiculo : vehiculos) {
        if (vehiculo.calcularImpuestos() > limite) {
            vehiculosFiltrados.add(vehiculo);
        }
    }
    return vehiculosFiltrados;
}
}