package figuras;
import java.lang.Math;

public class triangulo extends figuraGeometrica {
    private Double lado1;
    private Double lado2;
    private Double lado3;
    public void setLados(Double lado1, Double lado2, Double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public Double calcularPerimetro(){
        return (this.lado1+this.lado2+this.lado3);
    }
    public Double calcularArea(){
        Double semiPerimetro = this.calcularPerimetro();
        Double parteArea = (semiPerimetro * (semiPerimetro-(this.lado1*2)) * (semiPerimetro-(this.lado2*2)) *
                (semiPerimetro-(this.lado3*2)));
        Double area = 1/4 * Math.sqrt(parteArea);
        return area;
    }
}
