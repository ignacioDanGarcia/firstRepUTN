package figuras;

public class circulo extends figuraGeometrica {
    private Double radio;
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public Double getRadio() {
        return this.radio;
    }
    public Double calcularPerimetro(){
        return 2 * 3.14 * this.radio;
    }
}
