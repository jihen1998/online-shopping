package tn.esprit.shopping.dto;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tn.esprit.shopping.entities.SousCategorie;

@AllArgsConstructor
@NoArgsConstructor
@ToString	
@Data
public class CategorieDTO implements Serializable {
    private String iddto;
	private String namedto;
	private List<SousCategorie> sousCategories;
	public CategorieDTO(String iddto, String namedto) {
		super();
		this.iddto = iddto;
		this.namedto = namedto;
	}
	}
