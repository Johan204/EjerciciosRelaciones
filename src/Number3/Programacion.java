/*
 * Welcome Master.
 */
package Number3;

import java.util.ArrayList;

/**
 *
 * @author Johan
 */
public class Programacion {
    private ArrayList<Sala> salas;

    public Programacion() {
        this.salas = new ArrayList<>();
    }
    
    
    public void adicionarSalas(Sala sala){
        
        this.salas.add(sala);
    }
    
    public void listarProgramacion(){
        System.out.println("\tProgramacion del teatro");
        for (int i = 0; i < this.salas.size(); i++) {
            System.out.println("\tPara la sala "+this.salas.get(i).getNombreSala());
            for (int j = 0; j < this.salas.get(i).getSemanas().size(); j++) {
                System.out.println("\tEn la semana "+this.salas.get(i).getSemanas().get(j).getNumeroSemana());
                for (int k = 0; k < 3; k++) {//Cambiar tamaño de memoria si se desea añadir más dias
                    System.out.println("\n\tEn el día "+this.salas.get(i).getSemanas().get(j).getDias(k).getNombreDia()+" "+this.salas.get(i).getSemanas().get(j).getDias(k).getFecha());
                    System.out.println("Hay "+this.salas.get(i).getSemanas().get(j).getDias(k).getEventos().size() + " evento(s)");
                    for (int l = 0; l < this.salas.get(i).getSemanas().get(j).getDias(k).getEventos().size(); l++) {
                        System.out.println("--"+this.salas.get(i).getSemanas().get(j).getDias(k).getEventos().get(l)+"--");
                        System.out.println("Hora Inicio: "+this.salas.get(i).getSemanas().get(j).getDias(k).getSegmento().get(l).getHoraInicio()
                        +"\tHora fin : "+this.salas.get(i).getSemanas().get(j).getDias(k).getSegmento().get(l).getHoraFin());
                        System.out.println(this.salas.get(i).getSemanas().get(j).getDias(k).getSegmento().get(l).defSegmento());
                    }
                    System.out.println("Hay "+this.salas.get(i).getSemanas().get(j).getDias(k).calcularHorasLibresDia()+""
                            + " horas libres en el día "+this.salas.get(i).getSemanas().get(j).getDias(k).getNombreDia());
                } 
                System.out.println("En la semana "+this.salas.get(i).getSemanas().get(j).getNumeroSemana()
                +", hay "+this.salas.get(i).getSemanas().get(j).calcularHorasLibresSemanales()+" horas libres.");
            }
            
        }
    }
}
