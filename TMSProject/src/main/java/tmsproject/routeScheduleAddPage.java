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
public class routeScheduleAddPage extends javax.swing.JFrame {

   int x,y;
   Connection conn;
   
    public routeScheduleAddPage() {
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
        
        String sql = "SELECT * FROM routeschedule";
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
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
        add = new javax.swing.JButton();
        RtSCode = new javax.swing.JTextField();
        RtSCustCode = new javax.swing.JTextField();
        RtSVehCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RtSRoute = new javax.swing.JTextField();
        RtSDate = new javax.swing.JTextField();
        RtSComm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RS Code", "RS Cust Code", "RS Veh Code", "RS Route", "RS Date", "RS Comment"
            }
        ));
        jScrollPane1.setViewportView(table);

        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setText("Add");
        add.setPreferredSize(new java.awt.Dimension(75, 40));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        RtSCustCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtSCustCodeActionPerformed(evt);
            }
        });

        RtSVehCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtSVehCodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Route Schedule Code");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Route Schedule Cust Code");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Route Schedule Veh Code");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Route Schedule Comment");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Route Schedule Date");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Route Schedule Route");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RtSVehCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(RtSComm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RtSCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(RtSDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RtSCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(RtSRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtSCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RtSRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtSCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RtSDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtSVehCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RtSComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String sql = "INSERT into routeschedule(RtsCode, RtsCustCode, RtsVehCode, RtsRoute, RtsDate, RtsComm) value(?,?,?,?,?,?)";
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, RtSCode.getText());
            pst.setString(2, RtSCustCode.getText());
            pst.setString(3, RtSVehCode.getText());
            pst.setString(4, RtSRoute.getText());
            pst.setString(5, RtSDate.getText());
            pst.setString(6, RtSComm.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            
            tableUpdate();
            
            RtSCode.setText("");
            RtSCustCode.setText("");
            RtSVehCode.setText("");
            RtSRoute.setText("");
            RtSDate.setText("");
            RtSComm.setText("");
            RtSCode.requestFocus();
            
            
            
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_addActionPerformed

    private void RtSCustCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtSCustCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtSCustCodeActionPerformed

    private void RtSVehCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtSVehCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtSVehCodeActionPerformed

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
            java.util.logging.Logger.getLogger(routeScheduleAddPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(routeScheduleAddPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(routeScheduleAddPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(routeScheduleAddPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new routeScheduleAddPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RtSCode;
    private javax.swing.JTextField RtSComm;
    private javax.swing.JTextField RtSCustCode;
    private javax.swing.JTextField RtSDate;
    private javax.swing.JTextField RtSRoute;
    private javax.swing.JTextField RtSVehCode;
    private javax.swing.JButton add;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgPhoto;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel iconBox;
    private javax.swing.JButton inquireButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton signoutButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

