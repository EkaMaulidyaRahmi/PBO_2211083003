/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya150323;

/**
 *
 * @author ASUS F15
 */
public class LatihanCetakSeratusKali {
    public static void main(String[] args) {
        String name = "Eka Maulidya Rahmi";
        int i = 0;
        
        //while-loop
        while (i < 100) {
            System.out.println(name);
            i++;
        }
        
        System.out.println();
        
        //do-while
        do {
            System.out.println(name);
            i++;
        } while (i < 100);
        
        System.out.println();
        
        //for loop
        for (i = 0; i < 100; i++) {
            System.out.println(name);
        }
    }
}
