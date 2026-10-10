public class Camion extends Vehiculo {
    double capacidadCargaTeldas;

    public Camion(String placa, String marca, double precioBaseimpuestos, double capacidadCargaTeldas) {
        super(placa, marca, precioBaseimpuestos);
        this.capacidadCargaTeldas = capacidadCargaTeldas;
    }

    public double getCapacidadCargaTeldas() {
        return capacidadCargaTeldas;
    }

    public void setCapacidadCargaTeldas(double capacidadCargaTeldas) {
        this.capacidadCargaTeldas = capacidadCargaTeldas;
    }

    @Override
    public double calcularImpuestos() {
        return super.calcularImpuestos() + (capacidadCargaTeldas * 0.2);
    }
}