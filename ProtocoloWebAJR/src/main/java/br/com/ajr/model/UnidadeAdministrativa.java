package br.com.ajr.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBSGUNDADM")
public class UnidadeAdministrativa implements Serializable{

	private static final long serialVersionUID = 201701101046L;
	
	@Id
	private Integer codUnd;
	
	private Integer codOrg;
	private String desUnd;
	private String sglUnd;
	
	@OneToMany(mappedBy = "codOrg")
    private List<Orgao> orgaos;

	public Integer getCodUnd() {
		return codUnd;
	}

	public void setCodUnd(Integer codUnd) {
		this.codUnd = codUnd;
	}

	public Integer getCodOrg() {
		return codOrg;
	}

	public void setCodOrg(Integer codOrg) {
		this.codOrg = codOrg;
	}

	public String getDesUnd() {
		return desUnd;
	}

	public void setDesUnd(String desUnd) {
		this.desUnd = desUnd;
	}

	public String getSglUnd() {
		return sglUnd;
	}

	public void setSglUnd(String sglUnd) {
		this.sglUnd = sglUnd;
	}

	public List<Orgao> getOrgaos() {
		return orgaos;
	}

	public void setOrgaos(List<Orgao> orgaos) {
		this.orgaos = orgaos;
	}
	
	
//	@ManyToOne
//	@JoinColumn(name="codOrg")
//	private UnidadeAdministrativa undAdm;
	
	
	

}
