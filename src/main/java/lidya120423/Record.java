/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya120423;

/**
 *
 * @author ASUS F15
 */
public class Record extends StudentRecord {
    public Record() {
        super("Budi", "Padang",12);
        //super(78,47,88);
        System.out.println("Inside Student:Constructor");
    }
    
    @Override
    public String getName() {
        System.out.println("getName Record");
        return name;
    }
    
    public static void main(String[] args) {
        Record record = new Record();;
        record.setEnglishGrade(56);
    }
}
