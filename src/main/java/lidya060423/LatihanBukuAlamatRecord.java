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
                    System.out.print("Indeks data yang akan dihapus : ");
                    int idx = Integer.parseInt(dataIn.readLine());
                    if (idx >= 0 && idx < index) {
                        for (int i = idx; i < index - 1; i++) {
                            data[i] = data[i + 1];
                        }
                        index--;
                    } else {
                        System.out.println("Indeks tidak valid");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan indeks data yang akan diedit : ");
                    int idxEdit = Integer.parseInt(dataIn.readLine());
                    if (idxEdit >= 0 && idxEdit < index) {
                        LatihanEntriBukuAlamat dataEdit = data[idxEdit];
                        System.out.print("Nama        : ");
                        dataEdit.setNama(dataIn.readLine());
                        System.out.print("Alamat      : ");
                        dataEdit.setAlamat(dataIn.readLine());
                        System.out.print("Telp        : ");
                        dataEdit.setTelp(dataIn.readLine());
                        System.out.print("Email       : ");
                        dataEdit.setEmail(dataIn.readLine());
                    } else {
                        System.out.println("Indeks tidak valid");
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("=================================");
                    System.out.println("          Tampilan Data           ");
                    System.out.println("");
                    for(int i = 0; i < index; i++) {
                        data[i].print("");
                    }
                    break;
                    default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}
