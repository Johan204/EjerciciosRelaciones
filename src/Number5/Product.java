/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number5;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Product extends DomainObject {
    private String name;
    private String description;
    private ArrayList<Item> items;
    private Category category;

    public Product(String name) {
        this.name = name;
        this.items=new ArrayList<>();
    }
    
    public void additem(Item item){
        this.items.add(item);
    }
    public ArrayList<Item> listarItems(){
        return this.items;
    }
//    public ArrayList<Item> ImprimirItems(){
//        Product c=new Product("a");
//        ArrayList <Item> lista=c.listarItems();
//        for (int i = 0; i < lista.size(); i++) {
//            Item j=lista.get(i);
//    }
//        return lista;
//    }

      
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
    
    
    
    
}
