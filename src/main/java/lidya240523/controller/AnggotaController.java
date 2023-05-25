/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.controller;

import lidya240523.dao.*;
import lidya240523.model.*;
import lidya240523.view.*;
import java.sql.SQLException;
import lidya240523.database.DatabaseHelper;

/**
 *
 * @author ASUS F15
 */
public class AnggotaController {
    FormAnggota view;
    Anggota model;
    AnggotaDao dao;
    
    public AnggotaController(FormAnggota view) {
        this.view = view;
        try {
            dao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
        }
    }
    
    public void clearForm() {
        view.getTxtNobp().setText("");
        view.getTxtNama().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
    }
}
