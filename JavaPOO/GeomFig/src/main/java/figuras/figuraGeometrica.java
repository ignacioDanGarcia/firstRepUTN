package figuras;

public abstract class figuraGeometrica {
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public Double calcularPerimetro(){
        return 0.0;
    }
}
