package com.yvens.hexa_impl.domain.model.team;

public class TeamDomainFactory {

  public TeamDomainModel createFrenchTeam() {
    return new TeamDomainModel(1, "XV de France", "France");
  }

  public TeamDomainModel createNewZealandTeam() {
    return new TeamDomainModel(2, "All Black", "New Zealand");
  }
}
