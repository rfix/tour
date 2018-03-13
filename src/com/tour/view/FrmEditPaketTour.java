package com.tour.view;

import com.tour.model.Destinasi;
import com.tour.control.CtlPaketTour;
import com.tour.model.PaketTour;
import com.tour.control.CtlDestinasi;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rofiq
 */

public class FrmEditPaketTour extends javax.swing.JFrame {

	private PaketTour paketTour;
        private List<Destinasi> lstDest;
        private CtlPaketTour ctlPaketTour = new CtlPaketTour();
        private CtlDestinasi cntlDestinasi = new CtlDestinasi();
        
        
	/**
	 * Creates new form FrmKaryawanHarian
	 */
	public FrmEditPaketTour() {
		initComponents();
                initcombobox();
	}

        private void initcombobox(){
            
            lstDest = cntlDestinasi.retrieve();
                for(Destinasi destinasi : lstDest){
                    cmbDest1.addItem(destinasi.getNamaDestinasi());
                }
                   for(Destinasi destinasi : lstDest){
                    cmbDest2.addItem(destinasi.getNamaDestinasi());
                }
                   for(Destinasi destinasi : lstDest){
                    cmbDest3.addItem(destinasi.getNamaDestinasi());
                }
                   for(Destinasi destinasi : lstDest){
                    cmbDest4.addItem(destinasi.getNamaDestinasi());
                }
                   for(Destinasi destinasi : lstDest){
                    cmbDest5.addItem(destinasi.getNamaDestinasi());
                }   
                for(Destinasi destinasi : lstDest){
                    cmbDest6.addItem(destinasi.getNamaDestinasi());
                }   
                for(Destinasi destinasi : lstDest){
                    cmbDest7.addItem(destinasi.getNamaDestinasi());
                }   
        }
                
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbWaktu = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cmbDest1 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cmbDest2 = new javax.swing.JComboBox();
        cmbDest3 = new javax.swing.JComboBox();
        cmbDest4 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbDest5 = new javax.swing.JComboBox();
        cmbDest6 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbDest7 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nama paket");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("Destinasi 6");

        jLabel13.setText("Destinasi 2");

        jLabel14.setText("Destinasi 1");

        cmbWaktu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 hari", "2 hari" }));

        jLabel15.setText("waktu");

        jLabel16.setText("Destinasi 3");

        jLabel3.setText("Destinasi 7");

        jLabel5.setText("Destinasi 5");

        jLabel6.setText("Destinasi 4");

        jLabel7.setText("Keterangan");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane1.setViewportView(txtKeterangan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDest3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDest4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDest5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDest2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbDest1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDest7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDest6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(330, 330, 330))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 388, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 388, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDest6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbDest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbDest7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbDest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbDest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDest4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(62, 62, 62)
                        .addComponent(btnSimpan))
                    .addComponent(cmbDest5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 293, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 293, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
	if (paketTour == null) { // jika objek karyawan null, maka bikin baru (tambah)
            paketTour = new PaketTour(); // inisialisasi Karyawan
            if(txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Karyawan tidak boleh kosong!","Peringatan",
                JOptionPane.ERROR_MESSAGE);
                txtNama.requestFocus();
                paketTour = null;
                return;
            } else {
                paketTour.setNamaPaket(txtNama.getText());
            }
            if(cmbWaktu.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "No telpon tidak boleh kosong!","Peringatan", 
                JOptionPane.ERROR_MESSAGE);
//                cmbWaktu.requestFocus();
                paketTour = null;
                return;
            } else {
                paketTour.setWaktu(cmbWaktu.getSelectedItem().toString());
            }
            paketTour.setKeterangan(txtKeterangan.getText());
            paketTour.setDestinasi2(cmbDest2.getSelectedItem().toString());
            paketTour.setDestinasi3(cmbDest3.getSelectedItem().toString());
            paketTour.setDestinasi4(cmbDest4.getSelectedItem().toString());
            paketTour.setDestinasi5(cmbDest5.getSelectedItem().toString());
            paketTour.setDestinasi6(cmbDest6.getSelectedItem().toString());
            paketTour.setDestinasi7(cmbDest7.getSelectedItem().toString());
            for (Destinasi destinasi : lstDest) {
                if (destinasi.getNamaDestinasi().equals(cmbDest1.getSelectedItem().toString())) {
                    ctlPaketTour.Tambah(paketTour, destinasi.getId());
                    break;
                }
            }
            
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");

        } else {
            if(txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Karyawan tidak boleh kosong!","Peringatan",
                JOptionPane.ERROR_MESSAGE);
                txtNama.requestFocus();
                paketTour = null;
                return;
            } else {
                paketTour.setNamaPaket(txtNama.getText());
            }
            if(cmbWaktu.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "No telpon tidak boleh kosong!","Peringatan", 
                JOptionPane.ERROR_MESSAGE);
