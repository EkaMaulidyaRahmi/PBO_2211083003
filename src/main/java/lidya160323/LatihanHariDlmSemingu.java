/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya160323;

/**
 *
 * @author ASUS F15
 */
public class LatihanHariDlmSemingu {
    public static void main(String[] args) {
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"};
        
        //while-loop
        int i = 0;
        while(i < days.length){
            System.out.println(days[i]);
            i++;
        }
        
        System.out.println();
        
        // do-while loop
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);
        
        System.out.println();
        
        // for-loop
        for (int k = 0; k < days.length; k++) {
            System.out.println(days[k]);
        }
    }
}
