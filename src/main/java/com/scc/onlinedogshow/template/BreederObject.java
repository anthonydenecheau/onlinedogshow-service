package com.scc.onlinedogshow.template;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BreederObject {

	private int id;
   private String lastName;
   private String firstName;	
	private String typeProfil;
	private String professionnelActif;
	private String raisonSociale;
	private String onSuffixe;
	private int idDog;
	private Timestamp timestamp;

	@JsonIgnore
	public int getId() { return id; }

	public String getFirstName() { return firstName; }
   public void setFirstName(String firstName) { this.firstName = firstName; }
      
   public String getLastName() { return lastName; }
   public void setLastName(String lastName) { this.lastName = lastName; }
	   
	@JsonIgnore
	public String getTypeProfil() { return typeProfil; }

	@JsonIgnore
	public String getProfessionnelActif() { return professionnelActif; }

	@JsonIgnore
	public String getRaisonSociale() { return raisonSociale; }

	@JsonIgnore
	public String getOnSuffixe() { return onSuffixe; }
   public void setOnSuffixe(String onSuffixe) { this.onSuffixe = onSuffixe; }

	@JsonIgnore
	public int getIdDog() { return idDog; }

	@JsonIgnore
	public Timestamp getTimestamp() { return timestamp; }

	public BreederObject withFirstName(String firstName){ this.setFirstName(firstName); return this; }
	public BreederObject withLastName(String lastName){ this.setLastName(lastName); return this; }
   public BreederObject withOnSuffixe(String onSuffixe){ this.setOnSuffixe(onSuffixe); return this; }

}
