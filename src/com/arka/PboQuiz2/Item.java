/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arka.PboQuiz2;

/**
 *
 * @author User
 */
public class Item {
    // membuat variable untuk kebutuhan transaksi
    private String nama;
    private float harga;
    private int jumlah;
    
    //melakukan insert code constructor and getter setter 
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    // untuk mendapat hasil dari total
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    
    public String toString(){
        return this.nama;
    }
}