/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsalemanagement;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    Connection con = null;
    public NewJFrame1() {
        initComponents();
        createConnection();
    }
    
    void createConnection(){
        String className = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("Driver loaded Successfully");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
            System.out.println("Connection Successfull");
      
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver loding Failed");
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Connection Failed");
            System.out.println(ex.getMessage());
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pricet = new javax.swing.JTextField();
        datet = new javax.swing.JTextField();
        maket = new javax.swing.JTextField();
        modelt = new javax.swing.JTextField();
        manuyt = new javax.swing.JTextField();
        regyt = new javax.swing.JTextField();
        milaget = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        categoryt = new javax.swing.JTextField();
        tpt = new javax.swing.JTextField();
        namet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresst = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        nict = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        regnot = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Enter Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Owner");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Category");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Make");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Model");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Manu. Year");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Reg. Year");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Milage");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        pricet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pricet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 190, 30));

        datet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datet.setToolTipText("");
        datet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetActionPerformed(evt);
            }
        });
        getContentPane().add(datet, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 190, 30));

        maket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maketActionPerformed(evt);
            }
        });
        getContentPane().add(maket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, 30));

        modelt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(modelt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 190, 30));

        manuyt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(manuyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 190, 30));

        regyt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(regyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 190, 30));

        milaget.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(milaget, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Vehicle");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Reg. No.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("NIC");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        categoryt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryt.setToolTipText("");
        getContentPane().add(categoryt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 190, 30));

        tpt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tpt.setToolTipText("");
        tpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tptActionPerformed(evt);
            }
        });
        getContentPane().add(tpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 250, 30));

        namet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namet.setToolTipText("");
        namet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametActionPerformed(evt);
            }
        });
        getContentPane().add(namet, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 250, 30));

        addresst.setColumns(20);
        addresst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addresst.setRows(5);
        jScrollPane1.setViewportView(addresst);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 250, 100));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Telephone");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        nict.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nict.setToolTipText("");
        getContentPane().add(nict, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 190, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 90, -1));

        regnot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regnot.setToolTipText("");
        getContentPane().add(regnot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 190, 30));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametActionPerformed

    private void tptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //For vehicles
        String regno = regnot.getText();
        String category = categoryt.getText();
        String make = maket.getText();
        String model = modelt.getText();
        String manuy = manuyt.getText();
        String regy = regyt.getText();
        String milage = milaget.getText();
        String price = pricet.getText();
        
        //For owners
        String nic = nict.getText();
        String name = namet.getText();
        String address = addresst.getText();
        String tp = tpt.getText();
        String date = datet.getText();
        String regno1 = regnot.getText();
            /*Convert
            int num = Tnteger.parse(number);
            */
     
        try {
            /*//clesInsert vehicles
            PreparedStatement stmt = con.prepareStatement("INSERT INTO vehicle VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, regno);
            stmt.setString(2, category);
            stmt.setString(3, make);
            stmt.setString(4, model);
            stmt.setString(5, manuy);
            stmt.setString(6, regy);
            stmt.setString(7, milage);
            stmt.setString(8, price);
            
            //Insert owners
            PreparedStatement stmt = con.prepareStatement("INSERT INTO preowner VALUES(?,?,?,?,?)");
            stmt.setString(1, nic);
            stmt.setString(2, name);
            stmt.setString(3, address);
            stmt.setString(4, tp);
            stmt.setString(5, date);
            stmt.execute();*/
            
            
            Statement stm = con.createStatement();
            String sql ="INSERT INTO vehicle VALUES('"+regno+"','"+make+"','"+model+"','"+manuy+"','"+regy+"','"+category+"','"+milage+"','"+price+"')";
            String sql1 ="INSERT INTO preowner VALUES('"+nic+"','"+name+"','"+address+"','"+tp+"','"+date+"','"+regno1+"')";
            stm.executeUpdate(sql1);
            stm.executeUpdate(sql);
            //con.close()
            } catch (SQLException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
        JOptionPane.showMessageDialog(this,"Recorded adeed successfully");
        NewJFrame jf = new NewJFrame();
        jf.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void maketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maketActionPerformed

    private void datetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addresst;
    private javax.swing.JTextField categoryt;
    private javax.swing.JTextField datet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maket;
    private javax.swing.JTextField manuyt;
    private javax.swing.JTextField milaget;
    private javax.swing.JTextField modelt;
    private javax.swing.JTextField namet;
    private javax.swing.JTextField nict;
    private javax.swing.JTextField pricet;
    private javax.swing.JTextField regnot;
    private javax.swing.JTextField regyt;
    private javax.swing.JTextField tpt;
    // End of variables declaration//GEN-END:variables
}
