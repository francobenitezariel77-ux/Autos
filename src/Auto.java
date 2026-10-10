public class Auto extends Vehiculo {
   int numPuertas;

    public Auto(String placa, String marca, double precioBaseimpuestos, int numPuertas) {
        super(placa, marca, precioBaseimpuestos);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public double calcularImpuestos() {
        return precioBaseimpuestos * 0.1;
    }
}