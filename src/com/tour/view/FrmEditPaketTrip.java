package com.tour.view;

import com.tour.control.CtlDestinasi;
import com.tour.model.PaketTrip;
import com.tour.control.CtlPaketTrip;
import com.tour.model.Destinasi;
import com.tour.model.PaketTrip;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rofiq
 */

public class FrmEditPaketTrip extends javax.swing.JFrame {

	private PaketTrip paketTrip;
        private List<Destinasi> lstDest;
        private CtlPaketTrip ctlPaketTrip = new CtlPaketTrip();
        private CtlDestinasi ctlDestinasi = new CtlDestinasi();
        
        
	/**
	 * Creates new form FrmKaryawanHarian
	 */
	public FrmEditPaketTrip() {
		initComponents();
                initcombobox();
	}

        private void initcombobox(){
            
            lstDest = ctlDestinasi.retrieve();
                for(Destinasi destinasi : lstDest){
                    cmbDest.addItem(destinasi.getNamaDestinasi());
                }
                   for(Destinasi destinasi : lstDest){
                    cmbDest1.addItem(destinasi.getNamaDestinasi());
                }
                   for(Destinasi destinasi : lstDest){
                    cmbDest2.addItem(destinasi.getNamaDestinasi());
                }
                   for(Destinasi destinasi : lstDest){
                    cmbDest3.addItem(destinasi.getNamaDestinasi());
                }
//                   for(Destinasi destinasi : lstDest){
//                    cmbDest5.addItem(destinasi.getNama());
//                }   
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
        cmbDest = new javax.swing.JComboBox();
        cmbDest2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbDest3 = new javax.swing.JComboBox();
        txtHarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nama paket");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("Destinasi 2");

        jLabel13.setText("Harga");

        jLabel14.setText("Destinasi ");

        cmbWaktu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 hari", "2 hari" }));

        jLabel15.setText("waktu");

        jLabel16.setText("Destinasi 1 ");

        jLabel3.setText("Destinasi 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan)
                    .addComponent(cmbDest2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDest3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDest1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDest, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 242, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 240, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbDest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbDest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbDest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btnSimpan)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 271, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 271, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
	if (paketTrip == null) { // jika objek karyawan null, maka bikin baru (tambah)
            paketTrip = new PaketTrip(); // inisialisasi Karyawan
            if(txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Karyawan tidak boleh kosong!","Peringatan",
                JOptionPane.ERROR_MESSAGE);
                txtNama.requestFocus();
                paketTrip = null;
                return;
            } else {
                paketTrip.setNamaPaket(txtNama.getText());
            }
//            if(cmbWaktu.getSelectedItem().equals("")){
//                JOptionPane.showMessageDialog(null, "No telpon tidak boleh kosong!","Peringatan", 
//                JOptionPane.ERROR_MESSAGE);
////                cmbWaktu.requestFocus();
//                paketTrip = null;
//                return;
//            } else {
//                paketTrip.setWaktu(cmbWaktu.getSelectedItem().toString());
//            }
            paketTrip.setDestinasi1(cmbDest1.getSelectedItem().toString());
            paketTrip.setDestinasi2(cmbDest2.getSelectedItem().toString());
            paketTrip.setDestinasi3(cmbDest3.getSelectedItem().toString());
            paketTrip.setHarga(txtHarga.getText());
            for (Destinasi destinasi : lstDest) {
                if (destinasi.getNamaDestinasi().equals(cmbDest.getSelectedItem().toString())) {
                    ctlPaketTrip.Insert(paketTrip, destinasi.getId());
                    break;
                }
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");

        } else {
            if(txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Karyawan tidak boleh kosong!","Peringatan",
                JOptionPane.ERROR_MESSAGE);
                txtNama.requestFocus();
                paketTrip = null;
                return;
            } else {
                paketTrip.setNamaPaket(txtNama.getText());
            }
//            if(cmbWaktu.getSelectedItem().equals("")){
//                JOptionPane.showMessageDialog(null, "No telpon tidak boleh kosong!","Peringatan", 
//                JOptionPane.ERROR_MESSAGE);
////                cmbWaktu.requestFocus();
//                paketTrip = null;
//                return;
//            } else {
//                paketTrip.setWaktu(cmbWaktu.getSelectedItem().toString());
//            }
            paketTrip.setDestinasi1(cmbDest1.getSelectedItem().toString());
            paketTrip.setDestinasi2(cmbDest2.getSelectedItem().toString());
            paketTrip.setDestinasi3(cmbDest3.getSelectedItem().toString());
            paketTrip.setHarga(txtHarga.getText());
            for (Destinasi destinasi : lstDest) {
                if (destinasi.getNamaDestinasi().equals(cmbDest.getSelectedItem().toString())) {
                    ctlPaketTrip.update(paketTrip, destinasi.getId());
                    break;
                }
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");

        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed
}      
      
	public void setPaket(PaketTrip paketTrip) {
		this.paketTrip = paketTrip; //inisialisasi objek karyawan dg parameter 'karyawanHarian'
		txtNama.setText(paketTrip.getNamaPaket());
                txtHarga.setText(paketTrip.getHarga());
//                for (int i = 0; i < cmbWaktu.getItemCount(); i++) {
//                    if (cmbWaktu.getItemAt(i).equals(paketTrip.getWaktu())) {
//                        cmbWaktu.setSelectedIndex(i);
//                    break;
//                    }
//                }
                for (int i = 0; i < cmbDest.getItemCount(); i++) {
                    if (cmbDest.getItemAt(i).equals(paketTrip.getDestinasi())) {
                        cmbDest.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest1.getItemCount(); i++) {
                    if (cmbDest1.getItemAt(i).equals(paketTrip.getDestinasi())) {
                        cmbDest1.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest3.getItemCount(); i++) {
                    if (cmbDest3.getItemAt(i).equals(paketTrip.getDestinasi3())) {
                        cmbDest3.setSelectedIndex(i);
                    break;
                    }
                }
                for (int i = 0; i < cmbDest2.getItemCount(); i++) {
                    if (cmbDest2.getItemAt(i).equals(paketTrip.getDestinasi2())) {
                        cmbDest2.setSelectedIndex(i);
                    break;
                    }
                }
//                for (int i = 0; i < cmbDest4.getItemCount(); i++) {
//                    if (cmbDest4.getItemAt(i).equals(paketTrip.getDestinasi4())) {
//                        cmbDest4.setSelectedIndex(i);
//                    break;
//                    }
//                }
//                for (int i = 0; i < cmbDest5.getItemCount(); i++) {
//                    if (cmbDest5.getItemAt(i).equals(paketTrip.getDestinasi5())) {
//                        cmbDest5.setSelectedIndex(i);
//                    break;
//                    }
                
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbDest;
    private javax.swing.JComboBox cmbDest1;
    private javax.swing.JComboBox cmbDest2;
    private javax.swing.JComboBox cmbDest3;
    private javax.swing.JComboBox cmbWaktu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    
}
