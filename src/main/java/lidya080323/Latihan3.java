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
        int max = 0;
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        
        for (num1=1; num1>num2; num1++)
        {
            for (num1>num3)
            {
                max = num1;
            }
        }
            
        String  status = "";
        int grade = 80;
        
        //mendapatkan status pelajar
        status = (grade >= 60)?"Passed":"Fail";
        
        //print status
        System.out.println( status );
    }
}
