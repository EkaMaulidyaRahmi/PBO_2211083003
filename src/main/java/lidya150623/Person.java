/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya150623;

/**
 *
 * @author ASUS F15
 */
public class Person { //kalau class final tidak bisa di extend
    protected String name; // protected hanya boleh digunakan oleh subclassnya saja
    protected String address;
    
    /**
    * Default constructor
    */
    public Person(){
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }
    
    /**
    * Constructor dengan dua parameter
    */
    public Person( String name, String address ){
        this.name = name;
        this.address = address;
    }

    public String getName() {//kalau method final tidak bisa di override
        System.out.println("Parent: getName");
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
