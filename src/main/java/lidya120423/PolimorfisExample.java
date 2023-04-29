/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya120423;

/**
 *
 * @author ASUS F15
 */
public class PolimorfisExample {
    public static void main(String[] args) {
        Person ref;     //person deklarasikan sbg ref
        Student student = new Student();
        Employee emp = new Employee();
        student.setName("Budi");
        student.setAddress("Padang");
        emp.setName("Doni");
        emp.setAddress("Bukittingi");
        
        ref = student;      //ref bisa berubah brdsrkan acuan, disebut dg POLIMORFIS
        String temp = ref.getName();
        System.out.println(temp);
        
        ref = emp;
        String temp1 = ref.getName();
        System.out.println(temp1);
        
        System.out.println("");
        
        printInformation(student);
        printInformation(emp);
    }
    
    public static void printInformation( Person p ) {
        if(p instanceof Student) {
            System.out.println("Nama    Student : "+p.getName());
            System.out.println("Alamat  Student : "+p.getAddress());
        } else if(p instanceof Employee) {
            System.out.println("Nama    Employee : "+p.getName());
            System.out.println("Alamat  Employee : "+p.getAddress());
        }
    }
}
