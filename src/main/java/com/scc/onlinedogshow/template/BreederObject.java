package com.scc.onlinedogshow.template;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scc.onlinedogshow.model.Breeder;

public class BreederObject extends Breeder {

	private int id;
	private String typeProfil;
	private String professionnelActif;
	private String raisonSociale;
	private String onSuffixe;
	private int idDog;
	private Timestamp timestamp;

	@JsonIgnore
	public int getId() { return id; }

	@JsonIgnore
	public String getTypeProfil() { return typeProfil; }

	@JsonIgnore
	public String getProfessionnelActif() { return professionnelActif; }

	@JsonIgnore
	public String getRaisonSociale() { return raisonSociale; }

	@JsonIgnore
	public String getOnSuffixe() { return onSuffixe; }

	@JsonIgnore
	public int getIdDog() { return idDog; }

	@JsonIgnore
	public Timestamp getTimestamp() { return timestamp; }

}
