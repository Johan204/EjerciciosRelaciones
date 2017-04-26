
package Number1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private ArrayList<Carro> carros;
    private String nombre;
    private int ID;
    public Persona(ArrayList<Carro> carros, String nombre, int ID) {
        this.carros = carros;
        this.nombre = nombre;
        this.ID = ID;
    }
         public void listarCarros(){
         for(Carro carro: carros){
             System.out.println(carro.toString()); // en carro debo tener to string
             
         }
     }

    @Override
    public String toString() {
        String to = "Persona{ + carros= ";
        for (int i = 0; i < 2; i++) {
            System.out.println(carros.get(i));
        }
        return ",nombre=" + nombre + ", ID=" + ID + '}' + "\n";
    }
         

  
     
    
}
