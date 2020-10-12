/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Customer implements Serializable{
    private String name;
    private String lastname;
    private String phone;
    private double money;

    public Customer() {
    }

    public Customer(String name, String lastname, String phone, double money) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" 
                + "name=" + name 
                + ", lastname=" + lastname 
                + ", phone=" + phone 
                + ", money=" + money 
                + '}';
    }

    

    
    
    
    
}
