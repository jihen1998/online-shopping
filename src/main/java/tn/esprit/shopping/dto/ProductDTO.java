package tn.esprit.shopping.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tn.esprit.shopping.entities.SousCategorie;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ProductDTO implements Serializable{
    private String iddto;
    private String namedto;
	private SousCategorie sousCategorie;
   
    private Double price;

    private String pictureUrl;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
    
    
}