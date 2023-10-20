package com.yvens.hexa_impl.domain.model.team;


// Value Object
public class TeamValueDomainModel {

  private int teamMarketValue;
  private int teamSportValue;

  public int getTeamMarkketValue() {
    return teamMarketValue;
  }
  public void setTeamMarketValue(int teamMarketValue) {
    this.teamMarketValue = teamMarketValue;
  }
  public int getTeamSportValue() {
    return teamSportValue;
  }
  public void setTeamSportValue(int teamSportValue) {
    this.teamSportValue = teamSportValue;
  }
  
}
