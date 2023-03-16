/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya16032023;

/**
 *
 * @author ASUS F15
 */
public class LatihanBukuAlamat {
    public static void main(String[] args) {
        String entry [][] = {{"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}};
        
        int i = 0;
        for(i=0; i<entry.length; i++){
            System.out.println("Name\t\t: "+entry[i][0]);
            System.out.println("Tel. #\t\t: "+entry[i][1]);
            System.out.println("Address\t\t: "+entry[i][2]);
            System.out.println();
        }
    }
}
