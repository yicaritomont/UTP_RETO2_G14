package RETOS_JUEVES.R2;

public class CafeNacional extends Cafe{
    // Constantes 
    private final static boolean TOSTADO = false;
    // Atributos
    private boolean tostado;

    //Constructor
    public CafeNacional(){
        this(PRECIO_BASE,PESO_BASE,CALIDAD_C_BASE,TOSTADO);
    }
   
    public CafeNacional(Double precioBase, Integer peso){
        super(precioBase, peso);
        this.tostado = TOSTADO;
    }
   
    public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado){
        super(precioBase, peso, calidadC);
        this.tostado = tostado;
    }
   
    // Métodos
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if(tostado){
            adicion+=50.0;
        }
        return adicion;
    }
   
}
