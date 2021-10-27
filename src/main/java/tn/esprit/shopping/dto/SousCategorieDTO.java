 package tn.esprit.shopping.dto;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.shopping.entities.Product;
@AllArgsConstructor
 @NoArgsConstructor
 @Data
public class SousCategorieDTO  implements Serializable {
	@Id
    private String iddto;

	private String namedto;

	private List<Product> products;
		private tn.esprit.shopping.entities.Categorie categorie;
		
		
}
