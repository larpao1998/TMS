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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexandre
 */
public class routeSummaryDeletePage extends javax.swing.JFrame {

   int x,y;
   Connection conn;
   
    public routeSummaryDeletePage() {
        String url ="jdbc:mysql://localhost:3306/tms database";
        String user = "TMS_User";
        String pass = "TMS2022";
        try{
            conn = DriverManager.getConnection(url, user, pass);
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
        
        
        
        initComponents();
        mainPanel.setBackground(new Color(0, 0, 0, 64));
        menuPanel.setBackground(new Color(0, 0, 0, 64));
        addButton.setBackground(new Color(0, 0, 0, 64));
        modifyButton.setBackground(new Color(0, 0, 0, 64));
        deleteButton.setBackground(new Color(0, 0, 0, 64));
        inquireButton.setBackground(new Color(0, 0, 0, 64));
        signoutButton.setBackground(new Color(0, 0, 0, 64));
        tableUpdate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    private void tableUpdate(){
        int c;
        
        String sql = "SELECT * FROM routesummary";
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3)});
            }//END while loop
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }//END tableUpdate
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        iconBox = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        inquireButton = new javax.swing.JButton();
        signoutButton = new javax.swing.JButton();
        bgPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(247, 235, 227));
        bg.setMinimumSize(new java.awt.Dimension(850, 450));
        bg.setPreferredSize(new java.awt.Dimension(860, 500));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconBox.setForeground(new java.awt.Color(255, 255, 255));
        iconBox.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexandre\\Documents\\GitHub\\TMS\\Images\\citynoBG.png")); // NOI18N
        bg.add(iconBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexandre\\Documents\\GitHub\\TMS\\Images\\icons8-x-24.png")); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        bg.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 0, -1, -1));

        mainPanel.setBackground(new java.awt.Color(247, 235, 227));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Country Code", "Country Name", "Country Abbreviation"
            }
        ));
        jScrollPane1.setViewportView(table);

        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.setPreferredSize(new java.awt.Dimension(75, 40));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        bg.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 30, -1, -1));

        menuPanel.setPreferredSize(new java.awt.Dimension(260, 434));

        addButton.setBackground(new java.awt.Color(109, 81, 59));
        addButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(242, 242, 242));
        addButton.setText("ADD");
        addButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.setPreferredSize(new java.awt.Dimension(39, 40));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        modifyButton.setBackground(new java.awt.Color(109, 81, 59));
        modifyButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        modifyButton.setForeground(new java.awt.Color(242, 242, 242));
        modifyButton.setText("MODIFY");
        modifyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modifyButton.setPreferredSize(new java.awt.Dimension(73, 40));
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(109, 81, 59));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(242, 242, 242));
        deleteButton.setText("DELETE");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.setPreferredSize(new java.awt.Dimension(69, 40));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        inquireButton.setBackground(new java.awt.Color(109, 81, 59));
        inquireButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        inquireButton.setForeground(new java.awt.Color(242, 242, 242));
        inquireButton.setText("INQUIRE");
        inquireButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inquireButton.setPreferredSize(new java.awt.Dimension(78, 40));
        inquireButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inquireButtonActionPerformed(evt);
            }
        });

        signoutButton.setBackground(new java.awt.Color(109, 81, 59));
        signoutButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signoutButton.setForeground(new java.awt.Color(242, 242, 242));
        signoutButton.setText("SIGN OUT");
        signoutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signoutButton.setPreferredSize(new java.awt.Dimension(78, 40));
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(modifyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inquireButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(signoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(inquireButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(signoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        bg.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 430));

        bgPhoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alexandre\\Documents\\GitHub\\TMS\\Images\\citySkylineDark860x500.png")); // NOI18N
        bg.add(bgPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new modifyPage().setVisible(true);
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new deletePage().setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void inquireButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inquireButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new inquirePage().setVisible(true);
    }//GEN-LAST:event_inquireButtonActionPerformed

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new signoutPage().setVisible(true);
    }//GEN-LAST:event_signoutButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addPage().setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_bgMouseDragged

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        DefaultTableModel model = (DefaultTableModel)table.getModel();
        int selectedIndex = table.getSelectedRow();
        
        String sql = "DELETE FROM routesummary";
        
        try{
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete record?", "WARNING",JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION){
                PreparedStatement pst = conn.prepareStatement(sql);
            
                //pst.setString(1, cCode.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted");

                tableUpdate();
                
                
            }//END if(YES) statement
            
            
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(routeSummaryDeletePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(routeSummaryDeletePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(routeSummaryDeletePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(routeSummaryDeletePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new routeSummaryDeletePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgPhoto;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel iconBox;
    private javax.swing.JButton inquireButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton signoutButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

