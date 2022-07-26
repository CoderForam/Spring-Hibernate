	package com.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_Reg")
public class RegVo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String fn;
	private String ln;
	
	@OneToOne
	private LoginVo lv;
	
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public LoginVo getLv() {
		return lv;
	}
	public void setLv(LoginVo lv) {
		this.lv = lv;
	}
	
	
	
	
	

}
