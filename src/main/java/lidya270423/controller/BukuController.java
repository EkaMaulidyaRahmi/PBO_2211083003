/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya270423.controller;
import lidya270423.model.*;
import lidya270423.view.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author ASUS F15
 */
public class BukuController {
    private FormBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(FormBuku formBuku) {
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm() {
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtTahun().setText("");
    }
    
    public void saveBuku() {
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert Ok");
    }
    
    public void tampil() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku1 : list) {
            Object row[] = {
                buku1.getKodeBuku(),
                buku1.getJudul(),
                buku1.getPengarang(),
                buku1.getPenerbit(),
                buku1.getTahun()
            };
            tabelModel.addRow(row);
        }
    }
}
