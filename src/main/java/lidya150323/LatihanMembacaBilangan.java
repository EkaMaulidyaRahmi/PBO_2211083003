/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS F15
 */
import java.util.Scanner;

public class LatihanMembacaBilangan {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan angka antara 1-10: ");
            int angka = Integer.parseInt(br.readLine());
            String kata = "";

            if (angka == 1) {
                kata = "Satu";
            } else if (angka == 2) {
                kata = "Dua";
            } else if (angka == 3) {
                kata = "Tiga";
            } else if (angka == 4) {
                kata = "Empat";
            } else if (angka == 5) {
                kata = "Lima";
            } else if (angka == 6) {
                kata = "Enam";
            } else if (angka == 7) {
                kata = "Tujuh";
            } else if (angka == 8) {
                kata = "Delapan";
            } else if (angka == 9) {
                kata = "Sembilan";
            } else if (angka == 10) {
                kata = "Sepuluh";
            } else {
                kata = "Invalid number";
            }
            System.out.println(kata);
        } catch (Exception e) {
        }
    }
}

