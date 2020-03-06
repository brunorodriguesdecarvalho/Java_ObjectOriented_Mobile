public class Retangulo {
    private double base;
    private double altura;

    public void setBase(double valor) {
        base = valor;
    }

    public double getBase() {
        return (base);
    }

    public void setAltura(final double valor) {
        altura = valor;
    }

    public double getAltura() {
        return(altura);
    }

    public double calcArea() {
        return (base * altura);
    }
}
