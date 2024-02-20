
package view;

import controller.DashController;
import controller.LoginController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Dashboard extends javax.swing.JFrame {

    public static String name = LoginController.getCurrentUser();
    boolean liked = false;

  

    private void refresh() {
        Dashboard d = new Dashboard(name);
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.dispose();
    }

   

   

    public void createFriendLabels(List<String> usernames) {
        for (String username : usernames) {
            JLabel friendLabel = new JLabel("Friend: " + username);
            friendArea.append(username + "\n");
        }
    }

   
   


    public Dashboard(String user) {
        initComponents();

       


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        recomendScrollPane = new javax.swing.JScrollPane();
        recomendArea = new javax.swing.JTextArea();
        friendScrollPane = new javax.swing.JScrollPane();
        friendArea = new javax.swing.JTextArea();
        searchLabel = new javax.swing.JTextField();
        postArea = new javax.swing.JScrollPane();
        newPost = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Create new Post");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, -1));
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 80, 20));

        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 440, 30));

        recomendArea.setColumns(20);
        recomendArea.setRows(5);
        recomendScrollPane.setViewportView(recomendArea);

        getContentPane().add(recomendScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 430, 170));

        friendArea.setEditable(false);
        friendArea.setBackground(new java.awt.Color(255, 255, 255));
        friendArea.setColumns(20);
        friendArea.setRows(5);
        friendScrollPane.setViewportView(friendArea);

        getContentPane().add(friendScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 250, 420));

        searchLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLabelActionPerformed(evt);
            }
        });
        getContentPane().add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 300, 30));

        postArea.setOpaque(false);

        newPost.setEditable(false);
        newPost.setBackground(new java.awt.Color(255, 255, 255));
        newPost.setColumns(20);
        newPost.setLineWrap(true);
        newPost.setWrapStyleWord(true);
        newPost.setRows(5);
        postArea.setViewportView(newPost);

        getContentPane().add(postArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 430, 210));

        jLabel10.setText("Friend List");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        jLabel9.setText("People you may know");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("search");
        jLabel7.setToolTipText("");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 50, 30));

        jLabel6.setText("Search User");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 910, 550));

        jLabel12.setText("Friend List!");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchLabelActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard db = new Dashboard(name);
                db.setVisible(true);
                db.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea friendArea;
    private javax.swing.JScrollPane friendScrollPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea newPost;
    private javax.swing.JScrollPane postArea;
    private javax.swing.JTextArea recomendArea;
    private javax.swing.JScrollPane recomendScrollPane;
    private javax.swing.JTextField searchLabel;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
