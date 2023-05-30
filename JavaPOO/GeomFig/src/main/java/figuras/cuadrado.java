package figuras;

public class cuadrado extends figuraGeometrica {
    private Double lado;
    public Double getLado() {
        return this.lado;
    }
    public void setLado(Double lado) {
        this.lado = lado;
    }
    public Double calcularPerimetro(){
        return this.lado * 4;
    }
}
