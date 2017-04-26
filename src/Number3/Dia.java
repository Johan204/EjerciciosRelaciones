/*
 * Welcome Master.
 */
package Number3;

import java.util.ArrayList;

/**
 *
 * @author Johan
 */
public class Dia {

    private int fecha;
    private String nombreDia;
    private ArrayList<Segmento> segmento;
    private ArrayList<String> eventos;
    private int[] horasHabiles;

    public Dia(int fecha, String nombreDia, String evento) {
        this.fecha = fecha;
        this.nombreDia = nombreDia;
        this.segmento = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.eventos.add(evento);
        this.horasHabiles = new int[10];
        for (int i = 0; i < 10; i++) {
            this.horasHabiles[i] = 8 + i;
        }
    }
    
    public void adicionarEvento(String evento){
        this.eventos.add(evento);
    }
    
    public void adicionarSegmento(Segmento segmento) {
        this.segmento.add(segmento);
    }

    public int calcularHorasLibresDia() {
        int horasTotales = horasHabiles.length;
        int horaRestar = 0;
        for (int i = 0; i < this.segmento.size(); i++) {
            for (int j = 0; j < this.horasHabiles.length; j++) {
                if (this.segmento.get(i).getHoraInicio() == this.horasHabiles[j]) {
                    horaRestar = this.segmento.get(i).getHoraFin() - this.segmento.get(i).getHoraInicio();
                    horasTotales = horasTotales - horaRestar;
                }
            }
        }

        return horasTotales;
    }

    public int getFecha() {
        return fecha;
    }

    public ArrayList<Segmento> getSegmento() {
        return segmento;
    }

    public ArrayList<String> getEventos() {
        return eventos;
    }
    
    
    
    public String getNombreDia() {
        return nombreDia;
    }

    
}