//                cmbWaktu.requestFocus();
                paketTour = null;
                return;
            } else {
                paketTour.setWaktu(cmbWaktu.getSelectedItem().toString());
            }
            paketTour.setDestinasi2(cmbDest2.getSelectedItem().toString());
            paketTour.setDestinasi3(cmbDest3.getSelectedItem().toString());
            paketTour.setDestinasi4(cmbDest4.getSelectedItem().toString());
            paketTour.setDestinasi5(cmbDest5.getSelectedItem().toString());
            paketTour.setDestinasi6(cmbDest6.getSelectedItem().toString());
            paketTour.setDestinasi7(cmbDest7.getSelectedItem().toString());
            for (Destinasi destinasi : lstDest) {
                if (destinasi.getNamaDestinasi().equals(cmbDest1.getSelectedItem().toString())) {
                    ctlPaketTour.Edit(paketTour, destinasi.getId());
                    break;
                }
            }
            
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");

        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed
}      
      
	public void setPaketTour(PaketTour paketTour) {
		this.paketTour = paketTour; //inisialisasi objek karyawan dg parameter 'karyawanHarian'
		txtNama.setText(paketTour.getNamaPaket());
                for (int i = 0; i < cmbWaktu.getItemCount(); i++) {
                    if (cmbWaktu.getItemAt(i).equals(paketTour.getWaktu())) {
                        cmbWaktu.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest1.getItemCount(); i++) {
                    if (cmbDest1.getItemAt(i).equals(paketTour.getDestinasi())) {
                        cmbDest1.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest2.getItemCount(); i++) {
                    if (cmbDest2.getItemAt(i).equals(paketTour.getDestinasi2())) {
                        cmbDest2.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest3.getItemCount(); i++) {
                    if (cmbDest3.getItemAt(i).equals(paketTour.getDestinasi3())) {
                        cmbDest3.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest4.getItemCount(); i++) {
                    if (cmbDest4.getItemAt(i).equals(paketTour.getDestinasi4())) {
                        cmbDest4.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest5.getItemCount(); i++) {
                    if (cmbDest4.getItemAt(i).equals(paketTour.getDestinasi4())) {
                        cmbDest4.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest6.getItemCount(); i++) {
                    if (cmbDest5.getItemAt(i).equals(paketTour.getDestinasi5())) {
                        cmbDest5.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest7.getItemCount(); i++) {
                    if (cmbDest5.getItemAt(i).equals(paketTour.getDestinasi5())) {
                        cmbDest5.setSelectedIndex(i);
                    break;
                    }
                }
                
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbDest1;
    private javax.swing.JComboBox cmbDest2;
    private javax.swing.JComboBox cmbDest3;
    private javax.swing.JComboBox cmbDest4;
    private javax.swing.JComboBox cmbDest5;
    private javax.swing.JComboBox cmbDest6;
    private javax.swing.JComboBox cmbDest7;
    private javax.swing.JComboBox cmbWaktu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    
}
