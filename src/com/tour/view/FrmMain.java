/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tour.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rofiq
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
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

        tabPane = new javax.swing.JTabbedPane();
        btnDestinasi = new usu.widget.ButtonGlass();
        btnPaketTour = new usu.widget.ButtonGlass();
        btnPaket1 = new usu.widget.ButtonGlass();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tabPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1100, 800));

        btnDestinasi.setText("Destinasi");
        btnDestinasi.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btnDestinasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinasiActionPerformed(evt);
            }
        });
        getContentPane().add(btnDestinasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 51));

        btnPaketTour.setText("Paket");
        btnPaketTour.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btnPaketTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaketTourActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaketTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 51));

        btnPaket1.setText("Paket");
        btnPaket1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btnPaket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaket1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaket1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDestinasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinasiActionPerformed
        JButton closeButton = new JButton("x");
        FrmDest frmDest = new FrmDest(); // inisialisasi FrmUser
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Destinasi")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmDest); //masukkan ke tab
        tabPane.setSelectedComponent(frmDest);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmDest), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmDest);
            }
        });
    }//GEN-LAST:event_btnDestinasiActionPerformed

    private void btnPaketTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaketTourActionPerformed
        JButton closeButton = new JButton("x");
        FrmPaketTrip frmPaket = new FrmPaketTrip(); // inisialisasi FrmUser
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Paket Trip")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmPaket); //masukkan ke tab
        tabPane.setSelectedComponent(frmPaket);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmPaket), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmPaket);
            }
        });
    }//GEN-LAST:event_btnPaketTourActionPerformed

    private void btnPaket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaket1ActionPerformed
        JButton closeButton = new JButton("x");
        FrmPaketTour frmPaket = new FrmPaketTour(); // inisialisasi FrmUser
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Paket Tour")); //kasih title
        titlePanel.add(closeButton);
        tabPane.add(frmPaket); //masukkan ke tab
        tabPane.setSelectedComponent(frmPaket);
        tabPane.setTabComponentAt(tabPane.indexOfComponent(frmPaket), titlePanel);

        closeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                tabPane.remove(frmPaket);
            }
        });
    }//GEN-LAST:event_btnPaket1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btnDestinasi;
    private usu.widget.ButtonGlass btnPaket1;
    private usu.widget.ButtonGlass btnPaketTour;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane tabPane;
    // End of variables declaration//GEN-END:variables
}
