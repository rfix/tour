package com.tour.view;

import com.tour.control.CtlPaketTour;
import com.tour.model.PaketTour;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import koneksiReport.koneksi;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rofiq
 */
public class FrmPaketTour extends javax.swing.JPanel {

    private List<PaketTour> lstPaketTour;
    private PaketTour paketTour;
    private DefaultTableModel dtm;
    private int baris;
    private String proses;
    
    // <editor-fold defaultstate="collapsed" desc="Variable Print">
    CtlPaketTour ctlPaketTour = new CtlPaketTour();
    koneksi koneksi = new koneksi();
    JasperDesign jasperDesign;
    JasperReport jasperReport;
    JasperPrint jasperPrint;
    HashMap<String, Object> param = new HashMap<String, Object>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // </editor-fold>

     private void refresTabel(){
        dtm = (DefaultTableModel) tblPaketTour.getModel();
        dtm.setRowCount(0);
        for(PaketTour tour : lstPaketTour){
            dtm.addRow(new Object[]{
                tour.getId(),
                tour.getNamaPaket(),
                tour.getWaktu(),
                tour.getDestinasi().getNamaDestinasi(),
                tour.getDestinasi2(),
                tour.getDestinasi3(),
                tour.getDestinasi3(),
                tour.getDestinasi4(),
                tour.getDestinasi5(),
                tour.getDestinasi6(),
                tour.getDestinasi7(),
                tour.getKeterangan()
            });
        }
        if (tblPaketTour.getRowCount() > 0){
            baris = tblPaketTour.getRowCount() - 1;
            tblPaketTour.setRowSelectionInterval(baris, baris);
            proses = "";
        }
    }
    
	/**
	 * Creates new form FrmKaryawanBorong
	 */
	public FrmPaketTour() {
            initComponents();
            initTable();
	}


	private void initTable() {
            DefaultTableModel model = new DefaultTableModel();
            String[] columnNames = {"Id", "Nama","Waktu","Dest 1","Dest 2","Dest 3","Dest 4", "Dest 5"
            ,"Dest 6","Dest 7", "keterangan"};
            model.setColumnIdentifiers(columnNames);
            tblPaketTour.setModel(model);
            CtlPaketTour ctlPaketTour = new CtlPaketTour();
            lstPaketTour = ctlPaketTour.retrieve(); // panggil fungsi retrieve
            for (PaketTour tour : lstPaketTour) {
		model.addRow(new Object[]{
                    tour.getId(),
                    tour.getNamaPaket(),
                    tour.getWaktu(),
                    tour.getDestinasi().getNamaDestinasi(),
                    tour.getDestinasi2(),
                    tour.getDestinasi3(),
                    tour.getDestinasi3(),
                    tour.getDestinasi4(),
                    tour.getDestinasi5(),
                    tour.getDestinasi6(),
                    tour.getDestinasi7(),
                    tour.getKeterangan()
                });
            }
	}
        
