/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.controller;

import lidya240523.dao.*;
import lidya240523.model.*;
import lidya240523.view.FormBuku;
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
public class BukuController {
    FormBuku view;
    Buku model;
    BukuDao dao;
    
    public BukuController(FormBuku view) {
        try {
            this.view = view;
            dao = new BukuDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm() {
        view.getTxtKodeBuku().setText("");
        view.getTxtJudulBuku().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
    }
    
    public void insert() {
        try {
            model = new Buku();
            model.setKodeBuku(view.getTxtKodeBuku().getText());
            model.setJudulBuku(view.getTxtJudulBuku().getText());
            model.setPengarang(view.getTxtPengarang().getText());
            model.setPenerbit(view.getTxtPenerbit().getText());
            dao.insert(model);
            JOptionPane.showMessageDialog(view, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void update() {
        try {
            model.setKodeBuku(view.getTxtKodeBuku().getText());
            model.setJudulBuku(view.getTxtJudulBuku().getText());
            model.setPengarang(view.getTxtPengarang().getText());
            model.setPenerbit(view.getTxtPenerbit().getText());
            dao.update(model);
            JOptionPane.showMessageDialog(view, "Update Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void delete() {
        try {
            String kodeBuku = view.getTxtKodeBuku().getText();
            dao.delete(kodeBuku);
            JOptionPane.showMessageDialog(view, "Delete Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void getBuku() {
        try {
            String kodeBuku = view.getTblBuku().getValueAt(view.getTblBuku().getSelectedRow(), 0).toString();
            model = dao.getBuku(kodeBuku);
            if(model!=null) {
                view.getTxtKodeBuku().setText(model.getKodeBuku());
                view.getTxtJudulBuku().setText(model.getJudulBuku());
                view.getTxtPengarang().setText(model.getPengarang());
                view.getTxtPenerbit().setText(model.getPenerbit());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilTabel() {
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTblBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for (Buku buku1 : list) {
                Object[] row = {
                    buku1.getKodeBuku(),
                    buku1.getJudulBuku(),
                    buku1.getPengarang(),
                    buku1.getPenerbit()
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
