/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pachicojm.java_mysql_login_register;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

/**
 *
 * @author lokod
 */
public class user_home extends javax.swing.JFrame {

    /**
     * Creates new form user_landingpage
     */
    public user_home() {
        initComponents();
        
        // center the form
        setLocationRelativeTo(null);
        
        // rounded corners
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10)); 
        
        // setIcon as resized icon using resizeIcon method
        icon.setIcon(resizeIcon("/logo-light.png", 45, 40));
        jLabel_logout.setIcon(resizeIcon("/icons8-logout.png", 24, 24));
        jLabel_dashboard.setIcon(resizeIcon("/dashboard_illustration_freepik.jpg", 800, 560));
    }
    
    private Icon resizeIcon(String resourcePath, int width, int height) {
        ImageIcon icon = new ImageIcon(getClass().getResource(resourcePath));
        Image originalImage = icon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_firstname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_dashboard = new javax.swing.JLabel();
        jPanel_titlebar = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel_firstname.setFont(new java.awt.Font("Inter ExtraBold", 0, 36)); // NOI18N
        jLabel_firstname.setForeground(new java.awt.Color(230, 175, 46));
        jLabel_firstname.setText(" ");
        getContentPane().add(jLabel_firstname);
        jLabel_firstname.setBounds(421, 70, 100, 44);

        jLabel4.setFont(new java.awt.Font("Inter", 0, 36)); // NOI18N
        jLabel4.setText("Welcome,");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(242, 70, 167, 44);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 560));

        jLabel_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_illustration_freepik.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 800, 560);

        jPanel_titlebar.setBackground(new java.awt.Color(25, 23, 22));
        jPanel_titlebar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel_titlebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_titlebarMouseDragged(evt);
            }
        });
        jPanel_titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_titlebarMousePressed(evt);
            }
        });

        jLabel_exit.setFont(new java.awt.Font("Inter SemiBold", 1, 24)); // NOI18N
        jLabel_exit.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_exit.setText("x");
        jLabel_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Inter SemiBold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Inter SemiBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 175, 46));
        jLabel3.setText("Home");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-light.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Inter SemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User");

        jLabel_logout.setFont(new java.awt.Font("Inter SemiBold", 1, 24)); // NOI18N
        jLabel_logout.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-logout.png"))); // NOI18N
        jLabel_logout.setText("-");
        jLabel_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_titlebarLayout = new javax.swing.GroupLayout(jPanel_titlebar);
        jPanel_titlebar.setLayout(jPanel_titlebarLayout);
        jPanel_titlebarLayout.setHorizontalGroup(
            jPanel_titlebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titlebarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(255, 255, 255)
                .addComponent(jLabel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_exit)
                .addGap(20, 20, 20))
        );
        jPanel_titlebarLayout.setVerticalGroup(
            jPanel_titlebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titlebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_titlebarLayout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel_titlebar);
        jPanel_titlebar.setBounds(0, 0, 800, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_exitMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        // minimize window
        this.setState(user_home.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private int xMouse, yMouse;
    
    private void jPanel_titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_titlebarMouseDragged
        // get x and y coordinates of mouse on the screen
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        // change the location of panel to x and y location of mouse
        setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel_titlebarMouseDragged

    private void jPanel_titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_titlebarMousePressed
        // get x and y coordinates of mouse
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel_titlebarMousePressed

    private void jLabel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseClicked

        // Redirect the user to the sign-in page
        sign_in signIn = new sign_in();
        signIn.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(user_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_dashboard;
    private javax.swing.JLabel jLabel_exit;
    public javax.swing.JLabel jLabel_firstname;
    private javax.swing.JLabel jLabel_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_titlebar;
    // End of variables declaration//GEN-END:variables

}