/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya150323;
import java.util.Scanner;
/**
 *
 * @author ASUS F15
 */
public class LatihanPerpangkatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, pangkat, hasil = 1, i;

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();

        System.out.print("Masukkan pangkat : ");
        pangkat = input.nextInt();
        
        i = 1;
        //while loop
        while (i <= pangkat) {
            hasil *= angka;
            i++;
        }

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
        
        System.out.println();
        
        //do-while loop
        do {
            hasil *= angka;
            i++;
        } while (i <= pangkat);

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
        
        System.out.println();
        
        //for loop
        for (i = 1; i <= pangkat; i++) {
            hasil *= angka;
        }

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
    }
}
