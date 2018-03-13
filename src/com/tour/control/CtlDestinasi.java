package com.tour.control;

import com.tour.hibUtil.HibUtil;
import com.tour.model.Destinasi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rofiq
 */
public class CtlDestinasi {
    
    SessionFactory sf = HibUtil.getSessionFactory();
    Session sess;
    Transaction tr;
    
    public void simpan(Destinasi destinasi){
        sess = sf.openSession();
        tr = sess.beginTransaction();
        sess.save(destinasi);
        tr.commit();
        sess.close();
    }
    
    public void edit(Destinasi destinasi){
        sess = sf.openSession();
        tr = sess.beginTransaction();
        Destinasi record = (Destinasi)sess.load(Destinasi.class, destinasi.getId());
        record.setNamaDestinasi(destinasi.getNamaDestinasi());
        record.setKategori(destinasi.getKategori());
        record.setLokasi(destinasi.getLokasi());
        record.setTiket(destinasi.getTiket());
        tr.commit();
        sess.close();
    }
    
    public void hapus(Integer id){
        sess = sf.openSession();
        tr = sess.beginTransaction();
        sess.delete(id);
        tr.commit();
        sess.close();
    }
    
    public List<Destinasi> retrieve() {
        ArrayList<Destinasi> listDestinasi = new ArrayList<>(); // inisialisasi listJabatan
        sess = sf.openSession(); // buka session
        tr = sess.beginTransaction(); // mulai transaksi
        Query query = sess.createQuery("from Destinasi"); // ambil data jabatan dari database
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            Destinasi destinasi = (Destinasi) it.next();
            listDestinasi.add(destinasi);
        }

        sess.close(); //tutup session

        return listDestinasi;
    }

    public List<Destinasi> getByNama(String paramNama) {
        ArrayList<Destinasi> listDestinasi = new ArrayList<>(); // inisialisasi listKaryawanHarian
        sess = sf.openSession(); // buka session
        tr = sess.beginTransaction(); // mulai transaksi
        Query query = sess.createQuery("from Destinasi where namaDestinasi LIKE :paramNama");
        query.setParameter("paramNama", "%" + paramNama + "%");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            Destinasi destinasi = (Destinasi) it.next();
            listDestinasi.add(destinasi);
        }

        sess.close(); //tutup session
        return listDestinasi;
    }
}
