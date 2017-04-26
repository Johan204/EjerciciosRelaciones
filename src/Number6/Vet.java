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
public class Vet {
    private String name;
    private HashMap<String,Person> clients;
    
    public Vet(String name) {
        this.name = name;
        this.clients=new HashMap<>();
        }
    public void addPerson(Person person){
        this.clients.put(person.getName(),person);
    }
    
    
    public void deletePerson(Person person){
        this.clients.remove(person.getName(), person);
    }
       
     public void showPerson(){
        for(Person person:this.clients.values()){
            System.out.println(person.getName()+" es dueño de:" );
            person.showPets();
        }
    }
    public void showPetsbyType(){
        System.out.println("Las mascotas inscritas son:");
        for(Person person:this.clients.values()){
        for (Pet pet: person.getPets().values()){
            if(pet instanceof Dog){
                System.out.println("Perro: " + pet.getName());
            }else if(pet instanceof Cat){
                System.out.println("Gato: " + pet.getName());
            }else if (pet instanceof Hamster){ 
                 System.out.println("Hamster: " + pet.getName());
            }
    }
        }
    }
    
   
    
    public String getName() {
        return name;
    }

    public HashMap<String,Person> getClients() {
        return clients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClients(HashMap<String,Person> clients) {
        this.clients = clients;
    }
    
    
    
}
