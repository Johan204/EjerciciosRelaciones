/*
 * Welcome Master.
 */
package Number3;

import java.util.ArrayList;

/**
 *
 * @author Johan
 */
public class Sala {
    private String nombreSala;
    private ArrayList<Semana> semanas;

    public Sala(String nombreSala) {
        this.nombreSala = nombreSala;
        this.semanas = new ArrayList<>();
    }
    public void adicionarSemana(Semana semana){
        this.semanas.add(semana);
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }
    
}
