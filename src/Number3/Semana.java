/*
 * Welcome Master.
 */
package Number3;


/**
 *
 * @author Johan
 */
public class Semana {
    private int numeroSemana;
    private Dia[] diasHabiles;

    public Semana(int numeroSemana) {
        this.numeroSemana = numeroSemana;
        this.diasHabiles = new Dia[5];
    }
    
    public void adicionarDia(Dia[] dia){
        for (int i = 0; i < 3; i++) {
            this.diasHabiles[i] = dia[i];
        }
    }
    
    
    
    public int calcularHorasLibresSemanales(){
        int horasLibres = 0;
        for (int i = 0; i < 3 ; i++) {//Cambiar tamaño de memoria si se desea añadir más dias
            horasLibres += this.diasHabiles[i].calcularHorasLibresDia();
                
            }
        return horasLibres;
        }

    public int getNumeroSemana() {
        return numeroSemana;
    }

    public Dia[] getDiasHabiles() {
        return diasHabiles;
    }
    
    public Dia getDias(int i){
        return diasHabiles[i];
    }
        
    }

