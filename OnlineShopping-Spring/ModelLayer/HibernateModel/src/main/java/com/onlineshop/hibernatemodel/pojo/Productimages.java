package com.onlineshop.hibernatemodel.pojo;
// Generated Apr 27, 2017 8:07:42 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Productimages generated by hbm2java
 */
@Entity
@Table(name="productimages"
    ,catalog="onlineshopping"
)
public class Productimages  implements java.io.Serializable {


     private ProductimagesId id;
     private Products products;

    public Productimages() {
    }

    public Productimages(ProductimagesId id, Products products) {
       this.id = id;
       this.products = products;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="imageUrl", column=@Column(name="imageUrl", nullable=false, length=800) ), 
        @AttributeOverride(name="productsProductId", column=@Column(name="products_product_id", nullable=false) ) } )
    public ProductimagesId getId() {
        return this.id;
    }
    
    public void setId(ProductimagesId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="products_product_id", nullable=false, insertable=false, updatable=false)
    public Products getProducts() {
        return this.products;
    }
    
    public void setProducts(Products products) {
        this.products = products;
    }




}


