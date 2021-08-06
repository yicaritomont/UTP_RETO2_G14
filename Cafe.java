package RETOS_JUEVES.R2;

public class Cafe {
    // Constantes
    protected final static Integer PESO_BASE = 5;
    protected final static char CALIDAD_C_BASE = 'F';
    protected final static Double PRECIO_BASE = 100.0;
    //Atributos
    protected Integer peso;
    protected char calidadC;
    protected Double precioBase;

    //Constructores
    public Cafe(){
        this.precioBase= PRECIO_BASE;
        this.peso =  PESO_BASE;
        this.calidadC = CALIDAD_C_BASE;
    }
   
    public Cafe(Double precioBase, Integer peso){
        this.precioBase= precioBase;
        this.peso =  peso;
        this.calidadC = CALIDAD_C_BASE;
    }
   
    public Cafe(Double precioBase, Integer peso, char calidadC){
        this.precioBase= precioBase;
        this.peso =  peso;
        this.calidadC = calidadC;
        comprobarCalidadC(calidadC);
    }
   
    // Metodos
    public void comprobarCalidadC(char calidadC){
        if(calidadC >= 65 && calidadC <=70){
            this.calidadC=calidadC;
        }else{
            this.calidadC=CALIDAD_C_BASE;
        }
    }

    public Double calcularPrecio(){
        double adicion = 0.0;
        switch (calidadC) {
            case 'A':
                adicion += 10;
                break;
            case 'B':
                adicion += 8;
                break;
            case 'C':
                adicion += 6;
                break;
            case 'D':
                adicion += 5;
                break;
            case 'E':
                adicion += 3;
                break;
            case 'F':
                adicion += 1;
                break;
            default:
                break;
            }
            // PESO afecta el precio final
            if (peso >=0 && peso <19){
                adicion += 10;
            }
            if (peso >=19 && peso <49){
                adicion += 50;
            }
            if (peso >=49 && peso <80){
                adicion += 80;
            }
            if (peso >=80){
                adicion += 100;
            }
        return precioBase + adicion;
    } 
}
