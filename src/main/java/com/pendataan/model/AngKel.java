package com.pendataan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "angkel")
public class AngKel implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer no_angkel;
	private String status;
	
	
	public Integer getNo_angkel() {
		return no_angkel;
	}
	public void setNo_angkel(Integer no_angkel) {
		this.no_angkel = no_angkel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
