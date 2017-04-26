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
public class Dog extends Pet{
    
    private String breed;
    
    public Dog(String name) {
        super(name);
    }
        
    @Override
    public void sound() {
    System.out.println("Guau");
}

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    
    
    
}
