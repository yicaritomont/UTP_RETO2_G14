package RETOS_JUEVES.R2;

public class PrecioTotal {
    // Atributos
    private Double totalCafe;
    private Double totalCafeExportacion;
    private Double totalCafeNacional;
    private Cafe listaCafe[];
    // Constructor
    public PrecioTotal(){
        this.totalCafe = 0.0;
        this.totalCafeExportacion = 0.0;
        this.totalCafeNacional = 0.0;
    }
    public PrecioTotal(Cafe listaCafe[]) {
        this.totalCafe = 0.0;
        this.totalCafeExportacion = 0.0;
        this.totalCafeNacional = 0.0;
        this.listaCafe = listaCafe;
    }
    public void mostrarTotales() {
        // Código
        for( Cafe hijo: listaCafe){
            if(hijo instanceof Cafe){
                totalCafe += hijo.calcularPrecio();
            }
            if(hijo instanceof CafeNacional){
                totalCafeNacional += hijo.calcularPrecio();
            }
            if(hijo instanceof CafeExportacion){
                totalCafeExportacion += hijo.calcularPrecio();
            }
        }
    
        // Mostramos los resultados
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }
   
}
