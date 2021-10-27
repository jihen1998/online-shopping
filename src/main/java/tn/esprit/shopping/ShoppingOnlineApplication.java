package tn.esprit.shopping;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import tn.esprit.shopping.entities.ERole;
import tn.esprit.shopping.entities.Role;
import tn.esprit.shopping.repositories.RoleRepository;

@SpringBootApplication
@EnableMongoRepositories
public class ShoppingOnlineApplication {	  private static final Logger logger = LogManager.getLogger(ShoppingOnlineApplication.class);

public static void main(String[] args) {
	SpringApplication.run(ShoppingOnlineApplication.class, args);
	}
@Bean
CommandLineRunner runner(RoleRepository rolerep,MongoTemplate mongotemplate){		

	return args->{ 
		
		try{Role roleuser =new Role(ERole.ROLE_USER);
			rolerep.save(roleuser);

		}
		catch(Exception e){
			logger.trace("deja existe role user");
		}
		try{	
			Role roleadmin =new Role(ERole.ROLE_ADMIN);
			rolerep.save(roleadmin);

	}
	catch(Exception e){
		logger.trace("deja existe role admin");

	}

	try{	 Role rolemoderator =new Role(ERole.ROLE_MODERATOR); 

		rolerep.save(rolemoderator);

	}
	catch(Exception e){
		logger.trace("deja existe role moderator");

	}
	};
}
}
