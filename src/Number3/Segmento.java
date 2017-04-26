/*
 * Welcome Master.
 */
package Number3;


/**
 *
 * @author Johan
 */
public class Segmento {
    private int horaInicio;
    private int horaFin;
    

    public Segmento(int horaInicio, int horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }
    
    public String defSegmento(){
        if(horaInicio>=8 || horaInicio<=12){
            return "El evento se realizará en la mañana";
        }else{
            return "El evento se realizara en la tarde";
        }
    }
    
}
