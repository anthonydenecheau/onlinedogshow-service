package com.scc.onlinedogshow.template;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scc.onlinedogshow.model.Owner;

public class OwnerObject extends Owner {

	private int id;
	private int idDog;
	private Timestamp timestamp;

	@JsonIgnore
	public int getId() { return id; }

	@JsonIgnore
	public int getIdDog() { return idDog; }

	@JsonIgnore
	public Timestamp getTimestamp() { return timestamp; }

}
