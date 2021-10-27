package tn.esprit.shopping.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.ToString;


@AllArgsConstructor
@ToString
@Data
public class OrderProductDTO {
String iddto;
    private OrderProductPK pk;
	private Integer quantity;

    // default constructor

    public OrderProductDTO(OrderDTO order, ProductDTO product, Integer quantity) {
        pk = new OrderProductPK();
        pk.setOrderdto(order);
        pk.setProductdto(product);
        this.quantity = quantity;
    }

    public OrderProductDTO() {
    }


}