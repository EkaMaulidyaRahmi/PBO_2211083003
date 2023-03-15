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
public class LatihanMeanDari3Angka {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int a;
        int b;
        int c;
        
        try
        {
            System.out.print("Entri nilai A : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai B : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai C : ");
            c = Integer.parseInt(dataIn.readLine());
            
            int d = (a + b + c)/3;
            System.out.println("Rata-rata : "+d);
        } catch (Exception ex){
        }
    }
}
