/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya130423;

/**
 *
 * @author ASUS F15
 */
public class Circle {
    private double r;
    private double d;
    
    public Circle() {
        
    }
    
    public Circle(double r, double d) {
        this.r = r;
        this.d = d;
    }
    
    public double getLuas() {
        double luas = 3.14*r*r;
        return luas;
    }
    
    public double getKeliling() {
        double kll = 3.14*d;
        return kll;
    }
}
