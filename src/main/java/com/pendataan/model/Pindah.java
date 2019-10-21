package com.pendataan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pindah")
public class Pindah implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer no_pindah;
	private Date tanggal_pindah;
	private String alamat_tujuan;
	private String keterangan;
	
	public Integer getNo_pindah() {
		return no_pindah;
	}
	public void setNo_pindah(Integer no_pindah) {
		this.no_pindah = no_pindah;
	}
	public Date getTanggal_pindah() {
		return tanggal_pindah;
	}
	public void setTanggal_pindah(Date tanggal_pindah) {
		this.tanggal_pindah = tanggal_pindah;
	}
	public String getAlamat_tujuan() {
		return alamat_tujuan;
	}
	public void setAlamat_tujuan(String alamat_tujuan) {
		this.alamat_tujuan = alamat_tujuan;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	
	

}
