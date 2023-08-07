/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clerk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewForm extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public ViewForm() {
        initComponents();
        loadAllSchedules();
        loadAllWritten();
        loadAllTrial();
        loadAllStudents();
        loadAllPayments();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblwritten = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbltrial = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblstudents = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnsearch3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblpayments = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtstudentID = new javax.swing.JTextField();
        btnsearch2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblschedules = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtconno = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        btnclear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(18, 19, 68));
        setMinimumSize(new java.awt.Dimension(1040, 620));
        setPreferredSize(new java.awt.Dimension(1040, 620));
        setSize(new java.awt.Dimension(1040, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 474, -1, -1));

        jPanel1.setMinimumSize(new java.awt.Dimension(1040, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        tblwritten.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblwritten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "No of Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblwritten);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Written Exams", jPanel4);

        tbltrial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbltrial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trial ID", "Date", "Category", "No of Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbltrial);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(200, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(208, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Trial Exams", jPanel5);

        tblstudents.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblstudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Full Name", "Address", "DOB", "NIC", "Con No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblstudents);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Student ID");

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidFocusGained(evt);
            }
        });
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        btnsearch3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnsearch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(btnsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane3.addTab("Students", jPanel6);

        tblpayments.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblpayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Payment Type", "Total Amount", "Paid Amount", "Amount to be paid", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblpayments);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Student ID");

        txtstudentID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtstudentID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtstudentIDFocusGained(evt);
            }
        });
        txtstudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentIDActionPerformed(evt);
            }
        });

        btnsearch2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnsearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(btnsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane3.addTab("Payments", jPanel7);

        tblschedules.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblschedules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "No of Students", "Emp ID", "Vehicle"
            }
        ));
        jScrollPane1.setViewportView(tblschedules);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Date");

        txtconno.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtconno.setText("yyyy-mm-dd");
        txtconno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtconnoFocusGained(evt);
            }
        });
        txtconno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconnoActionPerformed(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(txtconno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtconno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Training Schedules", jPanel2);

        jPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 930, 440));

        jPanel8.setBackground(new java.awt.Color(0, 102, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(1030, 51));

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        jLabel1.setText("View Details");
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnclear1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbldate))))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1040, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtconnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconnoActionPerformed
        searchSchedule();
    }//GEN-LAST:event_txtconnoActionPerformed

    private void txtconnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconnoFocusGained
        txtconno.setText("");
    }//GEN-LAST:event_txtconnoFocusGained

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        searchSchedule();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtstudentIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstudentIDFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentIDFocusGained

    private void txtstudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentIDActionPerformed
        searchPayments();
    }//GEN-LAST:event_txtstudentIDActionPerformed

    private void btnsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch2ActionPerformed
        searchPayments();
    }//GEN-LAST:event_btnsearch2ActionPerformed

    private void txtidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidFocusGained

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        searchStudent();
    }//GEN-LAST:event_txtidActionPerformed

    private void btnsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch3ActionPerformed
        searchStudent();
    }//GEN-LAST:event_btnsearch3ActionPerformed

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
        clerk.Dashboard frm=new clerk.Dashboard();
        frm.show();
        this.hide();
    }//GEN-LAST:event_btnclear1ActionPerformed

    private void searchSchedule(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String SQL="SELECT * FROM schedule WHERE date=?";
            PreparedStatement pstm=conn.prepareStatement(SQL);
            pstm.setObject(1,txtconno.getText());
            ResultSet rst=pstm.executeQuery();
            if (rst.next()) {
                DefaultTableModel dtm=(DefaultTableModel)tblschedules.getModel();
                dtm.setRowCount(0);
                Object [] rowData={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5)};
                dtm.addRow(rowData);
                while(rst.next()){
                    Object [] rowData2={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5)};
                    dtm.addRow(rowData2);
                }
            }else{
                JOptionPane.showMessageDialog(this, "There aren't any schedule for the date!!!");
                loadAllSchedules();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewForm.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    private void searchStudent(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String SQL="SELECT * FROM student WHERE studentID=?";
            PreparedStatement pstm=conn.prepareStatement(SQL);
            pstm.setObject(1,txtid.getText());
            ResultSet rst=pstm.executeQuery();
            if (rst.next()) {
                DefaultTableModel dtm=(DefaultTableModel)tblstudents.getModel();
                dtm.setRowCount(0);
                Object [] rowData={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(6),rst.getString(4),rst.getString(5)};
                dtm.addRow(rowData);
                while(rst.next()){
                    Object [] rowData2={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(6),rst.getString(4),rst.getString(5)};
                dtm.addRow(rowData2);
                }
            }else{
                JOptionPane.showMessageDialog(this, "There isn't a student from the above ID!!");
                loadAllStudents();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewForm.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    private void searchPayments(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String SQL="SELECT * FROM studentpayment WHERE studentID=?";
            PreparedStatement pstm=conn.prepareStatement(SQL);
            pstm.setObject(1,txtstudentID.getText());
            ResultSet rst=pstm.executeQuery();
            if (rst.next()) {
                DefaultTableModel dtm=(DefaultTableModel)tblpayments.getModel();
                dtm.setRowCount(0);
                Object [] rowData={rst.getString(4),rst.getString(2),rst.getString(3),rst.getString(5),rst.getString(6),rst.getString(7)};
                dtm.addRow(rowData);
                while(rst.next()){
                    Object [] rowData2={rst.getString(4),rst.getString(2),rst.getString(3),rst.getString(5),rst.getString(6),rst.getString(7)};
                    dtm.addRow(rowData2);
                }
            }else{
                JOptionPane.showMessageDialog(this, "There aren't any payments from the student ID!!!");
                loadAllPayments();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewForm.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    /**
     * @param args the command line arguments
     */
    
    private void loadAllSchedules(){
        DefaultTableModel dtm=(DefaultTableModel)tblschedules.getModel();
        dtm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT date,time,noOfStudents,empID,vehicle FROM schedule";
            PreparedStatement pstm=conn.prepareStatement(sql);
            ResultSet rst=pstm.executeQuery(); 
            while (rst.next()) {
                Object [] rowData={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5)};
                dtm.addRow(rowData);
            }  
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadAllStudents(){
        DefaultTableModel dtm=(DefaultTableModel)tblstudents.getModel();
        dtm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT * FROM student";
            PreparedStatement pstm=conn.prepareStatement(sql);
            ResultSet rst=pstm.executeQuery(); 
            while (rst.next()) {
                Object [] rowData={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(6),rst.getString(4),rst.getString(5)};
                dtm.addRow(rowData);
            }  
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadAllPayments(){
        DefaultTableModel dtm=(DefaultTableModel)tblpayments.getModel();
        dtm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT * FROM studentpayment";
            PreparedStatement pstm=conn.prepareStatement(sql);
            ResultSet rst=pstm.executeQuery(); 
            while (rst.next()) {
                Object [] rowData={rst.getString(4),rst.getString(2),rst.getString(3),rst.getString(5),rst.getString(6),rst.getString(7)};
                dtm.addRow(rowData);
            }  
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private void loadAllWritten(){
        DefaultTableModel dtm=(DefaultTableModel)tblwritten.getModel();
        dtm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT date,noOfStudents FROM writtenexam";
            PreparedStatement pstm=conn.prepareStatement(sql);
            ResultSet rst=pstm.executeQuery(); 
            while (rst.next()) {
                Object [] rowData={rst.getString(1),rst.getString(2)};
                dtm.addRow(rowData);
            }  
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     private void loadAllTrial(){
        DefaultTableModel dtm=(DefaultTableModel)tbltrial.getModel();
        dtm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT * FROM trial";
            PreparedStatement pstm=conn.prepareStatement(sql);
            ResultSet rst=pstm.executeQuery(); 
            while (rst.next()) {
                Object [] rowData={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4)};
                dtm.addRow(rowData);
            }  
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsearch2;
    private javax.swing.JButton btnsearch3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lbldate;
    private javax.swing.JTable tblpayments;
    private javax.swing.JTable tblschedules;
    private javax.swing.JTable tblstudents;
    private javax.swing.JTable tbltrial;
    private javax.swing.JTable tblwritten;
    private javax.swing.JTextField txtconno;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtstudentID;
    // End of variables declaration//GEN-END:variables
}