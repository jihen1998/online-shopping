package tn.esprit.shopping.entities;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document
public class Image implements Serializable{
	@org.springframework.data.annotation.Id
	private String id;

	
	private String name;

	private String type;

    //image bytes can have large lengths so we specify a value
    //which is more than the default length for picByte column
	
	private byte[] picByte;

 @JsonBackReference
 private Product product;


	public Image(String name, String type, byte[] picByte) {
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}



	public Image(String name, String type, byte[] picByte, Product product) {
		super();
		this.name = name;
		this.type = type;
		this.picByte = picByte;
		this.product = product;
	}
}
