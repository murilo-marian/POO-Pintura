package Cone;

public class ConePinta {
    private float raio;
    private float altura;
    private float tipo;
    final float rendimento = 3.45f;
    final int litros = 18;

    public ConePinta(float raio, float altura, int tipo) {
        this.raio = raio;
        this.altura = altura;
        if (tipo == 1) {
            this.tipo = 238.9f;
        } else if (tipo == 2) {
            this.tipo = 467.98f;
        } else if (tipo == 3) {
            this.tipo = 758.34f;
        }
    }

    public ConePinta() {
    }

    public double calculaGeratriz() {
        return Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
    }

    public double calculaBase() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calculaLateral() {
        return Math.PI * raio * calculaGeratriz();
    }

    public double calculaArea() {
        return calculaBase() + calculaLateral();
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

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
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
        sb.append("\n Raio: ").append(raio);
        sb.append("\n Altura: ").append(altura);
        sb.append("\n Tipo: ").append(tipo);
        sb.append("\n Geratriz: ").append(calculaGeratriz());
        sb.append("\n Área da base: ").append(calculaBase());
        sb.append("\n Área Lateral: ").append(calculaLateral());
        sb.append("\n Área Total: ").append(calculaArea());
        sb.append("\n Litros: ").append(calculaLitros());
        sb.append("\n Latas: ").append(calculaLatas());
        sb.append("\n Preço Total: ").append(calculaPreco());
        return sb.toString();
    }
}
