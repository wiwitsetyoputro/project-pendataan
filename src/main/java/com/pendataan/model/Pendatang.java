package com.pendataan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pendatang")
public class Pendatang implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer no_pendatang;
	private Date tanggal_datang;
	private String alamat_asal;
	private String alamat_tujuan;
	private String keterangan;
	
	public Integer getNo_pendatang() {
		return no_pendatang;
	}
	public void setNo_pendatang(Integer no_pendatang) {
		this.no_pendatang = no_pendatang;
	}
	public Date getTanggal_datang() {
		return tanggal_datang;
	}
	public void setTanggal_datang(Date tanggal_datang) {
		this.tanggal_datang = tanggal_datang;
	}
	public String getAlamat_asal() {
		return alamat_asal;
	}
	public void setAlamat_asal(String alamat_asal) {
		this.alamat_asal = alamat_asal;
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
