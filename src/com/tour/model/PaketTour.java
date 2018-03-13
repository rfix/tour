/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "paketTour")
public class PaketTour implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "namaPaket")
    private String namaPaket;
    @Column(name = "waktu", length = 10)
    private String waktu;
    @Column(name = "hotel", length = 30)
    private String hotel;
    @Column(name = "destinasi2")
    private String destinasi2;
    @Column(name = "destinasi3")
    private String destinasi3;
    @Column(name = "destinasi4")
    private String destinasi4;
    @Column(name = "destinasi5")
    private String destinasi5;
    @Column(name = "destinasi6")
    private String destinasi6;
    @Column(name = "destinasi7")
    private String destinasi7;
    @Column(name = "keterangan")
    private String keterangan;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_destiasi", referencedColumnName = "id")
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

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
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

    public String getDestinasi4() {
        return destinasi4;
    }

    public void setDestinasi4(String destinasi4) {
        this.destinasi4 = destinasi4;
    }

    public String getDestinasi5() {
        return destinasi5;
    }

    public void setDestinasi5(String destinasi5) {
        this.destinasi5 = destinasi5;
    }

    public String getDestinasi6() {
        return destinasi6;
    }

    public void setDestinasi6(String destinasi6) {
        this.destinasi6 = destinasi6;
    }

    public String getDestinasi7() {
        return destinasi7;
    }

    public void setDestinasi7(String destinasi7) {
        this.destinasi7 = destinasi7;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Destinasi getDestinasi() {
        return destinasi;
    }

    public void setDestinasi(Destinasi destinasi) {
        this.destinasi = destinasi;
    }
    
    
    
}
