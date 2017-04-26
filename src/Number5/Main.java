/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number5;

/**
 *
 * @author USUARIO
 */
public class Main {

    
    public static void main(String[] args) {
        Category c1=new Category("comida");
        Product p1=new Product("fruta");
        Item i1=new Item("pera");
        Item i2=new Item ("manzana");
        Item i3=new Item ("uvas");
        p1.setCategory(c1);
        p1.setDescription("Los siguientes productos son frutas");
        
        Product p2=new Product("vegetales");
        Item i4=new Item("pimenton");
        Item i5=new Item ("pepino");
        p2.setCategory(c1);
        p2.setDescription("Los siguientes productos son verduras");
        
        c1.addProduct(p1);
        c1.addProduct(p2);
        
        p1.additem(i1);
        p1.additem(i2);
        p1.additem(i3);
        p2.additem(i5);
        p2.additem(i4);
        
        c1.imprimirProducts();
    }
    
}
