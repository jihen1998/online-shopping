package tn.esprit.shopping.dto;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.shopping.entities.ERole;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class RoleDTO {
	@Id
	private String iddto;
		private ERole namedto;

	

	public RoleDTO(ERole name) {
		this.namedto = name;
	}
}