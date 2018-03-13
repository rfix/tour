/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tour.control;

import com.tour.hibUtil.HibUtil;
import com.tour.model.Destinasi;
import com.tour.model.PaketTrip;
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

public class CtlPaketTrip {
    
    private SessionFactory sessFact = HibUtil.getSessionFactory();
    private Session session;
    private Transaction tr;

    /**
     * simpan data paketetTrip into database
     *
     * @param destinasi 
     */
    public void Insert(PaketTrip paketTrip, Integer idDestinasi) {
        session = sessFact.openSession(); //buka session
        tr = session.beginTransaction(); //mulai transaksi
        Destinasi destinasi = (Destinasi)session.load(Destinasi.class, idDestinasi);
        session.save(paketTrip);  // simpan objek  ke database
        tr.commit(); //commit/save
        session.close(); // tutup session
    }

    public void update(PaketTrip paketTrip, Integer idDestinasi) {
        session = sessFact.openSession(); // buka session database
        tr = session.beginTransaction(); //mulai transaction
        Destinasi destinasi = (Destinasi)session.load(Destinasi.class, idDestinasi);
        PaketTrip record = (PaketTrip)session.load(PaketTrip.class, paketTrip.getId());
        record.setDestinasi(destinasi);
        record.setNamaPaket(paketTrip.getNamaPaket());
        record.setDestinasi1(paketTrip.getDestinasi1());
        record.setDestinasi2(paketTrip.getDestinasi2());
        record.setDestinasi3(paketTrip.getDestinasi3());
        record.setHarga(paketTrip.getHarga());
        tr.commit();
        session.close();
    }

    public void delete(Integer id) {
        session = sessFact.openSession();
        tr = session.beginTransaction();
        session.delete(id);
        tr.commit();
        session.close();
    }

    /**
     * retrieve data paketTrip dari database
     *
     * @return List<PaketTrip>
     */
    public List<PaketTrip> retrieve() {
        ArrayList<PaketTrip> listTrip = new ArrayList<>(); // inisialisasi listJabatan
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from PaketTrip n JOIN FETCH n.destinasi"); // ambil data jabatan dari database
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            PaketTrip paketTrip = (PaketTrip) it.next();
            listTrip.add(paketTrip);
        }

        session.close(); //tutup session

        return listTrip;
    }

    public List<PaketTrip> getByNama(String paramNama) {
        ArrayList<PaketTrip> listPaket = new ArrayList<>(); // inisialisasi listKaryawanHarian
        session = sessFact.openSession(); // buka session
        tr = session.beginTransaction(); // mulai transaksi
        Query query = session.createQuery("from PaketTrip where namaPaket LIKE :paramNama");
        query.setParameter("paramNama", "%" + paramNama + "%");
        List result = query.list();
        Iterator it = result.iterator();
        while (it.hasNext()) {
            PaketTrip paketTrip = (PaketTrip) it.next();
            listPaket.add(paketTrip);
        }

        session.close(); //tutup session
        return listPaket;
    }
}
