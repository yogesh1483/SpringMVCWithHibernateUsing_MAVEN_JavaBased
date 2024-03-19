package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String suname;
	private String supass;
	private String smobileno;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSuname() {
		return suname;
	}
	public void setSuname(String suname) {
		this.suname = suname;
	}
	public String getSupass() {
		return supass;
	}
	public void setSupass(String supass) {
		this.supass = supass;
	}
	public String getSmobileno() {
		return smobileno;
	}
	public void setSmobileno(String smobileno) {
		this.smobileno = smobileno;
	}

}
