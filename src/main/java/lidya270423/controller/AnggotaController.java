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
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm() {
        formAnggota.getTxtKodeAnggota().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void saveAnggota() {
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert Ok");
    }
    
    public void tampil() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota1 : list) {
            Object row[] = {
                anggota1.getKodeAnggota(),
                anggota1.getNamaAnggota(),
                anggota1.getAlamat()
            };
            tabelModel.addRow(row);
        }
    }
}
