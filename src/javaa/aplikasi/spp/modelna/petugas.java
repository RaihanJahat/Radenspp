/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaa.aplikasi.spp.modelna;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lib.modeldatabase;

/**
 *
 * @author Administrator
 */
public class petugas extends javax.swing.JInternalFrame {
    void kosong(){
    us.setText("");
    ps.setText("");
    np.setText("");
    bo.setSelectedItem("");
    }
private void muattabel() {
        DefaultTableModel kp = (DefaultTableModel) tb.getModel();

        kp.getDataVector().removeAllElements();

        String sql = "select * from petugas";

        modeldatabase md = new modeldatabase();

        ResultSet rs = md.ambildata(sql);
        try {
            while (rs.next()) {
               Vector baris = new Vector();
               baris.add(rs.getInt("id_petugas"));
               baris.add(rs.getString("username"));
               baris.add(rs.getString("password"));
               baris.add(rs.getString("nama_petugas"));
               baris.add(rs.getString("level"));
               kp.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(petugas.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        tb.setModel(kp);

    }
    /**
     * Creates new form petugas
     */
    public petugas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bo = new javax.swing.JComboBox<>();
        spm = new javax.swing.JButton();
        up = new javax.swing.JButton();
        hps = new javax.swing.JButton();
        btl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        status = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Data Petugas");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Petugas");

        np.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npActionPerformed(evt);
            }
        });

        jLabel5.setText("Level");

        bo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petugas", "Admin" }));

        spm.setText("Simpan");
        spm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spmMouseClicked(evt);
            }
        });

        up.setText("Update");
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upMouseClicked(evt);
            }
        });

        hps.setText("Hapus");
        hps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hpsMouseClicked(evt);
            }
        });

        btl.setText("Batal");
        btl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spm)
                    .addComponent(up))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hps)
                    .addComponent(btl))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Password", "Nama Petugas", "Level"
            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(status)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(status)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void npActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npActionPerformed

    private void spmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spmMouseClicked
        // TODO add your handling code here:
        String pk = us.getText();
        String pp = ps.getText();
        String k = np.getText();
        String l = (String) bo.getSelectedItem();
        
        String sql = "insert into spp(username,password,nama_petugas,level) values('"+pk+"','"+pp+"','"+k+"','"+l+"')";
        
        modeldatabase md = new modeldatabase();
        if(md.rubahdata(sql)){
            status.setText("data berhasil ditambah");
            muattabel();
            
        }else{
            status.setText("data gagal ditambah");
        }
        kosong();
    }//GEN-LAST:event_spmMouseClicked

    private void upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseClicked
        // TODO add your handling code here:
        int nobaris = tb.getSelectedRow();
        String id = tb.getValueAt(nobaris, 0).toString();
        String nm = us.getText();
        String p = ps.getText();
        String l = np.getText();
        String a = (String) bo.getSelectedItem();
        
        String sql = "update petugas set username='"+nm+"' ,password='"+p+"',nama_petugas='"+l+"',level='"+a+"'where id_spp="+id;
        
         modeldatabase md = new modeldatabase();
        if(md.rubahdata(sql)){
            status.setText("data berhasil diperbarui");
            muattabel();
            
        }else{
            status.setText("data gagal diperbarui");
        }
        kosong();
    }//GEN-LAST:event_upMouseClicked

    private void hpsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hpsMouseClicked
        // TODO add your handling code here:
        int nobaris = tb.getSelectedRow();
        String id = tb.getValueAt(nobaris, 0).toString();
        String sql = "delete from petugas where id_petugas="+id;
        
        
         modeldatabase md = new modeldatabase();
        if(md.rubahdata(sql)){
            status.setText("data berhasil dihapus");
            muattabel();
            
        }else{
            status.setText("data gagal dihapus");
        }
        kosong();
    }//GEN-LAST:event_hpsMouseClicked

    private void btlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btlMouseClicked
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btlMouseClicked

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // TODO add your handling code here:
        int nobaris = tb.getSelectedRow();
        us.setText(tb.getValueAt(nobaris, 1).toString());
        ps.setText(tb.getValueAt(nobaris, 2).toString());
        np.setText(tb.getValueAt(nobaris, 3).toString());
        bo.setSelectedItem(tb.getValueAt(nobaris, 4).toString());
    }//GEN-LAST:event_tbMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bo;
    private javax.swing.JButton btl;
    private javax.swing.JButton hps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField np;
    private javax.swing.JTextField ps;
    private javax.swing.JButton spm;
    private javax.swing.JLabel status;
    private javax.swing.JTable tb;
    private javax.swing.JButton up;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
