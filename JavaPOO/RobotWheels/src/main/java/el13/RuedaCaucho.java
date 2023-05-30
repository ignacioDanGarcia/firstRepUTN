package el13;

public class RuedaCaucho extends Robot{
    public RuedaCaucho(){
        super(4);
    }
    public String tipoEntorno = "Solo entornos urbanos";
    public Integer restaTraccionBase = 1;

    public void restarTraccion(Integer resta){
        super.traccionBase -= resta;
    }
    public Integer distanciaKM = 100;
}
