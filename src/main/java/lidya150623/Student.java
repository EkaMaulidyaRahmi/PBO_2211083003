/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya150623;

/**
 *
 * @author ASUS F15
 */
public class Student extends Person{ //person superclass student subclass
    public Student(){
        super("Ani", "Padang");
        System.out.println("Inside Student:Constructor");
    }

    @Override
    public String getName() {
        System.out.println("Student: getName");
        return name;
    }
    
    public static void main(String[] args) {
        Student anna = new Student();
        anna.name = "Budi";
        anna.address = "Padang";
        System.out.println("Nama    : "+anna.name);
    }
}
