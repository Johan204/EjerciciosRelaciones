/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number1;

/**
 *
 * @author Estudiante
 */
public class Carro {

    private Ruedas[] ruedas;
    private Chasis chasis;
    private Motor motor;
    private String carroNumero;

    public Carro(Ruedas[] ruedas, Motor motor, String CarroNumero) { // crear en el main ruedas vector de 4
        this.ruedas = ruedas;
        this.motor = motor;
        this.carroNumero = CarroNumero;

    }

    public void crearChasis(String color) {
        this.chasis = new Chasis(color);// Composicion, creo a chasis desde Carro
    }

    @Override
    public String toString() {
        String to = "Carro="+carroNumero  ;
        for (int i = 0; i < 4; i++) {
            System.out.print(ruedas[i]);
        }
        return  to+" chasis=" + chasis + ", motor=" + motor + '}';
    }
    
}
