 package tn.esprit.shopping.entities;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mongodb.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
 @NoArgsConstructor
 @Getter
 @Setter
@Document

public class SousCategorie  implements Serializable {
	@Id
    private String id;

	private String name;
	@Nullable
	@JsonManagedReference
	@ToString.Exclude
	private List<Product> products;
		private Categorie categorie;
		public SousCategorie(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		
}
