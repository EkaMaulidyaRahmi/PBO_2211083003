/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya300323;
import java.util.Scanner;

/**
 *
 * @author ASUS F15
 */
public class AritmatikaExample {
    public static void main(String[] args) {
        Aritmatika aritmatika = new Aritmatika();
        int c = aritmatika.tambah(10,5);
        System.out.println("C : "+c);
        System.out.println("Ganjil "+aritmatika.cekGanjil(c));
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int b = in.nextInt();
        int []ganjil = aritmatika.getGanjil(b);
        for(int i=0;i<ganjil.length;i++)
        {
            System.out.print(ganjil[i]+" ");
        }
    }
}
