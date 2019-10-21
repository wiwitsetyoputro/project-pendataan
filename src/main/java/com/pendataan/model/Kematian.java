package com.pendataan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pendataan.enumeration.Hari_meninggal;

@Entity
@Table(name = "kematian")
public class Kematian implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer no_kematian;
	private String nama;
	private String umur;
	@Enumerated(EnumType.STRING)
	private Hari_meninggal hari_meninggal;
	private Date tanggal_meninggal;
	private String tempat_meninggal;
	private String sebab_meninggal;
	private String info_meninggal;
	

	public Integer getNo_kematian() {
		return no_kematian;
	}

	public void setNo_kematian(Integer no_kematian) {
		this.no_kematian = no_kematian;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getUmur() {
		return umur;
	}

	public void setUmur(String umur) {
		this.umur = umur;
	}

	public Hari_meninggal getHari_meninggal() {
		return hari_meninggal;
	}

	public void setHari_meninggal(Hari_meninggal hari_meninggal) {
		this.hari_meninggal = hari_meninggal;
	}

	public Date getTanggal_meninggal() {
		return tanggal_meninggal;
	}

	public void setTanggal_meninggal(Date tanggal_meninggal) {
		this.tanggal_meninggal = tanggal_meninggal;
	}

	public String getTempat_meninggal() {
		return tempat_meninggal;
	}

	public void setTempat_meninggal(String tempat_meninggal) {
		this.tempat_meninggal = tempat_meninggal;
	}

	public String getSebab_meninggal() {
		return sebab_meninggal;
	}

	public void setSebab_meninggal(String sebab_meninggal) {
		this.sebab_meninggal = sebab_meninggal;
	}

	public String getInfo_meninggal() {
		return info_meninggal;
	}

	public void setInfo_meninggal(String info_meninggal) {
		this.info_meninggal = info_meninggal;
	}

}
