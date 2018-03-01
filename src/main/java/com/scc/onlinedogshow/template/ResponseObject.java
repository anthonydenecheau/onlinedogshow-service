package com.scc.onlinedogshow.template;

import java.util.List;
import java.util.Map;

import com.scc.onlinedogshow.model.Breeder;

public class ResponseObject {

	private int id;
	private String name;
	private String gender;
	private String birthDate;
	private String birthCountry;
	private List<PedigreeObject> pedigrees;
	private List<Map<String, Object>> tokens;
	private BreedObject breed;	
	private Map<String, Object> father;
	private Map<String, Object> mother;
	private BreederObject breeder;
	private List<OwnerObject> owners;
	private List<TitleObject> titles;
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	
	public String getName() { return name;}
	public void setName(String name) { this.name = name;}
	
	public String getGender() { return gender;}
	public void setGender(String gender) { this.gender = gender; }
	
	public String getBirthDate() { return birthDate; }
	public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
	
	public String getBirthCountry() { return birthCountry; }
	public void setBirthCountry(String birthCountry) { this.birthCountry = birthCountry; }
	
	public List<PedigreeObject> getPedigrees() { return pedigrees; }
	public void setPedigrees(List<PedigreeObject> pedigrees) { this.pedigrees = pedigrees; }
	
	public List<Map<String, Object>> getTokens() { return tokens; }
	public void setTokens(List<Map<String, Object>> tokens) { this.tokens = tokens; }
	
	public BreedObject getBreed() { return breed; }
	public void setBreed(BreedObject breed) { this.breed = breed; }
	
	public Map<String, Object> getFather() { return father; }
	public void setFather(Map<String, Object> father) { this.father = father; }
	
	public Map<String, Object> getMother() { return mother; }
	public void setMother(Map<String, Object> mother) { this.mother = mother; }
	
	public BreederObject getBreeder() { return breeder; }
	public void setBreeder(BreederObject breeder) { this.breeder = breeder; }
	
	public List<OwnerObject> getOwners() { return owners; }
	public void setOwners(List<OwnerObject> owners) { this.owners = owners; }
	
	public List<TitleObject> getTitles() { return titles; }
	public void setTitles(List<TitleObject> titles) { this.titles = titles; }
	
	public ResponseObject withId(int id){ this.setId( id ); return this; }
	public ResponseObject withName(String name){ this.setName( name ); return this; }
	public ResponseObject withGender(String gender){ this.setGender( gender ); return this; }
	public ResponseObject withBirthDate(String birthDate){ this.setBirthDate( birthDate ); return this; }
	public ResponseObject withBirthCountry(String birthCountry){ this.setBirthCountry( birthCountry ); return this; }
	public ResponseObject withTokens(List<Map<String, Object>> tokens){ this.setTokens(tokens); return this; }
	public ResponseObject withPedigrees(List<PedigreeObject> pedigrees){ this.setPedigrees( pedigrees); return this; }
	public ResponseObject withBreed(BreedObject breed){ this.setBreed( breed ); return this; }
	public ResponseObject withFather(Map<String, Object> father){ this.setFather( father ); return this; }
	public ResponseObject withMother(Map<String, Object> mother){ this.setMother( mother ); return this; }
	public ResponseObject withBreeder(BreederObject breeder){ this.setBreeder( breeder ); return this; }
	public ResponseObject withOwners(List<OwnerObject> owner){ this.setOwners( owner ); return this; }
	public ResponseObject withTitles(List<TitleObject> titles){ this.setTitles( titles ); return this; }

}
