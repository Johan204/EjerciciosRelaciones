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
public class Item extends DomainObject {
    private String name;
    private double unitCost ;
    private Product product;

    public Item(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public Product getProduct() {
        return product;
    }
    
    
    
    
}
