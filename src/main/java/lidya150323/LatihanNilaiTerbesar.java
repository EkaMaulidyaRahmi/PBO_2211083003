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
public class LatihanNilaiTerbesar {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int a,b,c;
      
        try
        {
            System.out.print("Entri nilai A : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai B : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai C : ");
            c = Integer.parseInt(dataIn.readLine());
            
            int max =0;
            if (a > max) {
                max = a;
            } else if (b > max){
                max =b;
            } else if (c > max){
                max =c;
            }
            
            System.out.println("Nilai terbesar : "+max);
        } catch (Exception ex){
        }
    }
}
