import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class main{
    public static void main (String[] args) throws Exception {
     ArrayList<Vehiculo> vehiculos = new ArrayList<>();
     vehiculos.add(new Vehiculo("ABC123", "Toyota", 150.0));
     vehiculos.add(new Vehiculo("XYZ789", "Honda", 200.0));

     HashSet<String> placas = new HashSet<>();
     for (Vehiculo vehiculo : vehiculos) {
         placas.add(vehiculo.placa);
 }
        

     double totalImpuestos = Vehiculo.CalcularTotalImpuestos(vehiculos);
        System.out.println("Total de impuestos: " + totalImpuestos);

       double limite = 100.0;
        ArrayList<Vehiculo> vehiculosFiltrados = Vehiculo.FiltrarVehiculosPorImpuesto(vehiculos, limite);

        System.out.println("Vehículos con impuestos mayores a " + limite + ":");
        for (Vehiculo vehiculo : vehiculosFiltrados) {
            System.out.println(vehiculo.placa + " - " + vehiculo.marca);
 }
  }
           public static void mostrarReporte(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Reporte de Vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Placa: " + vehiculo.placa);
            System.out.println("Marca: " + vehiculo.marca);
            System.out.println("Precio Base de Impuestos: " + vehiculo.precioBaseimpuestos);
            System.out.println("Impuestos Calculados: " + vehiculo.calcularImpuestos());
        
            
        } 

    }

}

