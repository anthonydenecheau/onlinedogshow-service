package com.scc.onlinedogshow.template;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scc.onlinedogshow.model.Pedigree;

public class PedigreeObject extends Pedigree {

	private long id;
	private int idDog;
	private Timestamp timestamp;
	
	@JsonIgnore
	public long getId() { return id; }

	@JsonIgnore
	public int getIdDog() { return idDog; }
	
	@JsonIgnore
	public Timestamp getTimestamp() { return timestamp; }

}
