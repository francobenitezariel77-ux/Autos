public class AutoCilindrada extends Auto {
    double cilindrada;

    public AutoCilindrada(String placa, String marca, double precioBaseimpuestos, int numPuertas, double cilindrada) {
        super(placa, marca, precioBaseimpuestos, numPuertas);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularImpuestos() {
        return super.calcularImpuestos() + (cilindrada * 0.5);
    }
}