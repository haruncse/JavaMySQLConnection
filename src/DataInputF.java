
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MD. HARUN-AR-RASHID
 */
public class DataInputF extends javax.swing.JFrame {

    /**
     * Creates new form DataInputF
     */
    public DataInputF() {
        initComponents();
    }
    public String DS(String a){
    String sh;
    
    sh=a;
    System.out.println(sh);
    jTextArea1.setText(sh);
        return sh;
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
        insert_tf_nm = new javax.swing.JTextField();
        insert_tf_ag = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        insert_tf_id = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        i_s_m = new javax.swing.JLabel();
        ald_s = new javax.swing.JLabel();
        aldata = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MySQL Connection By Harun");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Gungsuh", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MySQL DataBase Connection Made By Harun");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 484, 26);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Insert Data :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 37, 80, 17);

        insert_tf_nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_tf_nmActionPerformed(evt);
            }
        });
        getContentPane().add(insert_tf_nm);
        insert_tf_nm.setBounds(220, 70, 188, 20);
        getContentPane().add(insert_tf_ag);
        insert_tf_ag.setBounds(480, 70, 78, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 70, 35, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 70, 30, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 101, 97, 31);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("UPDATE NAME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 210, 163, 31);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Id");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 70, 13, 17);

        insert_tf_id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        insert_tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_tf_idActionPerformed(evt);
            }
        });
        getContentPane().add(insert_tf_id);
        insert_tf_id.setBounds(50, 70, 110, 18);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 310, 110, 31);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Id");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 281, 13, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Delete Data :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 245, 82, 17);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(30, 280, 90, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Update Data : (You Have To Must Input Id)");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 138, 267, 17);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Id");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 177, 13, 17);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(33, 176, 116, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Name");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(167, 177, 35, 17);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11);
        jTextField11.setBounds(220, 176, 193, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Age");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(440, 170, 30, 22);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(480, 170, 78, 20);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("UPDATE AGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 210, 147, 31);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("SHOW ALL DATA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(200, 300, 220, 31);

        i_s_m.setText(" ");
        getContentPane().add(i_s_m);
        i_s_m.setBounds(164, 111, 140, 10);
        getContentPane().add(ald_s);
        ald_s.setBounds(868, 343, 0, 0);
        getContentPane().add(aldata);
        aldata.setBounds(129, 316, 0, 0);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jTextArea1.setCursor(null);
        jTextArea1.setOpaque(false);
        jTextArea1.setFocusable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 380, 600, 100);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 350, 280, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_tf_nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_tf_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert_tf_nmActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ID   =insert_tf_id.getText();
        String NAME   =insert_tf_nm.getText();
        String AGE =insert_tf_ag.getText() ;
         DataConnectionSql connect =new DataConnectionSql();
        try {
            //jTextArea1.setEditable(false);
                    connect.insetData(ID,NAME, AGE);
                    i_s_m.setText("Data Inserted Successfully");
             insert_tf_id.setText("");
        insert_tf_nm.setText("");
        insert_tf_ag.setText("") ;
        } catch (SQLException ex) {
            Logger.getLogger(DataInputF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insert_tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert_tf_idActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String ALL;
         DataConnectionSql connect =new DataConnectionSql();
         connect.getData();
         ALL=connect.getData();
//         DataInputF sho=new DataInputF();
//         ALL=sho.DS();
         jTextArea1.setText(ALL);
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String ID   =jTextField10.getText();
        String NAME   =jTextField11.getText();
        DataConnectionSql connect =new DataConnectionSql();
        try {
            connect.updateDatan(ID,NAME);
        } catch (SQLException ex) {
            Logger.getLogger(DataInputF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id=jTextField9.getText();
        DataConnectionSql connect =new DataConnectionSql();
        try {
            connect.deleteData(id);
        } catch (SQLException ex) {
            Logger.getLogger(DataInputF.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField9.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String ID   =jTextField10.getText();
        String AGE   =jTextField12.getText();
        DataConnectionSql connect =new DataConnectionSql();
        try {
            connect.updateDataa(ID, AGE);
        } catch (SQLException ex) {
            Logger.getLogger(DataInputF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataInputF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DataInputF().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ald_s;
    public javax.swing.JLabel aldata;
    private javax.swing.JLabel i_s_m;
    private javax.swing.JTextField insert_tf_ag;
    private javax.swing.JTextField insert_tf_id;
    private javax.swing.JTextField insert_tf_nm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    class jScrollPane1 {

        public jScrollPane1() {
        }
    }
}
