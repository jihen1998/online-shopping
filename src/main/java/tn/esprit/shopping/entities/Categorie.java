package tn.esprit.shopping.entities;

import java.io.Serializable;
import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString	
@Document

public class Categorie implements Serializable {
	@Id
    private String id;
	private String name;
	@com.mongodb.lang.Nullable
	@JsonManagedReference
	@ToString.Exclude
	private List<SousCategorie> sousCategories;
	public Categorie(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SousCategorie> getSousCategories() {
		return sousCategories;
	}
	public void setSousCategories(List<SousCategorie> sousCategories) {
		this.sousCategories = sousCategories;
	}


}
