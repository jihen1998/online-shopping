package tn.esprit.shopping.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tn.esprit.shopping.entities.Product;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ImageDTO implements Serializable{
	private String iddto;

	
	private String namedto;

	private String typedto;

    //image bytes can have large lengths so we specify a value
    //which is more than the default length for picByte column
	
	private byte[] picBytedto;
 private Product productdto;


	public ImageDTO(String name, String type, byte[] picByte) {
		this.namedto = name;
		this.typedto = type;
		this.picBytedto = picByte;
	}



	public ImageDTO(String name, String type, byte[] picByte, Product product) {
		super();
		this.namedto = name;
		this.typedto = type;
		this.picBytedto = picByte;
		this.productdto = product;
	}
}
