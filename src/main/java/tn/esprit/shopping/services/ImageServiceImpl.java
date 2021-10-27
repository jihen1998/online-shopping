package tn.esprit.shopping.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.esprit.shopping.entities.Image;
import tn.esprit.shopping.entities.Product;
import tn.esprit.shopping.repositories.ImageRepository;

@Service
public class ImageServiceImpl implements ImageService {
	@Autowired
	private ImageRepository imageRepository;
	
	@Override
	public Object saveImg(MultipartFile file, String object) throws Exception{
		Product productJson = new Product();
	
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			productJson = objectMapper.readValue(object, Product.class);
		} catch (IOException err) {
		}

		// when it is an Product
			Image imgProduct = new Image(file.getOriginalFilename(), file.getContentType(),
					file.getBytes(), productJson);

			// check if it is an image or no
			
		
					return imageRepository.save(imgProduct);
	}
	@Override
	public Object retrievImage(long id,String imageName) {
			final Optional<Image> retrievedImage = imageRepository.findByName(imageName);
		
			return retrievedImage.orElseThrow(null).getPicByte();
	}

	@Override
	public List<Image> retrievallproduct() {
		
		return  imageRepository.findAll();
	}

	@Override
	public byte[] getById(int id) {
	
			 Image img = imageRepository.findById(id).orElseThrow(null)	;		
					 return  img.getPicByte();
	
			
	}

	@Override
	public void deleteProduct(int id) {
		imageRepository.deleteById(id);

	}
	@Override
	public List<byte[]> getByProductId(int id) {
		return  imageRepository.findByProductId(id);
	}


	
}
