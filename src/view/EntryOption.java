
package view;

import Dao.InsertDataDao;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.Data;


public class EntryOption extends javax.swing.JFrame{

    
    public EntryOption() {
        initComponents();
        ineditable();
        txtbt.requestFocus();
        //btnsubmit.setEnabled(false);

    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        ldate = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        lheading = new javax.swing.JLabel();
        lbt = new javax.swing.JLabel();
        txtbt = new javax.swing.JTextField();
        lsname = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        lenroll = new javax.swing.JLabel();
        txtenroll = new javax.swing.JTextField();
        lbranch = new javax.swing.JLabel();
        txtbranch = new javax.swing.JTextField();
        lentries = new javax.swing.JLabel();
        txttimein = new javax.swing.JTextField();
        ltimeout = new javax.swing.JLabel();
        txttimeout = new javax.swing.JTextField();
        ltimein = new javax.swing.JLabel();
        txtentries = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entry Page");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        ldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ldate.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 48, 0, 0);
        jPanel1.add(ldate, gridBagConstraints);

        txtdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 4, 0, 0);
        jPanel1.add(txtdate, gridBagConstraints);

        lheading.setFont(new java.awt.Font("Arial for oup 97", 1, 30)); // NOI18N
        lheading.setForeground(new java.awt.Color(255, 0, 0));
        lheading.setText("Please Scan your Barcode");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 38, 0, 0);
        jPanel1.add(lheading, gridBagConstraints);

        lbt.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lbt.setText("BT no.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 43, 0, 0);
        jPanel1.add(lbt, gridBagConstraints);

        txtbt.setFont(new java.awt.Font("Arial for oup 97", 0, 22)); // NOI18N
        txtbt.setToolTipText("Enter your BT number");
        txtbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtActionPerformed(evt);
            }
        });
        txtbt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbtKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 399;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 38, 0, 0);
        jPanel1.add(txtbt, gridBagConstraints);

        lsname.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lsname.setText("Student Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 43, 0, 0);
        jPanel1.add(lsname, gridBagConstraints);

        txtsname.setFont(new java.awt.Font("Arial for oup 97", 0, 22)); // NOI18N
        txtsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsnameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 399;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 38, 0, 0);
        jPanel1.add(txtsname, gridBagConstraints);

        lenroll.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lenroll.setText("Enrollment no.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 43, 0, 0);
        jPanel1.add(lenroll, gridBagConstraints);

        txtenroll.setFont(new java.awt.Font("Arial for oup 97", 0, 22)); // NOI18N
        txtenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenrollActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 399;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 38, 0, 0);
        jPanel1.add(txtenroll, gridBagConstraints);

        lbranch.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lbranch.setText("Branch");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 43, 0, 0);
        jPanel1.add(lbranch, gridBagConstraints);

        txtbranch.setFont(new java.awt.Font("Arial for oup 97", 0, 22)); // NOI18N
        txtbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbranchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 399;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 38, 0, 0);
        jPanel1.add(txtbranch, gridBagConstraints);

        lentries.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        lentries.setText("No. of Entries Today");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 98, 0, 0);
        jPanel1.add(lentries, gridBagConstraints);

        txttimein.setFont(new java.awt.Font("Arial for oup 97", 0, 14)); // NOI18N
        txttimein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimeinActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 12, 0, 0);
        jPanel1.add(txttimein, gridBagConstraints);

        ltimeout.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        ltimeout.setText("Time Out");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 16, 0, 0);
        jPanel1.add(ltimeout, gridBagConstraints);

        txttimeout.setFont(new java.awt.Font("Arial for oup 97", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 22, 0, 0);
        jPanel1.add(txttimeout, gridBagConstraints);

        ltimein.setFont(new java.awt.Font("Arial for oup 97", 1, 18)); // NOI18N
        ltimein.setText("Time In");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 108, 0, 0);
        jPanel1.add(ltimein, gridBagConstraints);

        txtentries.setFont(new java.awt.Font("Arial for oup 97", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 26, 0, 0);
        jPanel1.add(txtentries, gridBagConstraints);

        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(0, 204, 0));
        btnsubmit.setMnemonic('s');
        btnsubmit.setText("Submit");
        btnsubmit.setToolTipText("Submit Button");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        btnsubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsubmitKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 30, 0, 0);
        jPanel1.add(btnsubmit, gridBagConstraints);

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear.setMnemonic('c');
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 39, 0, 0);
        jPanel1.add(btnclear, gridBagConstraints);

        jLabel2.setText("©Amit Kushwah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 49, 3, 2);
        jPanel1.add(jLabel2, gridBagConstraints);

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

    private void txtenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenrollActionPerformed

    private void txtbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbranchActionPerformed

    private void txtbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtbtActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        
        try
       {       
           String bt_1,sname_1,enroll_1,branch_1,timein_1,sdate_1,scount;
           int count;
           bt_1=txtbt.getText();
           InsertDataDao id=new InsertDataDao();
           Data D=null;
           Date date_1;
           D=id.searchByBtnoAndDate(bt_1);
           if(D!=null&&D.getTimeout().equals("not found"))
           {             
           sname_1=D.getSnmae();
           enroll_1=D.getEn();
           branch_1=D.getBranch();
           date_1=D.getDate2();
           timein_1=D.getTimein();
           count=D.getSno();
           scount=Integer.toString(count);
           
           txtsname.setText(sname_1);           
           txtenroll.setText(enroll_1);           
           txtbranch.setText(branch_1);
           txttimein.setText(timein_1);
           txtentries.setText(scount);
           
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
           sdate_1=sdf.format(date_1);
           txtdate.setText(sdate_1);
           String sdate; 
           SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm");
           txttimeout.setText(sdf2.format(new Date()));

           String bt2_1,sname2_1,enroll2_1,date2_1,branch2_1,stimein2_1,stimeout2_1,scount_1;
           int count_1;
            bt2_1=txtbt.getText();
            sname2_1=txtsname.getText();
            enroll2_1=txtenroll.getText();
            branch2_1=txtbranch.getText();
            date2_1=txtdate.getText();
            stimein2_1=txttimein.getText();
            stimeout2_1=txttimeout.getText();
            scount_1=txtentries.getText();
            count_1=Integer.parseInt(scount_1);
            Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(date2_1);
            D.setSno(count_1);
            D.setDate2(date1);
            D.setBt(bt2_1);
            D.setSnmae(sname2_1);
            D.setEn(enroll2_1);
            D.setBranch(branch2_1);
            D.setTimein(stimein2_1);
            D.setTimeout(stimeout2_1);   
            if(id.updateData(D))            
                System.out.println("Record updated"); 
           }
           else
           {        
           String bt,sname,enroll,branch;
           bt=txtbt.getText();
           D=id.searchByBtno(bt);
           if(D==null)
           {
               JOptionPane.showMessageDialog(this, "Record not found...");
               txtbt.requestFocus();
               txtbt.selectAll();
           }
           else
           {
           sname=D.getSnmae();
           txtsname.setText(sname);
           enroll=D.getEn();
           txtenroll.setText(enroll);
           branch=D.getBranch();
           txtbranch.setText(branch);
          
           Date date=new Date();
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
           SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm");
           txtdate.setText(sdf.format(date));
           txttimein.setText(sdf2.format(date));
           String stimeout="not found"; 
           txttimeout.setText(stimeout);
            String bt2,sname2,enroll2,branch2,date2,stimein;
            int n,sno;
            String count_11,scount_11;
            
            n=id.Sno(); 
           count_11=Integer.toString(n);
           txtentries.setText(count_11);
            bt2=txtbt.getText();
            sname2=txtsname.getText();
            enroll2=txtenroll.getText();
            branch2=txtbranch.getText();
            date2=txtdate.getText();
            stimein=txttimein.getText();
            scount_11=txtentries.getText();
            sno=Integer.parseInt(scount_11);
            SimpleDateFormat formater=new SimpleDateFormat("yyyy/MM/dd");
            Date date1=formater.parse(date2);
                        
            D.setDate2(date1);
            D.setBt(bt2);
            D.setSnmae(sname2);
            D.setEn(enroll2);
            D.setBranch(branch2);
            D.setTimein(stimein);
            D.setTimeout(stimeout);
            D.setSno(sno);
            
            if(id.insertDataEntryPage(D))
                System.out.println("Record inserted");
            }
           }
       }
       catch(Exception e)
       {
                   System.out.println(e);
       } 
        txtbt.requestFocus();
        txtbt.selectAll();
    }//GEN-LAST:event_btnsubmitActionPerformed
    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        
    }//GEN-LAST:event_txtdateActionPerformed

    private void txttimeinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimeinActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttimeinActionPerformed

    private void txtsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsnameActionPerformed

    private void btnsubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsubmitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitKeyPressed

    private void txtbtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbtKeyTyped
        if(evt.getKeyChar()==10){
        try
       {  
           
           String bt_1,sname_1,enroll_1,branch_1,timein_1,sdate_1,scount;
           int count;
           bt_1=txtbt.getText();
           InsertDataDao id=new InsertDataDao();
           Data D=null;
           Date date_1;
           D=id.searchByBtnoAndDate(bt_1);
           if(D!=null&&D.getTimeout().equals("not found"))
           {             
           sname_1=D.getSnmae();
           enroll_1=D.getEn();
           branch_1=D.getBranch();
           date_1=D.getDate2();
           timein_1=D.getTimein();
           count=D.getSno();
           scount=Integer.toString(count);
           
           txtsname.setText(sname_1);           
           txtenroll.setText(enroll_1);           
           txtbranch.setText(branch_1);
           txttimein.setText(timein_1);
           txtentries.setText(scount);
           
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
           sdate_1=sdf.format(date_1);
           txtdate.setText(sdate_1);
           String sdate; 
           SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm");
           txttimeout.setText(sdf2.format(new Date()));

           String bt2_1,sname2_1,enroll2_1,date2_1,branch2_1,stimein2_1,stimeout2_1,scount_1;
           int count_1;
            bt2_1=txtbt.getText();
            sname2_1=txtsname.getText();
            enroll2_1=txtenroll.getText();
            branch2_1=txtbranch.getText();
            date2_1=txtdate.getText();
            stimein2_1=txttimein.getText();
            stimeout2_1=txttimeout.getText();
            scount_1=txtentries.getText();
            count_1=Integer.parseInt(scount_1);
            Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(date2_1);
            D.setSno(count_1);
            D.setDate2(date1);
            D.setBt(bt2_1);
            D.setSnmae(sname2_1);
            D.setEn(enroll2_1);
            D.setBranch(branch2_1);
            D.setTimein(stimein2_1);
            D.setTimeout(stimeout2_1);   
            if(id.updateData(D))         
            {
                System.out.println("Record updated");    
            }
           }
           else
           {        
           String bt,sname,enroll,branch;
           bt=txtbt.getText();
           D=id.searchByBtno(bt);
           if(D==null)
           {
               JOptionPane.showMessageDialog(this, "Record not found...");
           }
           else
           {
           sname=D.getSnmae();
           txtsname.setText(sname);
           enroll=D.getEn();
           txtenroll.setText(enroll);
           branch=D.getBranch();
           txtbranch.setText(branch);
          
           Date date=new Date();
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
           SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm");
           txtdate.setText(sdf.format(date));
           txttimein.setText(sdf2.format(date));
           String stimeout="not found"; 
           txttimeout.setText(stimeout);
            String bt2,sname2,enroll2,branch2,date2,stimein;
            int n,sno;
            String count_11,scount_11;
            
            n=id.Sno(); 
           count_11=Integer.toString(n);
           txtentries.setText(count_11);
            bt2=txtbt.getText();
            sname2=txtsname.getText();
            enroll2=txtenroll.getText();
            branch2=txtbranch.getText();
            date2=txtdate.getText();
            stimein=txttimein.getText();
            scount_11=txtentries.getText();
            sno=Integer.parseInt(scount_11);
            SimpleDateFormat formater=new SimpleDateFormat("yyyy/MM/dd");
            Date date1=formater.parse(date2);
                        
            D.setDate2(date1);
            D.setBt(bt2);
            D.setSnmae(sname2);
            D.setEn(enroll2);
            D.setBranch(branch2);
            D.setTimein(stimein);
            D.setTimeout(stimeout);
            D.setSno(sno);
            
            if(id.insertDataEntryPage(D))
            {
                System.out.println("Record inserted");
            }
            }
           }
        }  
       
       catch(Exception e)
       {
                   System.out.println(e);
       }
         txtbt.selectAll();
        txtbt.requestFocus();
        }
    }//GEN-LAST:event_txtbtKeyTyped

    private void txtbtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbtKeyPressed
        // TODO add your handling code here:    
    }//GEN-LAST:event_txtbtKeyPressed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtbt.setText("");
        txtsname.setText("");
        txtenroll.setText("");
        txtbranch.setText("");
        txttimein.setText("");
        txttimeout.setText("");
        txtbt.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(EntryOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new EntryOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbranch;
    private javax.swing.JLabel lbt;
    private javax.swing.JLabel ldate;
    private javax.swing.JLabel lenroll;
    private javax.swing.JLabel lentries;
    private javax.swing.JLabel lheading;
    private javax.swing.JLabel lsname;
    private javax.swing.JLabel ltimein;
    private javax.swing.JLabel ltimeout;
    private javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtbt;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtenroll;
    private javax.swing.JTextField txtentries;
    private javax.swing.JTextField txtsname;
    private javax.swing.JTextField txttimein;
    private javax.swing.JTextField txttimeout;
    // End of variables declaration//GEN-END:variables

private void ineditable()
{
           txtsname.setEditable(false);
           txtenroll.setEditable(false);
           txtbranch.setEditable(false);
           txttimein.setEditable(false);
           txttimeout.setEditable(false);
           txtdate.setEditable(false);
           txtentries.setEditable(false);
}
}

