/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class RelacionesTest {
    public static void main(String[] arg){
        Ruedas[] ruedas = new Ruedas[4];
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i] = new Ruedas("Rueda "+(i+1));
        }
        Motor motor1 = new Motor("Nissan3200");
        
        Carro carro1 = new Carro(ruedas, motor1,"Carro 1");
        carro1.crearChasis("negro");
        Motor motor2 = new Motor("Toyota4510");
        
        Carro carro2 = new Carro(ruedas, motor2, "Carro 2");
        carro2.crearChasis("Blanco");
        ArrayList<Carro> carros = new ArrayList();
        carros.add(carro1);
        carros.add(carro2);
        Persona persona1 = new Persona(carros, "Carlos", 988);
        System.out.println(persona1.toString());
        
    }
}
