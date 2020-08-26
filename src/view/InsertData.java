/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import Dao.InsertDataDao;
import model.Data;

/**
 *
 * @author admin
 */
public class InsertData extends javax.swing.JFrame {

    /**
     * Creates new form InsertData
     */
    public InsertData() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        lbt = new javax.swing.JLabel();
        txtbt = new javax.swing.JTextField();
        lsname = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        lenroll = new javax.swing.JLabel();
        txtbranch = new javax.swing.JTextField();
        lbranch = new javax.swing.JLabel();
        txtenroll = new javax.swing.JTextField();
        bsubmit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insert Data");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        l1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 0, 255));
        l1.setText("Insert Student Data");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 59, 0, 0);
        jPanel1.add(l1, gridBagConstraints);

        lbt.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lbt.setText("BT no.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 47, 0, 0);
        jPanel1.add(lbt, gridBagConstraints);

        txtbt.setFont(new java.awt.Font("Arial for oup 97", 0, 22)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 399;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 4, 0, 0);
        jPanel1.add(txtbt, gridBagConstraints);

        lsname.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lsname.setText("Student Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 47, 0, 0);
        jPanel1.add(lsname, gridBagConstraints);

        txtsname.setFont(new java.awt.Font("Arial for oup 97", 0, 22)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 399;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 4, 0, 0);
        jPanel1.add(txtsname, gridBagConstraints);

        lenroll.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lenroll.setText("Enrollment no.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 47, 0, 0);
        jPanel1.add(lenroll, gridBagConstraints);

        txtbranch.setFont(new java.awt.Font("Arial for oup 97", 0, 22)); // NOI18N
        txtbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbranchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 399;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 4, 0, 0);
        jPanel1.add(txtbranch, gridBagConstraints);

        lbranch.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lbranch.setText("Branch");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 47, 0, 0);
        jPanel1.add(lbranch, gridBagConstraints);

        txtenroll.setFont(new java.awt.Font("Arial for oup 97", 0, 22)); // NOI18N
        txtenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenrollActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 399;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 4, 0, 0);
        jPanel1.add(txtenroll, gridBagConstraints);

        bsubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bsubmit.setMnemonic('s');
        bsubmit.setText("Submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 96, 0, 0);
        jPanel1.add(bsubmit, gridBagConstraints);

        jLabel5.setText("©Amit kushwah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 130, 3, 2);
        jPanel1.add(jLabel5, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbranchActionPerformed

    private void txtenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenrollActionPerformed

    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubmitActionPerformed
        // TODO add your handling code here:
        if(txtbt.getText().equals("")||txtsname.getText().equals("")||txtenroll.getText().equals("")||txtbranch.getText().equals(""))
        JOptionPane.showMessageDialog(this, "can not left blank");
             else
        {
        try
        {
            int n;
          n=JOptionPane.showConfirmDialog(this, "Are you Sure want to save", "Save Record",JOptionPane.YES_NO_OPTION);
        if(n==0)
        {
            String bt,sname,enroll,branch;
            bt=txtbt.getText();
            sname=txtsname.getText();
            enroll=txtenroll.getText();
            branch=txtbranch.getText();
            Data D=new Data();
            D.setBt(bt);
            D.setSnmae(sname);
            D.setEn(enroll);
            D.setBranch(branch);
            InsertDataDao id=new InsertDataDao();
            if(id.insertData(D))
            {
                JOptionPane.showMessageDialog(this, "Record inserted...");
            }
           txtbt.setText("");
           txtsname.setText("");
           txtenroll.setText("");
           txtbranch.setText("");
        }
         
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_bsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsubmit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel lbranch;
    private javax.swing.JLabel lbt;
    private javax.swing.JLabel lenroll;
    private javax.swing.JLabel lsname;
    private javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtbt;
    private javax.swing.JTextField txtenroll;
    private javax.swing.JTextField txtsname;
    // End of variables declaration//GEN-END:variables
}
