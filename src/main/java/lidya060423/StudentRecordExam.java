/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya060423;

/**
 *
 * @author ASUS F15
 */
public class StudentRecordExam {
    public static void main( String[] args ) { //mengisi anna tanpa membuat banyak parameter
        StudentRecord anna = new StudentRecord("Anna","Padang");
        anna.nilai=0;  //int nilai; pada class StudentRecord hanya bisa diakses oleh annna
        anna.print("");
        
        System.out.println("Jumlah Record : "+StudentRecord.getStudentCount());
    }
}
