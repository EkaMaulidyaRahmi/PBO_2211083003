/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author ASUS F15
 */
public class Latihan1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int number = 0; int a;
        char letter = 0;
        boolean result = true;
        String str = "";
        
        try{
            System.out.print("Please enter str : ");
            str = dataIn.readLine();
            System.out.print("Please enter letter : ");
            letter = dataIn.readLine().charAt(0);
            System.out.print("8 mod 5 : ");
            a = Integer.parseInt(dataIn.readLine());
            if (a == 1)
            {
                result = true;
            } else 
            {
                result = false;
                System.out.println("The correzct answer is 1");
            }
            System.out.print("Please enter number : ");
            
            number = Integer.parseInt(dataIn.readLine());
        }
        catch( IOException e ){
            System.out.println("Error!");
            e.printStackTrace();
        }
        System.out.println("\nNumber : "+number);
        System.out.println("Letter : "+letter);
        System.out.println("Result : "+result);
        System.out.println("Str : "+str );
    }
}
