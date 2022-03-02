package gds.com.SpringJPAData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDataApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PaisesOcidentalRepository paisesOcidentalRepository) {
		return args -> {
			PaisesOcidental ucrania = new PaisesOcidental("Ucrania","Kiev","Grívnia","Ucraniano",45);
			paisesOcidentalRepository.save(ucrania);
		};

	}
}
