/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya060423;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS F15
 */
public class LatihanBukuAlamatRecord {
    public static void main(String[] args) throws IOException {
        LatihanEntriBukuAlamat data[] = new LatihanEntriBukuAlamat[100];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );        
        int pil = 0;
        int index = 0;
        int in;
        while(pil != 5) {
            System.out.println("1. Entri Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Tampilkan");
            System.out.println("5. Exit");
            System.out.print("Pilih angka : ");
            pil = Integer.parseInt(dataIn.readLine());
            switch(pil) {
                case 1:
                    LatihanEntriBukuAlamat temp = new LatihanEntriBukuAlamat();
                    System.out.print("Nama        : ");
                    temp.setNama(dataIn.readLine());
                    data[index] = temp;
                    System.out.print("Alamat      : ");
                    temp.setAlamat(dataIn.readLine());
                    data[index] = temp;
                    System.out.print("Telp        : ");
                    temp.setTelp(dataIn.readLine());
                    data[index] = temp;
                    System.out.print("Email       : ");
                    temp.setEmail(dataIn.readLine());
                    data[index] = temp;
                    index++;
                    break;
                case 2:
                    System.out.print("Data ke : ");
                    LatihanEntriBukuAlamat hapus = new LatihanEntriBukuAlamat();
                    hapus.setNama(null);
                    data[index] = hapus;
                    hapus.setAlamat(null);
                    data[index] = hapus;
                    hapus.setTelp(null);
                    data[index] = hapus;
                    hapus.setEmail(null);
                    data[index] = hapus;
                    index--;
                    break;
                case 3:
                    System.out.print("Data ke : ");
                    LatihanEntriBukuAlamat edit = new LatihanEntriBukuAlamat();
                    System.out.print("Nama        : ");
                    edit.setNama(dataIn.readLine());
                    data[index] = edit;
                    System.out.print("Alamat      : ");
                    edit.setAlamat(dataIn.readLine());
                    data[index] = edit;
                    System.out.print("Telp        : ");
                    edit.setTelp(dataIn.readLine());
                    data[index] = edit;
                    System.out.print("Email       : ");
                    edit.setEmail(dataIn.readLine());
                    data[index] = edit;
                    index++;
                    break;
                case 4:
                default: //case 5
            }
        }
    }
}
