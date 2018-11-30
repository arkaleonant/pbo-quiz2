/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arka.PboQuiz2;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Transaksi {
    // membuat variable untuk kebutuhan class transaksi
    private final String kode;
    private ArrayList<Item> items = new ArrayList();
    private float total;

    //konstruktor kosong
    public Transaksi() {
        this.kode = null;
    }

    // konstruktor dari transaksi
    public Transaksi(String kode, ArrayList<Item> items) {
        this.kode = kode;
        this.items = items;
    }

    // setter untuk total
    public void setTotal() {
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    
    // ouput dari transaksi nanti
    public String Pembayaran(){
        setTotal();
        String obt = "";
        obt += "Kode \t\t : " + this.kode + "\n";
        obt += "Daftar Belanja : \n ";
        for(Item item : this.items){
            obt += "\t" + item.getNama() + "(" + item.getJumlah() + " ) : " + item.getTotal() + "\n" ;
        }
        obt += "Total\t\t : " + this.total;
        return obt;
    }
}
