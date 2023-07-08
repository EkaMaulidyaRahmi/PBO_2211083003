/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.controller;

import java.sql.Connection;
import lidya240523.dao.*;
import lidya240523.model.*;
import lidya240523.view.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lidya240523.database.DatabaseHelper;

/**
 *
 * @author ASUS F15
 */
public class PengembalianController {
    FormPengembalian formPengembalian;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    Pengembalian pengembalian;
    
    Connection connection;
    
    public PengembalianController(FormPengembalian formPengembalian) {
        try {
            this.formPengembalian = formPengembalian;
            connection = DatabaseHelper.getConnection();
            pengembalianDao = new PengembalianDaoImpl(connection);
            peminjamanDao = new PeminjamanDaoImpl(connection);
            anggotaDao = new AnggotaDaoImpl(connection);
            bukuDao = new BukuDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm() {
        formPengembalian.getTxtDenda().setText(" ");
        formPengembalian.getTxtTerlambat().setText(" ");
        formPengembalian.getTxtTglDikembalikan().setText(" ");
        formPengembalian.getTxtTglPinjam().setText(" ");
    }
    
    public void isiComboAnggota() {
        try {
            formPengembalian.getCboNobp().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for (Anggota anggota : list) {
                formPengembalian.getCboNobp().addItem(anggota.getNobp() + "-" + anggota.getNama());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiComboBuku() {
        try {
            formPengembalian.getCboKodeBuku().removeAllItems();
            List<Buku> list = bukuDao.getAll();
            for (Buku buku : list) {
                formPengembalian.getCboKodeBuku().addItem(buku.getKodeBuku() + "-" + buku.getJudulBuku());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert() {
        try {
            pengembalian = new Pengembalian();
            pengembalian.setNobp(formPengembalian.getCboNobp().getSelectedItem().toString().split("-")[0]);
            pengembalian.setKodeBuku(formPengembalian.getCboKodeBuku().getSelectedItem().toString().split("-")[0]);
            pengembalian.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
            pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
            pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
            pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
            pengembalianDao.insert(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Pengembalian Ok");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPengembalian() {
        try {
            pengembalian = new Pengembalian();
            String nobp = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 0).toString();
            String kodeBuku = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 2).toString();
            String tglPinjam = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 4).toString();
            Peminjaman peminjaman = peminjamanDao.getPeminjaman(nobp, kodeBuku, tglPinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getAnggota().getNobp());
            formPengembalian.getCboNobp()
                    .setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
            Buku buku = bukuDao.getBuku(peminjaman.getBuku().getKodeBuku());
            formPengembalian.getCboKodeBuku()
                    .setSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            formPengembalian.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPengembalian.getTxtTglDikembalikan().setText(pengembalian.getTglDikembalikan());
            int terlambat = pengembalianDao
                    .selisihTanggal(pengembalian.getTglDikembalikan(), peminjaman.getTglKembali());
            pengembalian.setTerlambat(terlambat);
            formPengembalian.getTxtTerlambat().setText(""+terlambat);
            formPengembalian.getTxtDenda().setText(""+pengembalian.getDenda());
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilTabel() {
        try {
            DefaultTableModel tableModel
                    = (DefaultTableModel) formPengembalian.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> list = pengembalianDao.getAll();
            for (Pengembalian p : list) {
                Anggota anggota = anggotaDao.getAnggota(p.getNobp());
                Buku buku = bukuDao.getBuku(p.getKodeBuku());
                Peminjaman peminjaman = peminjamanDao.getPeminjaman(p.getNobp(), p.getKodeBuku(), p.getTglPinjam());
                Object[] row = {
                    anggota.getNobp(),
                    anggota.getNama(),
                    buku.getKodeBuku(),
                    buku.getJudulBuku(),
                    p.getTglPinjam(),
                    peminjaman.getTglKembali(),
                    p.getTglDikembalikan(),
                    p.getTerlambat(),
                    p.getDenda()
                };
                tableModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update() {
        try {
            pengembalian.setNobp(formPengembalian.getCboNobp().getSelectedItem().toString().split("-")[0]);
            pengembalian.setKodeBuku(formPengembalian.getCboKodeBuku().getSelectedItem().toString().split("-")[0]);
            pengembalian.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
            pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
            pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
            pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
            pengembalianDao.update(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Entri Ok");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete() {
        try {
            pengembalianDao.delete(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Delete Data Ok");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
