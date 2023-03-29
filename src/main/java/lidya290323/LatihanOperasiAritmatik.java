/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya290323;

/**
 *
 * @author ASUS F15
 */
public class LatihanOperasiAritmatik {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java OperasiAritmatik n1 n2");
            return;
        }
        
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        
        System.out.println("sum = " +(n1 + n2));
        System.out.println("difference = " +(n1 - n2));
        System.out.println("product = " +(n1 * n2));
        System.out.println("quotient = " +(n1 / n2));
    }
}
