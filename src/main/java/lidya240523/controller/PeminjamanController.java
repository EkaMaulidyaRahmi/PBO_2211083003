/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.controller;

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
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman model;
    PeminjamanDao dao;
    
    public PeminjamanController(FormPeminjaman view) {
        try {
            this.view = view;
            dao = new PeminjamanDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm() {
        view.getTxtNobp().setText("");
        view.getTxtKodeBuku().setText("");
        view.getTxtTglPinjam().setText("");
        view.getTxtTglKembali().setText("");
    }
    
    public void insert() {
        try {
            model = new Peminjaman();
            model.setNobp(view.getTxtNobp().getText());
            model.setKodeBuku(view.getTxtKodeBuku().getText());
            model.setTglPinjam(view.getTxtTglPinjam().getText());
            model.setTglKembali(view.getTxtTglKembali().getText());
            dao.insert(model);
            JOptionPane.showMessageDialog(view, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void update() {
        try {
            model.setNobp(view.getTxtNobp().getText());
            model.setKodeBuku(view.getTxtKodeBuku().getText());
            model.setTglPinjam(view.getTxtTglPinjam().getText());
            model.setTglKembali(view.getTxtTglKembali().getText());
            dao.update(model);
            JOptionPane.showMessageDialog(view, "Update Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void delete() {
        try {
            String nobp = view.getTxtNobp().getText();
            dao.delete(nobp);
            JOptionPane.showMessageDialog(view, "Delete Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void getPeminjaman() {
        try {
            String nobp = view.getTblPeminjaman().getValueAt(view.getTblPeminjaman().getSelectedRow(), 0).toString();
            model = dao.getPeminjaman(nobp);
            if(model!=null) {
                view.getTxtNobp().setText(model.getNobp());
                view.getTxtKodeBuku().setText(model.getKodeBuku());
                view.getTxtTglPinjam().setText(model.getTglPinjam());
                view.getTxtTglKembali().setText(model.getTglKembali());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilTabel() {
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTblPeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Peminjaman> list = dao.getAll();
            for (Peminjaman peminjaman1 : list) {
                Object[] row = {
                    peminjaman1.getNobp(),
                    peminjaman1.getKodeBuku(),
                    peminjaman1.getTglPinjam(),
                    peminjaman1.getTglKembali()
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
