/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya290323;

/**
 *
 * @author ASUS F15
 */
public class TestPassByValue {
    public static void main(String []args) {
        int i = 10;
        //mencetak nilai i
        System.out.println(i);
        
        //memanggil method test
        //passing i pada method test
        test( i );
        
        //Mencetak nilai i
        System.out.println(i);
    }
    
    public static void test ( int j ) {
        //merubah nilai paramater j
        j = 33;
    }
}
