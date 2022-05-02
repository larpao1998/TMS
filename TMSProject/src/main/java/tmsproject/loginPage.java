/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tmsproject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Alexandre
 */
public class loginPage extends TMSProject {

    int x,y;
    
    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
        username.setBackground(new Color(0, 0, 0, 64));
        password.setBackground(new Color(0, 0, 0, 64));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        usernameIcon = new javax.swing.JLabel();
        passwordIcon = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        userSeparator = new javax.swing.JSeparator();
        passSeparator = new javax.swing.JSeparator();
        bgPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(16, 53, 94));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setPreferredSize(new java.awt.Dimension(621, 344));
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexandre\\Documents\\GitHub\\TMS\\Images\\icons8-x-24.png")); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        bg.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        usernameIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexandre\\Documents\\GitHub\\TMS\\Images\\usernameIcon2.png")); // NOI18N
        bg.add(usernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        passwordIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexandre\\Documents\\GitHub\\TMS\\Images\\passwordIcon.png")); // NOI18N
        bg.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        username.setBackground(new java.awt.Color(237, 237, 237));
        username.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        bg.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 200, 30));

        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.setPreferredSize(new java.awt.Dimension(90, 27));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        bg.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 200, 30));

        login.setText("Login");
        login.setPreferredSize(new java.awt.Dimension(75, 27));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        bg.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 110, -1));

        userSeparator.setBackground(new java.awt.Color(255, 255, 255));
        userSeparator.setForeground(new java.awt.Color(255, 255, 255));
        userSeparator.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userSeparator.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userSeparator.setPreferredSize(new java.awt.Dimension(80, 10));
        bg.add(userSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 127, 205, 35));

        passSeparator.setBackground(new java.awt.Color(255, 255, 255));
        passSeparator.setForeground(new java.awt.Color(255, 255, 255));
        passSeparator.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passSeparator.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passSeparator.setPreferredSize(new java.awt.Dimension(80, 10));
        bg.add(passSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 177, 205, 35));

        bgPhoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexandre\\Documents\\GitHub\\TMS\\Images\\citySkylineDark621x344.png")); // NOI18N
        bgPhoto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgPhotoMouseDragged(evt);
            }
        });
        bgPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgPhotoMousePressed(evt);
            }
        });
        bg.add(bgPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bgMousePressed

    private void bgPhotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgPhotoMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_bgPhotoMousePressed

    private void bgPhotoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgPhotoMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_bgPhotoMouseDragged

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        //setVisible(false);
        //new homePage().setVisible(true);
        String url ="jdbc:mysql://localhost:3306/tms database";
        String user = "TMS_User";
        String pass = "TMS2022";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "select * from users where username=? and password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username.getText());
            pst.setString(2, password.getText());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login Successful");
                setVisible(false);
                new homePage().setVisible(true);
            }//END if statement
            else {
                JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
                username.setText("");
                password.setText("");
            }//END else statement 
            conn.close();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }//END catch
    }//GEN-LAST:event_loginActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgPhoto;
    private javax.swing.JLabel exit;
    private javax.swing.JButton login;
    private javax.swing.JSeparator passSeparator;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JSeparator userSeparator;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameIcon;
    // End of variables declaration//GEN-END:variables
}
