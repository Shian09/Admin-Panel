/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import core.Connect;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nafiz
 */
public class MainActivity extends javax.swing.JFrame {

    private Object ResultSet;

    /**
     * Creates new form MainActivity
     */
    public MainActivity(Connect connect) {
        initComponents();
        this.connlocal = connect;
    }
    public MainActivity() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createTable = new javax.swing.JButton();
        ViewData = new javax.swing.JButton();
        insertInto = new javax.swing.JButton();
        viewtable = new javax.swing.JButton();
        delete_Table = new javax.swing.JButton();
        CustomQuery = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        disconnectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        createTable.setBackground(new java.awt.Color(255, 140, 0));
        createTable.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        createTable.setForeground(new java.awt.Color(255, 255, 255));
        createTable.setText("Create table");
        createTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTableActionPerformed(evt);
            }
        });

        disconnectButton.setBackground(new java.awt.Color(255, 140, 0));
        disconnectButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        disconnectButton.setForeground(new java.awt.Color(255, 255, 255));
        disconnectButton.setText("Disconnect");
        disconnectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    disconnectButtonMouseClicked(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        disconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectButtonActionPerformed(evt);
            }
        });

        ViewData.setBackground(new java.awt.Color(255, 140, 0));
        ViewData.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        ViewData.setForeground(new java.awt.Color(255, 255, 255));
        ViewData.setText("View Data");
        ViewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ViewDataActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        insertInto.setBackground(new java.awt.Color(255, 140, 0));
        insertInto.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        insertInto.setForeground(new java.awt.Color(255, 255, 255));
        insertInto.setText("Insert Data");
        insertInto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    insertIntoActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        viewtable.setBackground(new java.awt.Color(255, 140, 0));
        viewtable.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        viewtable.setForeground(new java.awt.Color(255, 255, 255));
        viewtable.setLabel("View All Tables");
        viewtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    viewtableActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        delete_Table.setBackground(new java.awt.Color(255, 140, 0));
        delete_Table.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        delete_Table.setForeground(new java.awt.Color(255, 255, 255));
        delete_Table.setText("Delete Table");
        delete_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    delete_TableActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        CustomQuery.setBackground(new java.awt.Color(255, 140, 0));
        CustomQuery.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        CustomQuery.setForeground(new java.awt.Color(255, 255, 255));
        CustomQuery.setText("Custom Query");
        CustomQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomQueryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 140, 0));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(disconnectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(delete_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                                .addComponent(ViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(viewtable, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(createTable, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(128, 128, 128)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(insertInto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(disconnectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(insertInto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(createTable, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewtable, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(delete_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 420);

        setSize(new java.awt.Dimension(918, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void CustomQueryActionPerformed(java.awt.event.ActionEvent evt) {
        CustomQuery customQuery = new CustomQuery(this.connlocal);
        dispose();
        customQuery.setVisible(true);// TODO add your handling code here:
    }

    private void delete_TableActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        ResultSet rset = null;
        try{
            Statement stmnt = connlocal.conn.createStatement();
            rset = stmnt.executeQuery("select table_name from user_tables");

        }catch(Exception ex){
            System.out.println("Exception: " + ex);
        }

        delete_table Delete = new delete_table(connlocal, rset);
        dispose();
        Delete.setVisible(true);// TODO add your handling code here:
    }

    private void viewtableActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

        ResultSet rset = null;
        try{
            Statement stmnt = connlocal.conn.createStatement();
            rset = stmnt.executeQuery("select table_name from user_tables");

        }catch(Exception ex){
            System.out.println("Exception: " + ex);
        }


        ViewTable viewTable = new ViewTable(connlocal, rset);
        dispose();
        viewTable.setVisible(true);// TODO add your handling code here:
    }

    private void insertIntoActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        ResultSet rset = null;
        try{
            Statement stmnt = connlocal.conn.createStatement();
             rset = stmnt.executeQuery("select table_name from user_tables");



        }catch(Exception ex){
            System.out.println("Exception: " + ex);
        }

        InsertInto insertInto = new InsertInto(connlocal, rset);
        dispose();
        insertInto.setVisible(true);// TODO add your handling code here:

    }

    private void ViewDataActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

        ResultSet rset = null;
        try{
            Statement stmnt = connlocal.conn.createStatement();
            rset = stmnt.executeQuery("select table_name from user_tables");

        }catch(Exception ex){
            System.out.println("Exception: " + ex);
        }

        ViewData viewData = new ViewData(connlocal, rset);
        dispose();
        viewData.setVisible(true);// TODO add your handling code here:
    }
    private void disconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            connlocal.conn.close();
            System.out.println("Disconnected.");
            JOptionPane.showMessageDialog(null, "Disconnected from Database");
        }catch (SQLException ex)
        {
            System.out.println("Exception " + ex);
        }
        ConnectToDatabase connect = new ConnectToDatabase();
        dispose();
        connect.setVisible(true);// TODO add your handling code here:
    }
    private void createTableActionPerformed(java.awt.event.ActionEvent evt) {
        CreateTable createTable = new CreateTable(this.connlocal);
        dispose();
        createTable.setVisible(true);// TODO add your handling code here:
    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);        // TODO add your handling code here:
    }
    private void disconnectButtonMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {

        try{
            connlocal.conn.close();
            System.out.println("Disconnected.");
        }catch (SQLException ex)
        {
            System.out.println("Exception " + ex);
        }
        System.out.println("Hi");
        ConnectToDatabase connect = new ConnectToDatabase();
        dispose();
        connect.setVisible(true);

// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton CustomQuery;
    private javax.swing.JButton ViewData;
    private javax.swing.JButton createTable;
    private javax.swing.JButton delete_Table;
    private javax.swing.JButton insertInto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton viewtable;
    public javax.swing.JButton disconnectButton;
    public Connect connlocal;
    // End of variables declaration
}
