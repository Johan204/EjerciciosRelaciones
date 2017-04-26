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
public class Pet {
    protected String id;
    protected String name;
    protected String hearColor;

    public Pet(String name) {
        this.name = name;
    }
    
    public void sound(){
        System.out.println("SONIDO");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHearColor() {
        return hearColor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHearColor(String hearColor) {
        this.hearColor = hearColor;
    }
    
    
}
