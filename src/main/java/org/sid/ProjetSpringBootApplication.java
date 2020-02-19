package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetSpringBootApplication implements CommandLineRunner{

	@Autowired
	private ProduitRepository produitRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		produitRepository.save(new Produit(null, "PC 5648", 6000, 12));
//		produitRepository.save(new Produit(null, "Imprimente HP 1234", 1200, 10));
//		produitRepository.save(new Produit(null, "PC Compacp", 9000, 1));
//		produitRepository.save(new Produit(null, "Scanner", 1000, 16));
//		produitRepository.findAll().forEach(p -> {
//			System.out.println(p.getDesignation());
//		});
		
	}

}
