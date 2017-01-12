package br.com.ajr.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBSGORG")
public class Orgao implements Serializable {
	
	private static final long serialVersionUID = 201701101021L;
	
	@Id
	private Integer codOrg;
	private String desOrg;
	private String sglOrg;
	
	public Integer getCodOrg() {
		return codOrg;
	}
	
	public void setCodOrg(Integer codOrg) {
		this.codOrg = codOrg;
	}
	
	public String getDesOrg() {
		return desOrg;
	}
	
	public void setDesOrg(String desOrg) {
		this.desOrg = desOrg;
	}
	
	public String getSglOrg() {
		return sglOrg;
	}
	
	public void setSglOrg(String sglOrg) {
		this.sglOrg = sglOrg;
	}
	
}
