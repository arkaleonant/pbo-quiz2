/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arka.PboQuiz2;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class ComboModel {
    private HashMap<String, Float> items = new HashMap<>();
    
    public ComboModel(){
       this.items.put("Gula", new Float(20000));
       this.items.put("Kopi", new Float(5000));
       this.items.put("Susu", new Float(15000));
    }
    
    public ArrayList<String> getJenisNama(){
}
