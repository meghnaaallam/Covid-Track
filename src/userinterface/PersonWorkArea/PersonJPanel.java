/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PersonWorkArea;

/**
 *
 * @author hetalp
 */
public class PersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    public PersonJPanel() {
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

        btnCitywiseVaccinationStatus = new javax.swing.JButton();
        btnTotalPositiveCases = new javax.swing.JButton();
        btnHospitalWiseAvailableBeds = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCitywiseVaccinationStatus.setBackground(new java.awt.Color(0, 0, 0));
        btnCitywiseVaccinationStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnCitywiseVaccinationStatus.setText("Citywise Vaccination Status");
        btnCitywiseVaccinationStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitywiseVaccinationStatusActionPerformed(evt);
            }
        });
        add(btnCitywiseVaccinationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 230, 30));

        btnTotalPositiveCases.setBackground(new java.awt.Color(0, 0, 0));
        btnTotalPositiveCases.setForeground(new java.awt.Color(255, 255, 255));
        btnTotalPositiveCases.setText("Total Positive Cases");
        btnTotalPositiveCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPositiveCasesActionPerformed(evt);
            }
        });
        add(btnTotalPositiveCases, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 231, 30));

        btnHospitalWiseAvailableBeds.setBackground(new java.awt.Color(0, 0, 0));
        btnHospitalWiseAvailableBeds.setForeground(new java.awt.Color(255, 255, 255));
        btnHospitalWiseAvailableBeds.setText("Hospital Wise Available Beds");
        btnHospitalWiseAvailableBeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalWiseAvailableBedsActionPerformed(evt);
            }
        });
        add(btnHospitalWiseAvailableBeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PATIENT PANEL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 550, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCitywiseVaccinationStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitywiseVaccinationStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCitywiseVaccinationStatusActionPerformed

    private void btnTotalPositiveCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPositiveCasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTotalPositiveCasesActionPerformed

    private void btnHospitalWiseAvailableBedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalWiseAvailableBedsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHospitalWiseAvailableBedsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitywiseVaccinationStatus;
    private javax.swing.JButton btnHospitalWiseAvailableBeds;
    private javax.swing.JButton btnTotalPositiveCases;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
