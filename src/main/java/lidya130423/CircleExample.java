/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya130423;

/**
 *
 * @author ASUS F15
 */
public class CircleExample {
    public static void main(String[] args) {
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        boolean hasilInt = myInteger.isGreater(5, 6);
        boolean hasilDbl = myDouble.isGreater(6.4, 2.2);
        System.err.println("Hasil Integer " + hasilInt);
        System.err.println("Hasil Double " + hasilDbl);
        
        Relation mycircle = new Circle();
        Circle circle = new Circle(7,14);
        System.out.println("Circle" + getLuas);
    }
}
