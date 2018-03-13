
package com.tour.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rofiq
 */
@Entity
@Table(name = "destinasi")
public class Destinasi implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 3)
    private int id;
    @Column(name = "namaDestinasi", length = 40)
    private String namaDestinasi;
    @Column(name = "kategori", length = 30)
    private String kategori;
    @Column(name = "lokasi", length = 40)
    private String lokasi;
    @Column(name = "tiket", length = 20)
    private String tiket;
    @OneToMany(mappedBy = "destinasi")
    private List<PaketTrip> paketTrip;
    @OneToMany(mappedBy = "destinasi")
    private List<PaketTour> paketTour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaDestinasi() {
        return namaDestinasi;
    }

    public void setNamaDestinasi(String namaDestinasi) {
        this.namaDestinasi = namaDestinasi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTiket() {
        return tiket;
    }

    public void setTiket(String tiket) {
        this.tiket = tiket;
    }

    public List<PaketTrip> getPaketTrip() {
        return paketTrip;
    }

    public void setPaketTrip(List<PaketTrip> paketTrip) {
        this.paketTrip = paketTrip;
    }

    public List<PaketTour> getPaketTour() {
        return paketTour;
    }

    public void setPaketTour(List<PaketTour> paketTour) {
        this.paketTour = paketTour;
    }
    
    
}
