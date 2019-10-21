package com.pendataan.dto;

import java.util.Date;

import com.pendataan.enumeration.Golongan_darah;
import com.pendataan.enumeration.Jenis_kelamin;
import com.pendataan.enumeration.Kewarganegaraan;
import com.pendataan.enumeration.Pendidikan_terakhir;
import com.pendataan.enumeration.Status_pendidikan;
import com.pendataan.enumeration.Status_perkawinan;

public class PendudukDto {

	private Integer id_penduduk;
	private Integer nik;
	private String nama_lengkap;
	private String tempat_lahir;
	private String alamat;
	private String pekerjaan;
	private Integer nomor_telepon;
	private Date tanggal_registrasi;
	private Jenis_kelamin jenis_kelamin;
	private Golongan_darah golongan_darah;
	private Pendidikan_terakhir pendidikan_terakhir;
	private Status_pendidikan status_pendidikan;
	private Status_perkawinan status_perkawinan;
	private Kewarganegaraan kewarganegaraan;

	public Integer getId_penduduk() {
		return id_penduduk;
	}

	public void setId_penduduk(Integer id_penduduk) {
		this.id_penduduk = id_penduduk;
	}

	public Integer getNik() {
		return nik;
	}

	public void setNik(Integer nik) {
		this.nik = nik;
	}

	public String getNama_lengkap() {
		return nama_lengkap;
	}

	public void setNama_lengkap(String nama_lengkap) {
		this.nama_lengkap = nama_lengkap;
	}

	public String getTempat_lahir() {
		return tempat_lahir;
	}

	public void setTempat_lahir(String tempat_lahir) {
		this.tempat_lahir = tempat_lahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public Integer getNomor_telepon() {
		return nomor_telepon;
	}

	public void setNomor_telepon(Integer nomor_telepon) {
		this.nomor_telepon = nomor_telepon;
	}

	public Date getTanggal_registrasi() {
		return tanggal_registrasi;
	}

	public void setTanggal_registrasi(Date tanggal_registrasi) {
		this.tanggal_registrasi = tanggal_registrasi;
	}

	public Jenis_kelamin getJenis_kelamin() {
		return jenis_kelamin;
	}

	public void setJenis_kelamin(Jenis_kelamin jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}

	public Golongan_darah getGolongan_darah() {
		return golongan_darah;
	}

	public void setGolongan_darah(Golongan_darah golongan_darah) {
		this.golongan_darah = golongan_darah;
	}

	public Pendidikan_terakhir getPendidikan_terakhir() {
		return pendidikan_terakhir;
	}

	public void setPendidikan_terakhir(Pendidikan_terakhir pendidikan_terakhir) {
		this.pendidikan_terakhir = pendidikan_terakhir;
	}

	public Status_pendidikan getStatus_pendidikan() {
		return status_pendidikan;
	}

	public void setStatus_pendidikan(Status_pendidikan status_pendidikan) {
		this.status_pendidikan = status_pendidikan;
	}

	public Status_perkawinan getStatus_perkawinan() {
		return status_perkawinan;
	}

	public void setStatus_perkawinan(Status_perkawinan status_perkawinan) {
		this.status_perkawinan = status_perkawinan;
	}

	public Kewarganegaraan getKewarganegaraan() {
		return kewarganegaraan;
	}

	public void setKewarganegaraan(Kewarganegaraan kewarganegaraan) {
		this.kewarganegaraan = kewarganegaraan;
	}

}