        private void searchByNama() {
            DefaultTableModel model = new DefaultTableModel();
            String[] columnNames = {"Id", "Nama","Waktu","Dest 1","Dest 2","Dest 3","Dest 4", "Dest 5"
            ,"Dest 6","Dest 7", "keterangan"};
            model.setColumnIdentifiers(columnNames);
            tblPaketTour.setModel(model);
            CtlPaketTour ctlPaketTour = new CtlPaketTour();
            lstPaketTour = ctlPaketTour.getByNama(txtSearchNama.getText()); // panggil fungsi retrieve
            for (PaketTour tour : lstPaketTour) {
                model.addRow(new Object[]{
                    tour.getId(),
                    tour.getNamaPaket(),
                    tour.getWaktu(),
                    tour.getDestinasi().getNamaDestinasi(),
                    tour.getDestinasi2(),
                    tour.getDestinasi3(),
                    tour.getDestinasi3(),
                    tour.getDestinasi4(),
                    tour.getDestinasi5(),
                    tour.getDestinasi6(),
                    tour.getDestinasi7(),
                    tour.getKeterangan()
                    
                });
            }
        }
        
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearchNama = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnPrintReport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaketTour = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(911, 731));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 30));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 30));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 40, 30));

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, 30));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtSearchNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchNamaFocusLost(evt);
            }
        });
        txtSearchNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchNamaKeyTyped(evt);
            }
        });
        add(txtSearchNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 90, -1));

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        btnPrintReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jasper.png"))); // NOI18N
        btnPrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReportActionPerformed(evt);
            }
        });
        add(btnPrintReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 30));

        tblPaketTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPaketTour);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1500, 220));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1380, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        FrmEditPaketTour frmEditPaketTour = new FrmEditPaketTour(); // inisialisasi FrmEditKaryawan
        frmEditPaketTour.setTitle("Tambah Data Karyawan Borong"); // set Title FrmEditKaryawanBorong
        frmEditPaketTour.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                initTable(); // ketika frmEditKaryawanBorong di tutup, refresh tabel
            }
        });
        frmEditPaketTour.setVisible(true); // Menampilkan FrmEditKaryawanBorong

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
		if (tblPaketTour.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih Karyawan terlebih dahulu");
		} else {
			PaketTour paketTour = lstPaketTour.get(tblPaketTour.getSelectedRow()); // ambil data KaryawanBorong yang di select
			FrmEditPaketTour frmEditPaketTour = new FrmEditPaketTour(); // insialisasi FrmEditKaryawanBorong
			frmEditPaketTour.setTitle("Edit Data " + paketTour.getNamaPaket()); // set title frmEditKaryawanBorong
                        
			frmEditPaketTour.setPaketTour(paketTour); // set karyawan yang mau diedit
			frmEditPaketTour.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosed(WindowEvent e) {
					initTable(); // ketika frmEditKaryawan di tutup, refresh tabel
				}
			});
			frmEditPaketTour.setVisible(true); //menampilkan frmEditKaryawanBorong
		}
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
		if (tblPaketTour.getSelectedRow() == -1) { //cek apakah user telah memilih baris tabel atau belum
			JOptionPane.showMessageDialog(this, "Silahkan pilih Karyawan terlebih dahulu");
		} else {
			PaketTour paketTour = lstPaketTour.get(tblPaketTour.getSelectedRow()); // mengambil data KaryawanBorong yang di select
			// memunculkan option dialog
			if (JOptionPane.showConfirmDialog(this, "Apakah Anda yakin menghapus data ?" + paketTour.getNamaPaket(), "Hapus Karyawan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
				CtlPaketTour ctlPaketTour = new CtlPaketTour(); // inisialisasi CntlKaryawanBorong
				ctlPaketTour.Hapus(paketTour.getId()); // panggil funsi hapus
				initTable(); // refresh tabel
			}
		}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
		initTable();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       searchByNama();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReportActionPerformed
        try {
            File file = new File("C:/Users/rofiq/Desktop/exe/src/report/RptKaryawanBorong.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.put("nama", txtSearchNama.getText().trim());
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, koneksi.getKoneksi());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnPrintReportActionPerformed

    private void txtSearchNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNamaKeyTyped
        lstPaketTour = ctlPaketTour.getByNama(txtSearchNama.getText().trim());
        searchByNama();
    }//GEN-LAST:event_txtSearchNamaKeyTyped

    private void txtSearchNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNamaFocusGained
       String s = txtSearchNama.getText();
       if (s.equalsIgnoreCase("Cari....")){
           txtSearchNama.setText("");
       }
    }//GEN-LAST:event_txtSearchNamaFocusGained

    private void txtSearchNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNamaFocusLost
        if (txtSearchNama.getText().equalsIgnoreCase("")){
           txtSearchNama.setText("Cari....");
           txtSearchNama.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_txtSearchNamaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrintReport;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPaketTour;
    private javax.swing.JTextField txtSearchNama;
    // End of variables declaration//GEN-END:variables
}
