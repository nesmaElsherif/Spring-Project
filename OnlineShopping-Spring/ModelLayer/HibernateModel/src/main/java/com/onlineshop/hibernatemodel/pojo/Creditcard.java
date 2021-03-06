package com.onlineshop.hibernatemodel.pojo;
// Generated Apr 27, 2017 8:07:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Creditcard generated by hbm2java
 */
@Entity
@Table(name="creditcard"
    ,catalog="onlineshopping"
)
public class Creditcard  implements java.io.Serializable {


     private long number;
     private String expireDate;
     private Double balance;
     private Set users = new HashSet(0);

    public Creditcard() {
    }

	
    public Creditcard(long number) {
        this.number = number;
    }
    public Creditcard(long number, String expireDate, Double balance, Set users) {
       this.number = number;
       this.expireDate = expireDate;
       this.balance = balance;
       this.users = users;
    }
   
     @Id 

    
    @Column(name="number", unique=true, nullable=false)
    public long getNumber() {
        return this.number;
    }
    
    public void setNumber(long number) {
        this.number = number;
    }

    
    @Column(name="expireDate", length=45)
    public String getExpireDate() {
        return this.expireDate;
    }
    
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    
    @Column(name="balance", precision=22, scale=0)
    public Double getBalance() {
        return this.balance;
    }
    
    public void setBalance(Double balance) {
        this.balance = balance;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="creditcard")
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }




}


