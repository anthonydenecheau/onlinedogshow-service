package com.scc.onlinedogshow.template;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scc.onlinedogshow.model.Title;

public class TitleObject extends Title {

	private long id;
	private int idDog;
	private int idTitle;
	private Timestamp timestamp;

	@JsonIgnore
	public long getId() { return id; }

	@JsonIgnore
	public int getIdDog() { return idDog; }

	@JsonIgnore
	public int getIdTitle() { return idTitle; }

	@JsonIgnore
	public Timestamp getTimestamp() { return timestamp; }

}
