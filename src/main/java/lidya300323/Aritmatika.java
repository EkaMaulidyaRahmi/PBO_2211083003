/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya300323;

/**
 *
 * @author ASUS F15
 */
public class Aritmatika { //membuat penjumlahan dan cek ganjil dengan file class dan main yang berbeda
    public int tambah(int a, int b) {
        return a + b;
    }
    
    public boolean cekGanjil(int a) {
        return (a % 2 != 0);
    }
    
    public int[] getGanjil(int n) {
        int []ganjil = new int[n];
        int i = 1, j = 0;
        
        for (i=1; j<n; i+=2) {
            ganjil[j] = i;
            j++;
        }
        return ganjil;
    }
}
