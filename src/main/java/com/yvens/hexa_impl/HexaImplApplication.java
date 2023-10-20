package com.yvens.hexa_impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yvens.hexa_impl.adapter.jpa.team.repository.TeamRepository;
import com.yvens.hexa_impl.adapter.jpa.team.entity.TeamEntity;

@SpringBootApplication
public class HexaImplApplication {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(HexaImplApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			List<TeamEntity> teams = new ArrayList<>();
			TeamEntity FranceTeam = new TeamEntity("France");
			TeamEntity GermanTeam = new TeamEntity("Allemagne");
			TeamEntity SpanishTeam = new TeamEntity("Esapagne");
			teams.add(FranceTeam);
			teams.add(GermanTeam);
			teams.add(SpanishTeam);
			this.teamRepository.saveAll(teams);
		};
	}

}

// Petit exo à faire: 
// Créer une liste de stadium dans le CommandLineRunner et la renvoyé dans le stadiumController
// Lier un stade et une équipe par relation sql puis renvoyer un stade et son équipe lorsque je sélectionne un stade

// Event Storming: https://www.youtube.com/watch?v=0-ppfFuGB-I&ab_channel=YOUNUP
