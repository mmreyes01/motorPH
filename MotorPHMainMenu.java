/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motorph;

/**
 * Main Menu for the MotorPH application.
 * <p>
 * Provides navigation to employee search, gross wage calculation, and net wage
 * calculation pages.
 *
 * @author Lance
 */
class MotorPHMainMenu extends javax.swing.JFrame {

    // Constants for button coloring changes
    private static final java.awt.Color LIGHT_BLUE = new java.awt.Color(203, 203, 239);
    private static final java.awt.Color WHITE = new java.awt.Color(255, 255, 255);
    private static final java.awt.Color RED = new java.awt.Color(191, 47, 47);

    /**
     * Creates new form MotorPHMainMenu
     */
    public MotorPHMainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblMotorPhHeader = new javax.swing.JLabel();
        lblMainMenuHeader = new javax.swing.JLabel();
        btnCalculateGrossWage = new javax.swing.JButton();
        btnSearchEmployee = new javax.swing.JButton();
        btnCalculateNetWage = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnManageLeave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        lblMotorPhHeader.setBackground(new java.awt.Color(255, 255, 255));
        lblMotorPhHeader.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblMotorPhHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotorPhHeader.setText("MotorPH Payroll System");
        lblMotorPhHeader.setOpaque(true);

        lblMainMenuHeader.setBackground(new java.awt.Color(223, 54, 54));
        lblMainMenuHeader.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        lblMainMenuHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblMainMenuHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainMenuHeader.setText("Main Menu");
        lblMainMenuHeader.setOpaque(true);

        btnCalculateGrossWage.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculateGrossWage.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnCalculateGrossWage.setText("Calculate gross wage");
        btnCalculateGrossWage.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnCalculateGrossWage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculateGrossWage.setFocusable(false);
        btnCalculateGrossWage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalculateGrossWageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalculateGrossWageMouseExited(evt);
            }
        });
        btnCalculateGrossWage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateGrossWageActionPerformed(evt);
            }
        });

        btnSearchEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchEmployee.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnSearchEmployee.setText("Search employee");
        btnSearchEmployee.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnSearchEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchEmployee.setFocusable(false);
        btnSearchEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchEmployeeMouseExited(evt);
            }
        });
        btnSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeActionPerformed(evt);
            }
        });

        btnCalculateNetWage.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculateNetWage.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnCalculateNetWage.setText("Calculate net wage");
        btnCalculateNetWage.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnCalculateNetWage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculateNetWage.setFocusable(false);
        btnCalculateNetWage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalculateNetWageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalculateNetWageMouseExited(evt);
            }
        });
        btnCalculateNetWage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateNetWageActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("I want to...");
        jLabel3.setMaximumSize(new java.awt.Dimension(93, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(93, 25));
        jLabel3.setOpaque(true);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusable(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnManageLeave.setBackground(new java.awt.Color(255, 255, 255));
        btnManageLeave.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnManageLeave.setText("Manage leave");
        btnManageLeave.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnManageLeave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageLeave.setFocusable(false);
        btnManageLeave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageLeaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageLeaveMouseExited(evt);
            }
        });
        btnManageLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLeaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMainMenuHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMotorPhHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSearchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculateNetWage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculateGrossWage, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addComponent(btnManageLeave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMotorPhHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMainMenuHeader)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculateGrossWage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculateNetWage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the action event of the search employee button to open the
     * employee search page.
     */
    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        // Open EmployeeSearchPage
        new EmployeeSearchPage().setVisible(true);
    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

    /**
     * Handles the action event of the calculate gross wage button to open the
     * gross wage calculation page.
     */
    private void btnCalculateGrossWageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateGrossWageActionPerformed
        // Open GrossWageCalculationPage
        new GrossWageCalculationPage().setVisible(true);
    }//GEN-LAST:event_btnCalculateGrossWageActionPerformed

    /**
     * Handles the action event of the calculate net wage button to open the net
     * wage calculation page.
     */
    private void btnCalculateNetWageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateNetWageActionPerformed
        // Open NetWageCalculationPage
        new NetWageCalculationPage().setVisible(true);
    }//GEN-LAST:event_btnCalculateNetWageActionPerformed

    /**
     * Handles the action event of the manage leave button to open the manage
     * leave page.
     */
    private void btnManageLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLeaveActionPerformed
        // Open ManageLeaveMenu
        new ManageLeaveMenu().setVisible(true);
    }//GEN-LAST:event_btnManageLeaveActionPerformed

    /**
     * Handles mouse hover event on the search employee button by changing its
     * background color.
     */
    private void btnSearchEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchEmployeeMouseEntered
        btnSearchEmployee.setBackground(LIGHT_BLUE);
    }//GEN-LAST:event_btnSearchEmployeeMouseEntered

    /**
     * Handles mouse exit event on the search employee button by resetting its
     * background color.
     */
    private void btnSearchEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchEmployeeMouseExited
        btnSearchEmployee.setBackground(WHITE);
    }//GEN-LAST:event_btnSearchEmployeeMouseExited

    /**
     * Handles mouse hover event on the calculate gross wage button by changing
     * its background color.
     */
    private void btnCalculateGrossWageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateGrossWageMouseEntered
        btnCalculateGrossWage.setBackground(LIGHT_BLUE);
    }//GEN-LAST:event_btnCalculateGrossWageMouseEntered

    /**
     * Handles mouse exit event on the calculate gross wage button by resetting
     * its background color.
     */
    private void btnCalculateGrossWageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateGrossWageMouseExited
        btnCalculateGrossWage.setBackground(WHITE);
    }//GEN-LAST:event_btnCalculateGrossWageMouseExited

    /**
     * Handles mouse hover event on the calculate net wage button by changing
     * its background color.
     */
    private void btnCalculateNetWageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateNetWageMouseEntered
        btnCalculateNetWage.setBackground(LIGHT_BLUE);
    }//GEN-LAST:event_btnCalculateNetWageMouseEntered

    /**
     * Handles mouse exit event on the calculate net wage button by resetting
     * its background color.
     */
    private void btnCalculateNetWageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateNetWageMouseExited
        btnCalculateNetWage.setBackground(WHITE);
    }//GEN-LAST:event_btnCalculateNetWageMouseExited

    /**
     * Handles mouse hover event on the manage leave button by changing its
     * background color.
     */
    private void btnManageLeaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageLeaveMouseEntered
        btnManageLeave.setBackground(LIGHT_BLUE);
    }//GEN-LAST:event_btnManageLeaveMouseEntered

    /**
     * Handles mouse exit event on the manage leave button by resetting its
     * background color.
     */
    private void btnManageLeaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageLeaveMouseExited
        btnManageLeave.setBackground(WHITE);
    }//GEN-LAST:event_btnManageLeaveMouseExited

    /**
     * Handles the action event of the exit button to exit the application.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit the application
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * Handles mouse hover event on the exit button by changing its background
     * color.
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(RED);
    }//GEN-LAST:event_btnExitMouseEntered

    /**
     * Handles mouse exit event on the exit button by resetting its background
     * color.
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(WHITE);
    }//GEN-LAST:event_btnExitMouseExited

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
            java.util.logging.Logger.getLogger(MotorPHMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorPHMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorPHMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorPHMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MotorPHMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateGrossWage;
    private javax.swing.JButton btnCalculateNetWage;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnManageLeave;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMainMenuHeader;
    private javax.swing.JLabel lblMotorPhHeader;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}