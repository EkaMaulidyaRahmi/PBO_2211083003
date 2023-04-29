/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya120423;

/**
 *
 * @author ASUS F15
 */
public class Student extends Person{
    public Student() {
        super("Budi","Padang");      //memanggil class Person yang memiliki dua parameter
        super.name = "Budi";         // cara ke2 menggunakan super
        System.out.println("Inside Student:Constructor");
    }
    
    @Override        // override = mengizinkan nama sama dg super class
    public String getName() {
        System.out.println("getName Student");
        return name;
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ali");
        student.setAddress("Padang");
        // karna pada class Person menggunakan protected bisa langsung
        student.name="Ali";
        student.address="Padang";
    }
}
