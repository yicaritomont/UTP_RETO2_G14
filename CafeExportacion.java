package RETOS_JUEVES.R2;

public class CafeExportacion extends Cafe {
    // Constantes
    private final static Integer CIF_BASE = 20;
    //Atributos
    private Integer cif;
    private boolean verde;
    
    //Constructor
    public CafeExportacion(){
        this(PRECIO_BASE,PESO_BASE,CALIDAD_C_BASE,CIF_BASE,false);
    }
    
    public CafeExportacion(Double precioBase, Integer peso){
        super(precioBase, peso);
        this.calidadC=  CALIDAD_C_BASE;
        this.cif= CIF_BASE;
        this.verde = false;    
    }
    
    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde){
        super(precioBase, peso, calidadC);
        this.cif = cif;
        this.verde = verde;
    }
    
    // Métodos
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if(verde){
            adicion += 50.0;
        }
        if (cif > 40){
            adicion += (precioBase * 0.30);
        }

        return adicion;
    }
}
