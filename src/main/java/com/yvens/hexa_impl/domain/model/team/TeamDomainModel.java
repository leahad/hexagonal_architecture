package com.yvens.hexa_impl.domain.model.team;

// Aggregate 
public class TeamDomainModel {

  private int id;
  private String name;
  // private int teamValue;
  private TeamValueDomainModel teamValue;
  private String origin;
  int nbPlayer = 15;

  public TeamDomainModel(int id, String name, String origin) {
    this.id = id;
    this.name = name;
    this.origin = origin;
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

  public void calculateTeamMarketValue() {
    int coefMarketing = 2;
    this.teamValue.setTeamMarketValue((int) (nbPlayer * coefMarketing));
  }

  public void calculateTeamSportValue() {
    double coefSport = 1.5;
    this.teamValue.setTeamSportValue((int) (nbPlayer * coefSport));
  }

  public TeamValueDomainModel getTeamValue() {
    return teamValue;
  }

  public void setTeamValue(TeamValueDomainModel teamValue) {
    this.teamValue = teamValue;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public int getNbPlayer() {
    return nbPlayer;
  }

  public void setNbPlayer(int nbPlayer) {
    this.nbPlayer = nbPlayer;
  }

}
