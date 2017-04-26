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
public class Category extends DomainObject {
    private String name;
    private String description;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products=new ArrayList<>();
        }
    
    public void addProduct(Product product){
        this.products.add(product);
    }
    public ArrayList<Product> listarproductos(){
        return this.products;
    }
    
    public void imprimirProducts(){
        for(Product producto:products){
            System.out.println("Para el producto "+producto.getName()+" exiten los siguientes items:");
            for(Item item:producto.getItems()){
                System.out.println(item.getName());
            }
        }
    }
            

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    
    
    
    
    
}
