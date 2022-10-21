package Piramide;

public class PiramidePinta {
    private float altura;
    private float ab;
    private float tipo;
    final float rendimento = 4.76f;
    final float litros = 18;

    public PiramidePinta(float altura, float ab, int tipo) {
        this.ab = ab;
        this.altura = altura;
        if (tipo == 1) {
            this.tipo = 127.9f;
        } else if (tipo == 2) {
            this.tipo = 258.98f;
        } else if (tipo == 3) {
            this.tipo = 344.34f;
        }
    }

    public PiramidePinta() {
    }

    public double calculaBase() {
        return Math.pow(ab * 2, 2);
    }

    public double calculaApotema() {
        return Math.sqrt(Math.pow(ab, 2) + Math.pow(altura, 2));
    }

    public double calculaTriangulo() {
        return ab * 2 * calculaApotema() / 2;
    }

    public double calculaLaterais() {
        return calculaTriangulo() * 4;
    }

    public double calculaArea() {
        return calculaBase() + calculaLaterais();
    }

    public double calculaVolume() {
        return (calculaBase() * calculaApotema()) / 3;
    }

    public double calculaLitros() {
        return calculaArea() / rendimento;
    }

    public double calculaLatas() {
        return Math.ceil(calculaLitros() / litros);
    }

    public double calculaPreco() {
        return calculaLatas() * tipo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAb() {
        return ab;
    }

    public void setAb(float ab) {
        this.ab = ab;
    }

    public float getTipo() {
        return tipo;
    }

    public void setTipo(float tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConePinta: ");
        sb.append("\n Ab: ").append(ab);
        sb.append("\n Altura: ").append(altura);
        sb.append("\n Tipo: ").append(tipo);
        sb.append("\n Apótema: ").append(calculaApotema());
        sb.append("\n Área da base: ").append(calculaBase());
        sb.append("\n Área Lateral: ").append(calculaTriangulo());
        sb.append("\n Área Total: ").append(calculaArea());
        sb.append("\n Volume: ").append(calculaVolume());
        sb.append("\n Litros: ").append(calculaLitros());
        sb.append("\n Latas: ").append(calculaLatas());
        sb.append("\n Preço Total: ").append(calculaPreco());
        return sb.toString();
    }
}
