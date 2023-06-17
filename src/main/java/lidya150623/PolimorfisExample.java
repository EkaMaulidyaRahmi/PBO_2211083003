/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya150623;

/**
 *
 * @author ASUS F15
 */
public class PolimorfisExample {
    public static void main(String[] args) {
        Person ref;
        
        Student student =  new Student();
        Employee employee = new Employee();
        
        student.setName("Ali");
        ref = student;
        System.out.println("Nama    : "+ref.getName());
        employee.setName("Beni");
        ref = employee; //ref bisa jadi student, bisa juga employee ini disebut polimorfis
        System.out.println("Nama    : "+ref.getName());
    }
}
