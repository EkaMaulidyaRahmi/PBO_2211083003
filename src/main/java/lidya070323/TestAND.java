/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya070323;

/**
 *
 * @author ASUS F15
 */
public class TestAND {
    public static void main(String[] args){
        int i = 0;
        int j = 10;
        boolean test = false;
        
        //demonstration &&
        test = (i > 10) && (j++ > 9); //dibandingkan
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi &
        test = (i > 10) & (j++ > 9); //dioperasikan
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}