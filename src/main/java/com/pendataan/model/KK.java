package com.pendataan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kk")
public class KK implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer no_kk;
	private String nama_kepala_keluarga;
	private String alamat_kk;
	private Integer kodepos;
	private String alamat;
	private Integer no_pindah;
	private String akseptor_kb;

	public Integer getNo_kk() {
		return no_kk;
	}

	public void setNo_kk(Integer no_kk) {
		this.no_kk = no_kk;
	}

	public String getNama_kepala_keluarga() {
		return nama_kepala_keluarga;
	}

	public void setNama_kepala_keluarga(String nama_kepala_keluarga) {
		this.nama_kepala_keluarga = nama_kepala_keluarga;
	}

	public String getAlamat_kk() {
		return alamat_kk;
	}

	public void setAlamat_kk(String alamat_kk) {
		this.alamat_kk = alamat_kk;
	}

	public Integer getKodepos() {
		return kodepos;
	}

	public void setKodepos(Integer kodepos) {
		this.kodepos = kodepos;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Integer getNo_pindah() {
		return no_pindah;
	}

	public void setNo_pindah(Integer no_pindah) {
		this.no_pindah = no_pindah;
	}

	public String getAkseptor_kb() {
		return akseptor_kb;
	}

	public void setAkseptor_kb(String akseptor_kb) {
		this.akseptor_kb = akseptor_kb;
	}

}
