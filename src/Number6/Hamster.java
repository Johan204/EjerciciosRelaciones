/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number6;

/**
 *
 * @author USUARIO
 */
public class Hamster extends Pet {
    public double weight;

    public Hamster(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
          System.out.println("RRR"); 
}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    
}
