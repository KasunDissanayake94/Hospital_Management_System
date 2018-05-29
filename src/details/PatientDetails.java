/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package details;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KasunDissanayake
 */
public class PatientDetails extends javax.swing.JFrame {
    //INITIALIZE VARIABLES
    Connection conn;
    ResultSet rs,rst;
    Statement stm;
    DefaultTableModel sessionModel;
    
    public PatientDetails() {
        initComponents();
        //SET BACKGROUND COLOUR
        getContentPane().setBackground(Color.lightGray);
        jPanel2.setBackground(Color.GRAY);
        //CALLING METHOD GETTABLEDATA()
        getTableData();
               
        
    }

    public void getTableData()
    {
        try
        {   
            //CREATE CONNECTION
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/hms","root",""); 
            //CRAETE TABLE SESSION
            sessionModel = (DefaultTableModel)jTable1.getModel();
            sessionModel.setRowCount(0);
            //EXECUTE QUERY AND GET THE SET OF DATA TO RESULT SET
            String query2 = "SELECT * FROM patientdetails" ;
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query2);
            while(rs.next())
            {
                //ENTER DATA TO THE TABLE WHILE RESULT SET IS EMPTY
                sessionModel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
            
            
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Patient Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 15, 387, 76));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIC", "Name", "Address", "Gender", "Phone", "Age", "Checkin", "Ward", "BedNo", "Disease"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1184, 419));

        jButton3.setText("Okay");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 750, 130, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC", "Name", "Address", "Gender", "Phone", "Age", "Checkin", "Ward", "BedNo", "Disease" }));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Search By");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 470, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Object selected=jComboBox1.getSelectedItem();
            String var=t1.getText();
            String var1=selected.toString();
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/hms","root","");
            stm = conn.createStatement();
            sessionModel = (DefaultTableModel)jTable1.getModel();
            sessionModel.setRowCount(0);
            System.out.println(var);
            System.out.println(var1);
            if(var1.toLowerCase().equals("name")){
                rst=stm.executeQuery("select * from patientdetails where Name='"+var+"'");            
            }
            else if (var1.toLowerCase().equals("nic")) {
                rst=stm.executeQuery("select * from patientdetails where NIC='"+var+"'");
            }
            else if (var1.toLowerCase().equals("address")) {
                rst=stm.executeQuery("select * from patientdetails where Address='"+var+"'");
            }
            else if (var1.toLowerCase().equals("gender")) {
                rst=stm.executeQuery("select * from patientdetails where Gender='"+var+"'");
            }
            else if (var1.toLowerCase().equals("phone")) {
                rst=stm.executeQuery("select * from patientdetails where Phone='"+var+"'");
            }
            else if (var1.toLowerCase().equals("age")) {
                rst=stm.executeQuery("select * from patientdetails where Age='"+var+"'");
            }
            else if (var1.toLowerCase().equals("checkin")) {
                rst=stm.executeQuery("select * from patientdetails where Check_in='"+var+"'");
            }
            else if (var1.toLowerCase().equals("ward")) {
                rst=stm.executeQuery("select * from patientdetails where Ward='"+var+"'");
            }
            else if (var1.toLowerCase().equals("bedno")) {
                
                rst=stm.executeQuery("select * from patientdetails where Bed_No='"+var+"'");
                
            }
            else{
                rst=stm.executeQuery("select * from patientdetails where Disease='"+var+"'");
            }
        
            
            if (!rst.next()) {
                JOptionPane.showMessageDialog(this, "Invalid Details", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            while(rst.next())
            {
                System.out.println("gusguf");
                //ENTER DATA TO THE TABLE WHILE RESULT SET IS EMPTY
                sessionModel.addRow(new Object[]{rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10)});
            
            
        }
            
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

   
}
