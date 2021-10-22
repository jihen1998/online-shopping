 package tn.esprit.shopping.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
 @NoArgsConstructor
 @Getter
 @Setter
 @Entity
 @Table(name = "sous_categorie")
public class SousCategorie  implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	private String name;
	@Nullable
	@JsonManagedReference
	@ToString.Exclude
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categorie")
	private List<Product> products;
	  @ManyToOne
		private Categorie Categorie;
}
