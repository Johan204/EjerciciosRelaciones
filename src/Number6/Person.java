/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number6;

import java.util.HashMap;

/**
 *
 * @author USUARIO
 */
public class Person {
    private String name;
    private String id;
    private Vet vet;
    private HashMap<String,Pet> pets;
    

    public Person(String name) {
        this.name = name;
        this.pets=new HashMap<>();
        }
    public void addPet(Pet pet){
        this.pets.put(pet.getName(), pet);
    }
    public void showPets(){
        for(Pet pet:this.pets.values()){
            System.out.println(pet.getName());
        }
    }
     
       
    public void deletePet(Pet pet){
        this.pets.remove(pet.getName(), pet);
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Vet getVet() {
        return vet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public HashMap<String, Pet> getPets() {
        return pets;
    }

    public void setPets(HashMap<String, Pet> pets) {
        this.pets = pets;
    }
    
   
    
    
}
