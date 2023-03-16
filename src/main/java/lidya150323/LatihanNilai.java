/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya150323;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS F15
 */
public class LatihanNilai {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int a,b,c;
        int ave = 0;
        String smiley;
        
        try {
            String inputA = JOptionPane.showInputDialog("Entry score 1 : ");
            String inputB = JOptionPane.showInputDialog("Entry score 2 : ");
            String inputC = JOptionPane.showInputDialog("Entry score 3 : ");
        
            a = Integer.parseInt(inputA);
            b = Integer.parseInt(inputB);
            c = Integer.parseInt(inputC);
        
            ave = (a+b+c)/3;
            if (ave > 60)
               smiley = ":-)";
            else 
               smiley =":-(";
        
            String average = ("Your average is : "+ave+smiley);
            JOptionPane.showMessageDialog(null,average);
        } catch (Exception ex){
        }
    }
}
