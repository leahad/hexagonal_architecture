package com.yvens.hexa_impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yvens.hexa_impl.adapter.jpa_blue.team.repository.TeamRepository;
import com.yvens.hexa_impl.adapter.jpa_blue.stadium.repository.StadiumRepository;
import com.yvens.hexa_impl.adapter.jpa_blue.stadium.entity.StadiumEntity;
import com.yvens.hexa_impl.adapter.jpa_blue.team.entity.TeamEntity;

@SpringBootApplication
public class HexaImplApplication {

	private TeamRepository teamRepository;
	private StadiumRepository stadiumRepository;

	public HexaImplApplication(TeamRepository teamRepository,StadiumRepository stadiumRepository) {
		this.teamRepository = teamRepository;
		this.stadiumRepository = stadiumRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(HexaImplApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			List<TeamEntity> teams = new ArrayList<>();
			TeamEntity FrenchTeam = new TeamEntity("France");
			TeamEntity GermanTeam = new TeamEntity("Allemagne");
			TeamEntity SpanishTeam = new TeamEntity("Espagne");
			teams.add(FrenchTeam);
			teams.add(GermanTeam);
			teams.add(SpanishTeam);
			this.teamRepository.saveAll(teams);

			List<StadiumEntity> stadiums = new ArrayList<>();
			StadiumEntity FrenchStadium = new StadiumEntity("Stade de France", "Paris", FrenchTeam);
			StadiumEntity GermanStadium = new StadiumEntity("Signal Iduna Park", "Dortmund", GermanTeam);
			StadiumEntity SpanishStadium = new StadiumEntity("Estadio Cornellà-El Prat", "Barcelona", SpanishTeam);
			stadiums.add(FrenchStadium);
			stadiums.add(GermanStadium);
			stadiums.add(SpanishStadium);
			this.stadiumRepository.saveAll(stadiums);
		};
	}
}

// Petit exo à faire: 
// Créer une liste de stadium dans le CommandLineRunner et la renvoyer dans le stadiumController
// Lier un stade et une équipe par relation sql puis renvoyer un stade et son équipe lorsque je sélectionne un stade

// Event Storming: https://www.youtube.com/watch?v=0-ppfFuGB-I&ab_channel=YOUNUP
