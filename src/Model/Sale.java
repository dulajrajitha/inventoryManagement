/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author dula
 */
@Entity
public class Sale {
    @Id
    private int id;
    private Supplier supplier;
    private Product product;
    private int quantity;
    private float uintPrice;

    public float getUintPrice() {
        return uintPrice;
    }

    public void setUintPrice(float uintPrice) {
        this.uintPrice = uintPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setUintPrice(int uintPrice) {
        this.uintPrice = uintPrice;
    }
    
    
}
