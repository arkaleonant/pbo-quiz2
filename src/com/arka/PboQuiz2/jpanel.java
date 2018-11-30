/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arka.PboQuiz2;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.ObjLongConsumer;
import static javafx.beans.binding.Bindings.isEmpty;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class jpanel extends javax.swing.JFrame {

    /**
     * Creates new form jpanel
     */
    
    //membuat variable2 yang membentuk aplikasi ini
    private int id = 0;
    private String code;
    private DefaultTableModel tbModel;
    private DefaultComboBoxModel cModel;
    private ArrayList<Item> belanja = new ArrayList<>();
    
    public jpanel() {
        this.tbModel = tbModel;
        this.cModel = cModel;
    }
    
    private void incId(){
        this.id += 1;
    }
    
    private void decId(){
        this.id -= 1;
    }
    
    private  Object[] addItem(String nama, int jumlah){
        float harga = 0;
        ComboModel items = new ComboModel();
        for(int i = 0 ; i < items.getHargaBarang().size(); i++){
            if(nama.equalsIgnoreCase(items.getJenisNama().get(i))){
                harga = items.getHargaBarang().get(i);
            }
        }
        Object[] obj = {
            nama,
            harga,
            jumlah
        };
        return obj;
    }
    
    private String code(){
        this.incId();
        String sk = new SimpleDateFormat("yyMMdd").format(new Date());
        this.code = String.format(sk + "%02d", this.id);
        return code;
    }
    
    private void updateJumlah(String nama, int add){
        ArrayList<String> item = new ArrayList<>();
        for(int i =0; i < tbModel.getRowCount(); i++){
            item.add(tbModel.getValueAt(i, 2).toString());
        }
        for(int i=0;i<item.size();i++){
            if(item.get(i).equals(nama)){
                int jumlah = new Integer(tbModel.getValueAt(i, 2).toString());
                tbModel.setValueAt(jumlah + add, i, 2);
            }
        }
    }
    
    private boolean Duplicate(String nama){
        boolean result = false;
        ArrayList<String> item = new ArrayList<>();
        for(int i=0; i < tbModel.getRowCount();i++){
            item.add(tbModel.getValueAt(i, 0).toString());
        }
        for(String i : item){
            if(i.equals(nama)){
                result = true;
            }
        }
        return result;
    }
    
    private void belanja(){
        if(isEmpty){
            this.saveButton.setEnabled(false);
            this.removeButton.setEnabled(false);
        } else {
            this.saveButton.setEnabled(true);
            this.removeButton.setEnabled(true);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        codeValue = new javax.swing.JTextField();
        itemCombo = new javax.swing.JComboBox<>();
        itemValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        transaksiTable = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("code");

        jLabel2.setText("items");

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        codeValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeValueActionPerformed(evt);
            }
        });

        itemCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        itemCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComboActionPerformed(evt);
            }
        });

        transaksiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(transaksiTable);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(codeValue))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(itemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(itemValue, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newButton, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(codeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addButton)))
                .addGap(18, 18, 18)
                .addComponent(removeButton)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemComboActionPerformed


    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
        // apabila newButton ditekan maka tombol bawahnya akan enabled
        this.itemValue.setText("1");
        this.newButton.setEnabled(false);
        this.cancelButton.setEnabled(true);
        this.addButton.setEnabled(true);
        this.itemValue.setEnabled(true);
        this.itemCombo.setEnabled(true);
        this.codeValue.setText(this.setCode());
    }//GEN-LAST:event_newButtonActionPerformed

        private void newTransaksi(){
        this.itemValue.setText(" ");
        this.codeValue.setText(" ");
        this.newButton.setEnabled(true);
        this.saveButton.setEnabled(false);
        this.cancelButton.setEnabled(false);
        this.addButton.setEnabled(false);
        this.removeButton.setEnabled(false);
        this.removeButton.setEnabled(false);
        this.itemValue.setEnabled(false);
        this.itemCombo.setEnabled(false);
        this.tbModel.setRowCount(0);
        this.belanja.clear();
    }
    @SuppressWarnings("unchecked")
    private void codeValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeValueActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_codeValueActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        try {
            for(int i=0; i<tbModel.getRowCount();i++){
                String nama = tbModel.getValueAt(i, 0).toString();
                float harga = new Float(tbModel.getValueAt(i, 1).toString());
                int jumlah = new Integer(tbModel.getValueAt(i, 2).toString());
                this.belanja.add(new Item(nama, harga, jumlah));
            }
            
            Transaksi transaksi = new Transaksi(this.code, this.belanja);
            
            StringBuilder sb = new StringBuilder();
            sb.append(transaksi.Pembayaran());
            JOptionPane.showMessageDialog(this, sb, "Transaksi", JOptionPane.INFORMATION_MESSAGE);
            newTransaksi();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String nama= this.itemCombo.getSelectedItem().toString();
        int jumlah = new Integer(this.itemValue.getText());
        if(Duplicate(nama)){
            updateJumlah(nama, jumlah);
        }else {
            tbModel.addRow(addItem(nama, jumlah));
        }
        this.belanja();
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        newTransaksi();
        this.decId();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if(transaksiTable.getSelectedRow() < 0){
            String sb = "Pilih item mau dihapus";
            JOptionPane.showMessageDialog(this, sb, "information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int count = transaksiTable.getSelectedRows().length;
            for(int i = 0; i<count;i++){
                tbModel.removeRow(transaksiTable.getSelectedRow());
            }
        }
        this.belanja();
    }//GEN-LAST:event_removeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField codeValue;
    private javax.swing.JComboBox<String> itemCombo;
    private javax.swing.JTextField itemValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable transaksiTable;
    // End of variables declaration//GEN-END:variables

    private String setCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
