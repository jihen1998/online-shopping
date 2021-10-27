package tn.esprit.shopping.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import tn.esprit.shopping.entities.Image;


public interface ImageService {
	
	public Object saveImg(MultipartFile file,String ad) throws Exception;
	public Object retrievImage(long id,String imageName);
	public List<Image> retrievallproduct();
	public Object getById(int id);
	public void deleteProduct(int id);
	List<byte[]> getByProductId(int id);
}
