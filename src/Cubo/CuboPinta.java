package Cubo;

public class CuboPinta {
    private float lado;
    private float tipo;
    private float rendimento;
    final int litros = 18;

    public CuboPinta(float lado, float rendimento, int tipo) {
        this.lado = lado;
        this.rendimento = rendimento;
        if (tipo == 1) {
            this.tipo = 101.9f;
        } else if (tipo == 2) {
            this.tipo = 212.45f;
        } else if (tipo == 3) {
            this.tipo = 345.56f;
        }
    }

    public float calculaArea() {
        return lado * lado;
    }

    public float calculaAreaCubo() {
        return calculaArea() * 6;
    }

    public double calculaVolume() {
        return Math.pow(lado, 3);
    }

    public double calculaDiagonal() {
        return Math.sqrt(3) * lado;
    }

    public double calculaLitros() {
        return calculaAreaCubo() / rendimento;
    }

    public double calculaLatas() {
        return Math.ceil(calculaLitros() / litros);
    }

    public double calculaPreco() {
        return calculaLatas() * tipo;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float area) {
        this.lado = area;
    }

    public float getTipo() {
        return tipo;
    }

    public void setTipo1(float tipo) {
        this.tipo = tipo;
    }

    public void setTipo(float tipo) {
        this.tipo = tipo;
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuboPinta: ");
        sb.append("\n Lado: ").append(lado);
        sb.append("\n Rendimento: ").append(rendimento);
        sb.append("\n Tipo: ").append(tipo);
        sb.append("\n -------------------- ");
        sb.append("\n Area da base: ").append(calculaArea());
        sb.append("\n Area Total: ").append(calculaAreaCubo());
        sb.append("\n Volume: ").append(calculaVolume());
        sb.append("\n Diagonal: ").append(calculaDiagonal());
        sb.append("\n Latas de Tinta: ").append(calculaLatas());
        sb.append("\n Litros de Tinta: ").append(calculaLitros());
        sb.append("\n Preço da Tinta: ").append(calculaPreco());
        return sb.toString();
    }
}
