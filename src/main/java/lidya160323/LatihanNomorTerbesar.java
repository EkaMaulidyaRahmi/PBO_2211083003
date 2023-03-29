/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya160323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS F15
 */
public class LatihanNomorTerbesar {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        try {
            for (int i = 0; i < 10; i++) {
                String input = JOptionPane.showInputDialog(null, "Enter a number:");
                numbers[i] = Integer.parseInt(input);
            }

            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            JOptionPane.showMessageDialog(null, "The maximum number is: " + max);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
        }
    }
}
