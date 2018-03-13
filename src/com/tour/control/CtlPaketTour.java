/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tour.control;

import com.tour.hibUtil.HibUtil;
import com.tour.model.Destinasi;
import com.tour.model.PaketTour;
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
public class CtlPaketTour {
    
    private SessionFactory sf = HibUtil.getSessionFactory();
    private Session session;
    private Transaction tr;
    
    public void Tambah(PaketTour paketTour, Integer idDestinasi){
        session = sf.openSession();
        tr = session.beginTransaction();
        Destinasi destinasi = (Destinasi)session.load(Destinasi.class, idDestinasi);
        session.save(paketTour);
        tr.commit();
        session.close();
    }
    
    public void Edit(PaketTour paketTour, Integer idDestinasi){
        session = sf.openSession();
        tr = session.beginTransaction();
        Destinasi destinasi = (Destinasi)session.load(Destinasi.class, idDestinasi);
        PaketTour record = (PaketTour)session.load(PaketTour.class, paketTour.getId());
        record.setDestinasi(destinasi);
        record.setNamaPaket(paketTour.getNamaPaket());
        record.setWaktu(paketTour.getWaktu());
        record.setDestinasi2(paketTour.getDestinasi2());
        record.setDestinasi3(paketTour.getDestinasi3());
        record.setDestinasi4(paketTour.getDestinasi4());
        record.setDestinasi5(paketTour.getDestinasi5());
        record.setDestinasi6(paketTour.getDestinasi6());
        record.setDestinasi7(paketTour.getDestinasi7());
        tr.commit();
        session.close();
    }
    
    public void Hapus(Integer id){
        session = sf.openSession();
        tr = session.beginTransaction();
        session.delete(id);
        tr.commit();
        session.close();
    }
    
    public List<PaketTour> retrieve() {
        ArrayList<PaketTour> listTrip = new ArrayList<>(); // inisialisasi listJabatan
        session = sf.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from PaketTour n JOIN FETCH n.destinasi"); // ambil data jabatan dari database
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            PaketTour paketTour = (PaketTour) it.next();
            listTrip.add(paketTour);
        }

        session.close(); //tutup session

        return listTrip;
    }

    public List<PaketTour> getByNama(String paramNama) {
        ArrayList<PaketTour> listPaket = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sf.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from PaketTour where namaPaket LIKE :paramNama");
        query.setParameter("paramNama", "%" + paramNama + "%");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            PaketTour paketTour = (PaketTour) it.next();
            listPaket.add(paketTour);
        }

        session.close(); //tutup session
        return listPaket;
    }    
}   