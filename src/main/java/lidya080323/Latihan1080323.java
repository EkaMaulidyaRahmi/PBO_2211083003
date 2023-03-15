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
public class Latihan1080323 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int number = 0;
        char letter;
        boolean result = true;
        String str = "";
        
        try{
            System.out.print("Please enter str : ");
            str = dataIn.readLine();
            System.out.print("Please enter letter : ");
            letter = dataIn.readLine().charAt(0); //char data = (char)dataIn.read();
            //System.out.print("Please enter result : ");
            System.out.print("Please enter number : ");
            
            number = Integer.parseInt(dataIn.readLine());
        }
        catch( IOException e ){
            System.out.println("Error!");
        }
        System.out.println("Number "+number);
        System.out.println("Letter: "+letter);
    }
}
