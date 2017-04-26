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
public class Starter {
    public static void main(String[] args) {
        Vet v1=new Vet("Felipe");
        Person p1=new Person ("Camila");
        Pet a1=new Dog("Max");
        Pet a2=new Hamster("Stuart");
        Pet a3=new Dog("Odin");
        v1.addPerson(p1);
        p1.addPet(a1);
        p1.addPet(a3);
        p1.addPet(a2);
        p1.showPets();
        Person p2=new Person("Sebastian");
        Pet s1= new Dog("Hari");
        Pet s2=new Cat("Garfield");
        v1.addPerson(p2);
        p2.addPet(s1);
        p2.addPet(s2);
        p2.showPets();
        v1.showPerson();
        v1.showPetsbyType();
        a1.sound();
        a2.sound();
        s2.sound();
        v1.deletePerson(p2);
        
        p1.deletePet(a1);
        v1.showPerson();
        
        
        
        
          
        
    }
    
}
