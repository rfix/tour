package com.tour.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author rofiq
 */
@Entity
@Table(name = "paketTrip")
public class PaketTrip implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 3)
    private int id;
    @Column(name = "namaPaket", length = 40)
    private String namaPaket;
    @Column(name = "destinasi1", length = 40)
    private String destinasi1;
    @Column(name = "destinasi2")
    private String destinasi2;
    @Column(name = "destinasi3")
    private String destinasi3;
    @Column(name = "harga", length = 15)
    private String harga;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_destinasi", referencedColumnName = "id")
    private Destinasi destinasi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDestinasi1() {
        return destinasi1;
    }

    public void setDestinasi1(String destinasi1) {
        this.destinasi1 = destinasi1;
    }

    public Destinasi getDestinasi() {
        return destinasi;
    }

    public void setDestinasi(Destinasi destinasi) {
        this.destinasi = destinasi;
    }

    public String getDestinasi2() {
        return destinasi2;
    }

    public void setDestinasi2(String destinasi2) {
        this.destinasi2 = destinasi2;
    }

    public String getDestinasi3() {
        return destinasi3;
    }

    public void setDestinasi3(String destinasi3) {
        this.destinasi3 = destinasi3;
    }

    
    
}
