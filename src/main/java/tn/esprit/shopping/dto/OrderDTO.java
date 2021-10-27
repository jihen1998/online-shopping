package tn.esprit.shopping.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tn.esprit.shopping.entities.OrderProduct;
import tn.esprit.shopping.entities.User;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class OrderDTO implements Serializable{
    private String iddto;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreated;

    private String status;    
    private List<OrderProduct> orderProducts = new ArrayList<>();
	private User user;
    
    @Transient
    public int getNumberOfProducts() {
        return this.orderProducts.size();
    }

	public String getIddto() {
		return iddto;
	}


	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}

}
