/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

import com.sun.javafx.scene.control.SelectedCellsMap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KasunDissanayake
 */
public class AttendenceForm extends javax.swing.JFrame {
    //INITIALIZE VARIABLES
    Connection conn;
    Statement stm;
    ResultSet rst,rst1;
    String staff,date,level;
    int status;
    public AttendenceForm() {
        initComponents();
        //GET THE CURRENT DATE FROM THE SYSTEM
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        //SET DATE TO THE FIELD
        t2.setText(dateFormat.format(date));
        
    }
     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Attendence Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 32, 322, 70));

        jLabel2.setText("Staff ID");

        jButton1.setText("ATTEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Date");

        jLabel4.setText("Level");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse", "Receptionist", "Laboratory", "Maintainance Staff", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, 423, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 148, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 440, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //GET THE CONNECTION
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hms","root","");
            stm=conn.createStatement();
            staff=t1.getText(); 
            status=1;
            //GET THE SELECTED ITEM FROM THE COMBO BOX AND PASS IT TO CONDITIONS
            Object selected=jComboBox1.getSelectedItem();  
            if (selected.toString().toLowerCase().equals("doctor")){
                 level="doctor";
            }
            else if (selected.toString().toLowerCase().equals("nurse")) {
                 level="nurse";
            }
            else if (selected.toString().toLowerCase().equals("receptionist")) {
                 level="receptionist";
            }
            else{
                 level="maintainance";
            }
            String date=t2.getText();            
            if (level.equals("doctor")) {
                //CHECK WHETHER THE EMPLOYEE CURRENT ATTEND TO THE HOSPITAL AT THAT CURRENT DAY
                String sql2="Select count(*) from doc_attendance where staff_id='"+staff+"' and date='"+date+"'";                
                rst1=stm.executeQuery(sql2);
                rst1.next();
                String count=rst1.getString(1);
                int count1=Integer.parseInt(count);
                if (count1==1) {
                    //IF THIS EMPLOYEE ALREADY ATTEND SHOW ERROR MESSAGE
                    JOptionPane.showMessageDialog(this, "YOU CANNOT ATTEND TWICE AT SAME DAY!!!!!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    //IF NOT INSERT ATTENDANCE TO THE TABLE
                    String qry="Insert doc_attendance values('"+staff+"','"+level+"','"+date+"','"+status+"')";
                    stm.executeUpdate(qry);
                }
                
            }
            else if (level.equals("nurse")) {
                //CHECK WHETHER THE EMPLOYEE CURRENT ATTEND TO THE HOSPITAL AT THAT CURRENT DAY
                String sql2="Select count(*) from nurse_attendance where staff_id='"+staff+"' and date='"+date+"'";                
                rst1=stm.executeQuery(sql2);
                rst1.next();
                String count=rst1.getString(1);
                int count1=Integer.parseInt(count);
                if (count1==1) {
                    //IF THIS EMPLOYEE ALREADY ATTEND SHOW ERROR MESSAGE
                    JOptionPane.showMessageDialog(this, "YOU CANNOT ATTEND TWICE AT SAME DAY!!!!!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    //IF NOT INSERT ATTENDANCE TO THE TABLE
                    String qry="Insert nurse_attendance values('"+staff+"','"+level+"','"+date+"','"+status+"')";
                stm.executeUpdate(qry);
                }
                
            }
            else if (level.equals("maintainance")) {
                //CHECK WHETHER THE EMPLOYEE CURRENT ATTEND TO THE HOSPITAL AT THAT CURRENT DAY
                String sql2="Select count(*) from maintainance_attendance where staff_id='"+staff+"' and date='"+date+"'";                
                rst1=stm.executeQuery(sql2);
                rst1.next();
                String count=rst1.getString(1);
                int count1=Integer.parseInt(count);
                if (count1==1) {
                    //IF THIS EMPLOYEE ALREADY ATTEND SHOW ERROR MESSAGE
                    JOptionPane.showMessageDialog(this, "YOU CANNOT ATTEND TWICE AT SAME DAY!!!!!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    //IF NOT INSERT ATTENDANCE TO THE TABLE
                    String qry="Insert maintainance_attendance values('"+staff+"','"+level+"','"+date+"','"+status+"')";
                    stm.executeUpdate(qry);
                }
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
            java.util.logging.Logger.getLogger(AttendenceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendenceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendenceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendenceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendenceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JLabel t2;
    // End of variables declaration//GEN-END:variables
}
