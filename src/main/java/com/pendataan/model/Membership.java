package com.pendataan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "membership")
public class Membership implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idMember;
	private String namaDepan;
	private String namaBelakang;
	private String username;
	private String password;
	private String email;

	
	public Integer getIdMember() {
		return idMember;
	}

	public void setIdMember(Integer idMember) {
		this.idMember = idMember;
	}

	public String getNamaDepan() {
		return namaDepan;
	}

	public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}

	public String getNamaBelakang() {
		return namaBelakang;
	}

	public void setNamaBelakang(String namaBelakang) {
		this.namaBelakang = namaBelakang;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
