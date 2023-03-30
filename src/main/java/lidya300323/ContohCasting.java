/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya300323;

/**
 *
 * @author ASUS F15
 */
public class ContohCasting {
    public static void main(String[] args) {
        //valInt
        /*char valChar = 'a';  //a = kode ascii, jika di ubah A, maka output nya 65
        int valInt = valChar;
        System.out.print( valInt);
        */
        
        //valDouble
        double valDouble = 10.12;
        int valInt = (int)valDouble; //men-convert valDouble ke tipe int
        double x = 10.2;
        int y = 2;
        int result = (int)(x/y); //hasil typecast operasi ke int
        System.out.print( result);
    }
}
