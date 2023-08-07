/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clerk;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class StudentTraining extends javax.swing.JFrame {

    String wgrade="";
    String tgrade="";
    
    /**
     * Creates new form RegisterStudent
     */
    public StudentTraining() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        grpwritten = new javax.swing.ButtonGroup();
        grptrial = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        cmbtime = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        btnclear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Student ID");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 30));

        txtid.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 130, 40));

        btnregister.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel4.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 50, 40));

        btnclear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear2.png"))); // NOI18N
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel4.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 50, 40));

        btnadd.setBackground(new java.awt.Color(0, 0, 102));
        btnadd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel4.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 50, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Date");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 50, 30));

        txtdate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtdate.setText("yyyy-mm-dd");
        txtdate.setToolTipText("");
        txtdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdateFocusGained(evt);
            }
        });
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        jPanel4.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Time");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 50, 30));

        tbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ScheduleID", "Date", "Time", "EmpID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 790, 270));

        cmbtime.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cmbtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9.00 A.M.", "11.30 A.M.", "2.00 P.M.", "4.30 P.M." }));
        jPanel4.add(cmbtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 120, 40));

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1030, 51));

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_test_passed_24px_2.png"))); // NOI18N
        jLabel1.setText("Student Training Records");
        jLabel1.setMinimumSize(new java.awt.Dimension(1030, 51));
        jLabel1.setPreferredSize(new java.awt.Dimension(1030, 51));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        lbldate.setText("Date");

        btnclear1.setBackground(new java.awt.Color(0, 0, 0));
        btnclear1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnclear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnclear1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbldate))))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1040, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearForm(){
        txtid.setText("");
        txtdate.setText("yyyy-mm-dd");
        DefaultTableModel dtm=(DefaultTableModel)tbl.getModel();
            dtm.setRowCount(0);
    }
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        search();
    }//GEN-LAST:event_btnregisterActionPerformed

    private void search(){
        DefaultTableModel dtm=(DefaultTableModel)tbl.getModel();
        dtm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT scheduleID FROM studenttrainingrecord WHERE studentID=?";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setObject(1,txtid.getText());
            ResultSet rst=pstm.executeQuery();
            ArrayList<String> arrayList = new ArrayList<String>();
            
            while (rst.next()) {
                arrayList.add(rst.getString(1));
            }
            
            for (String s : arrayList) {
                String getDateTime="SELECT date,time,empID FROM schedule WHERE scheduleID=?";
                PreparedStatement gDT=conn.prepareStatement(getDateTime);
                gDT.setObject(1,s);
                ResultSet rgDT=gDT.executeQuery();
                if (rgDT.next()) {
                    Object [] rowData={s,rgDT.getString(1),rgDT.getString(2),rgDT.getString(3)};
                    dtm.addRow(rowData);
                }
            }  
        
                            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        search();
    }//GEN-LAST:event_txtidActionPerformed

    private void txtdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusGained
        txtdate.setText("");
    }//GEN-LAST:event_txtdateFocusGained

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed

    }//GEN-LAST:event_txtdateActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT scheduleID FROM schedule WHERE date=? && time=?";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setObject(1,txtdate.getText());
            pstm.setObject(2,cmbtime.getSelectedItem()+"");
            ResultSet rst=pstm.executeQuery();
            
            if (rst.next()) {
                String sql2="INSERT INTO studenttrainingrecord VALUES(?,?)";
                PreparedStatement pstm2=conn.prepareStatement(sql2);
                pstm2.setObject(2, rst.getString(1));
                pstm2.setObject(1,txtid.getText());
                if (pstm2.executeUpdate()>0) {
                    JOptionPane.showMessageDialog(this, "Record added Successfully!!!");
                    updateNo(rst.getString(1));
                    search();
                }else{
                    JOptionPane.showMessageDialog(this, "Error while adding record!!!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Sorry, the schedule Date is wrong!!!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentTraining.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentTraining.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
        clerk.Dashboard frm=new clerk.Dashboard();
        frm.show();
        this.hide();
    }//GEN-LAST:event_btnclear1ActionPerformed

    private void updateNo(String id){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT noOfStudents FROM schedule WHERE scheduleID=?";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setObject(1,id);
            ResultSet rst=pstm.executeQuery();
            String no = "";
            if (rst.next()){
                no=rst.getString(1);
            }
            int num=Integer.parseInt(no);
            num--;
            String sql2="UPDATE schedule SET noOfStudents=? WHERE scheduleID=?";
            PreparedStatement pstm2=conn.prepareStatement(sql2);
            pstm2.setObject(1, num);
            pstm2.setObject(2,id);
            pstm2.executeUpdate();             
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentTraining.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentTraining.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
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
            java.util.logging.Logger.getLogger(StudentTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentTraining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTraining().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox<String> cmbtime;
    private javax.swing.ButtonGroup grptrial;
    private javax.swing.ButtonGroup grpwritten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}