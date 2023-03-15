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
public class LatihanNilai1{
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int a,b,c;
        String smiley = "";
        
        try
        {
            System.out.print("Entry score A : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entry score B : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entry score C : ");
            c = Integer.parseInt(dataIn.readLine());
            
            int avg = (a + b + c)/3;
            
            if(avg >= 60){
                smiley = ":-)";
            } else if(avg < 60) {
                smiley = ":-(";
            }
            
            System.out.print("Your average is : " +avg+" "+smiley);
        } catch (Exception ex){
        }
    }
}
