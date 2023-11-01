package com.yvens.hexa_impl.domain.model.stadium;

import com.yvens.hexa_impl.domain.model.team.TeamDomainModel;

// Le Modèle fait référence à la représentation de la logique métier du système.
// Le Modèle peut inclure des entités, des Value Objects et des règles de domaine. 
// Il capture les concepts métier essentiels du système.

public class StadiumDomainModel {
  private int id;
  private String name;
  private String city;
  private TeamDomainModel team;

  public StadiumDomainModel(int id, String name, String city,TeamDomainModel team) {
    this.id = id;
    this.name = name;
    this.city = city;
    this.team = team;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  public String getTeam() {
    return team.getName().toString();
  }

  public void setTeam(TeamDomainModel team) {
    this.team = team;
  }

  public String getTeamPerStadium() {
    return this.getName() + "" + this.getTeam();
  }

}
