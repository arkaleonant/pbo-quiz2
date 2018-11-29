/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arka.PboQuiz2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class TableTransaksi extends DefaultTableModel {
    //menyimpan nama kolom
    private String[] kolom;
    
    public TableTransaksi(){
        this.kolom = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }
    
    //kolom getter
    public String[] getKolomNama(){
        return  this.kolom;
    }
}
