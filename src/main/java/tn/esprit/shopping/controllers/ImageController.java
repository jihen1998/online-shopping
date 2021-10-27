package tn.esprit.shopping.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.shopping.entities.Image;
import tn.esprit.shopping.services.ImageService;

public class ImageController {

	  @Autowired
	  private ImageService imgService;
	  
		@PreAuthorize("hasAuthority('ROLE_ADMIN')")
		@PostMapping(value="/upload", consumes = { MediaType.APPLICATION_JSON_VALUE,
				 MediaType.MULTIPART_FORM_DATA_VALUE })
		public ResponseEntity<List<String>>uplaodImage(@RequestParam("imageFile") MultipartFile[] files,@RequestPart() String ad)  {
		
			List<String> fileNames = new ArrayList<>();

		      Arrays.asList(files).stream().forEach(file -> {
		    	  try {
					imgService.saveImg(file,ad);fileNames.add(file.getOriginalFilename());
				} catch (Exception e) {
					e.printStackTrace();
					
				}
		        
		      });
	if(!fileNames.isEmpty())
			return new ResponseEntity<>(fileNames,HttpStatus.OK);
	else  		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
		
		
		@PreAuthorize("hasAuthority('ADMIN')")

		@GetMapping(path = { "/getname/{idAd}/{imageName}" })
		public byte[] getImageByName(@PathVariable("idAd") long idAd,@PathVariable("imageName") String imageName) {
			

			return (byte[]) imgService.retrievImage(idAd,imageName);
		}
		
		
		

		@GetMapping(path = { "/getid/{id}" })
		public byte[] getImageById(@PathVariable("id") int id) {
			return (byte[])imgService.getById(id);

		}
	

	
	

		

		@GetMapping(path = { "/all" })
		public List<Image> getAll()  {
			 			
			return imgService.retrievallproduct();
		}
		@PreAuthorize(" hasAuthority('SELLER')")

		@DeleteMapping("/delete/img/{id}")
		public ResponseEntity<String> delete(@PathVariable("id") int id)  {
			imgService.deleteProduct(id);
			return new ResponseEntity<>("success",HttpStatus.OK);
		}
		@GetMapping("/getforad/{id}"  )
		public List<byte[]> getImageByIdAd(@PathVariable("id") int id) {
			
			return  imgService.getByProductId(id);
		}

}
