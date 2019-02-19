/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "products")
public class Products implements Serializable {
    @Id
    @Column(name="product_id")
    private int productId;
    
    @Column(name="product_name")
    private String productName;
    
    @Column(name="product_img")
    private Byte productImg;
    
    @Column(name="product_price")
    private int productPrice;
    
    @Column(name="product_qty")
    private int productQty;
    
    
    public Products() {}
    
    public Products(String productName,Byte productImg,int productPrice,int productQty){}
    
    
    
}
