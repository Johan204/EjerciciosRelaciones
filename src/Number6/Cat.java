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
public class Cat extends Pet {
    private boolean isHunter;

    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
    System.out.println("Miau");
}

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

    public boolean isIsHunter() {
        return isHunter;
    }
    
    
    
}
