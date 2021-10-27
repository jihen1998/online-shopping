package tn.esprit.shopping.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.shopping.entities.Image;
import tn.esprit.shopping.entities.Product;

public interface ImageRepository extends  MongoRepository<Image,  Integer> {
	public Optional<Image> findByName(String name);
	public List<byte[]> findByProductId(@Param("id") long id);
	public List<Image> findByProductAndType(Product product, String string);

}