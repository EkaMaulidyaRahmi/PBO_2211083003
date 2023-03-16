/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya080323;

/**
 *
 * @author ASUS F15
 */
public class Latihan3 {
    public static void main(String[] args){
        int number1 = 10, number2 =23, number3 = 5;
        int max;
        
        System.out.println("Number 1 : "+number1);
        System.out.println("Number 2 : "+number2);
        System.out.println("Number 3 : "+number3);
        
        //mencari nilai
        max = (number2>=number1)?number2:number3;
        max = (number3>=max)?number3:max;
        System.out.println("Highest number: "+max);
    }
}
