package tn.esprit.shopping.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderProductPK implements Serializable {

    private OrderDTO orderdto;
    private ProductDTO productdto;

   
}