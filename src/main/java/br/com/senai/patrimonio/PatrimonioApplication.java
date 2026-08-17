package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatrimonioApplication.class, args);

		empresa empresa = new empresa();
		empresa.setRazaoSocial("quero me matar");
		System.out.println(empresa.getRazaoSocial());
	}

}
