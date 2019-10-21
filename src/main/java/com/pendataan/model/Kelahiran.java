package com.pendataan.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pendataan.enumeration.Hari_lahir;
import com.pendataan.enumeration.Jenis_kelahiran;
import com.pendataan.enumeration.Jenis_kelamin_akte;

@Entity
@Table(name = "kelahiran")
public class Kelahiran implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_kelahiran;
	private Integer nomor_akte;
	private String nama_anak;
	Jenis_kelamin_akte jenis_kelamin_akte;
	private String tempat_dilahirkan;
	private String tempat_kelahiran;
	Hari_lahir hari_lahir;
	private	Date tanggal_lahir;
	private Time pukul;
	Jenis_kelahiran jenis_kelahiran;
	private Integer kelahiran_ke;
	private String pembantu_kelahiran;
	private String berat_bayi;
	private String panjang_bayi;
	private String nama_ibu;
	private String nama_ayah;
	private String alamat;
	private String pekerjaan_suami;
	
	
	public Integer getId_kelahiran() {
		return id_kelahiran;
	}
	public void setId_kelahiran(Integer id_kelahiran) {
		this.id_kelahiran = id_kelahiran;
	}
	public Integer getNomor_akte() {
		return nomor_akte;
	}
	public void setNomor_akte(Integer nomor_akte) {
		this.nomor_akte = nomor_akte;
	}
	public String getNama_anak() {
		return nama_anak;
	}
	public void setNama_anak(String nama_anak) {
		this.nama_anak = nama_anak;
	}
	public Jenis_kelamin_akte getJenis_kelamin_akte() {
		return jenis_kelamin_akte;
	}
	public void setJenis_kelamin_akte(Jenis_kelamin_akte jenis_kelamin_akte) {
		this.jenis_kelamin_akte = jenis_kelamin_akte;
	}
	public String getTempat_dilahirkan() {
		return tempat_dilahirkan;
	}
	public void setTempat_dilahirkan(String tempat_dilahirkan) {
		this.tempat_dilahirkan = tempat_dilahirkan;
	}
	public String getTempat_kelahiran() {
		return tempat_kelahiran;
	}
	public void setTempat_kelahiran(String tempat_kelahiran) {
		this.tempat_kelahiran = tempat_kelahiran;
	}
	public Hari_lahir getHari_lahir() {
		return hari_lahir;
	}
	public void setHari_lahir(Hari_lahir hari_lahir) {
		this.hari_lahir = hari_lahir;
	}
	public Date getTanggal_lahir() {
		return tanggal_lahir;
	}
	public void setTanggal_lahir(Date tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}
	public Time getPukul() {
		return pukul;
	}
	public void setPukul(Time pukul) {
		this.pukul = pukul;
	}
	public Jenis_kelahiran getJenis_kelahiran() {
		return jenis_kelahiran;
	}
	public void setJenis_kelahiran(Jenis_kelahiran jenis_kelahiran) {
		this.jenis_kelahiran = jenis_kelahiran;
	}
	public Integer getKelahiran_ke() {
		return kelahiran_ke;
	}
	public void setKelahiran_ke(Integer kelahiran_ke) {
		this.kelahiran_ke = kelahiran_ke;
	}
	public String getPembantu_kelahiran() {
		return pembantu_kelahiran;
	}
	public void setPembantu_kelahiran(String pembantu_kelahiran) {
		this.pembantu_kelahiran = pembantu_kelahiran;
	}
	public String getBerat_bayi() {
		return berat_bayi;
	}
	public void setBerat_bayi(String berat_bayi) {
		this.berat_bayi = berat_bayi;
	}
	public String getPanjang_bayi() {
		return panjang_bayi;
	}
	public void setPanjang_bayi(String panjang_bayi) {
		this.panjang_bayi = panjang_bayi;
	}
	public String getNama_ibu() {
		return nama_ibu;
	}
	public void setNama_ibu(String nama_ibu) {
		this.nama_ibu = nama_ibu;
	}
	public String getNama_ayah() {
		return nama_ayah;
	}
	public void setNama_ayah(String nama_ayah) {
		this.nama_ayah = nama_ayah;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getPekerjaan_suami() {
		return pekerjaan_suami;
	}
	public void setPekerjaan_suami(String pekerjaan_suami) {
		this.pekerjaan_suami = pekerjaan_suami;
	}
	
	
	
	
	
	
	
	
	
	

}
