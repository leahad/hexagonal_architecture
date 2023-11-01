package com.yvens.hexa_impl.domain.port.api_red.team;

import java.util.List;

import com.yvens.hexa_impl.domain.model.team.TeamDomainModel;

public interface TeamServicePort {

  List<TeamDomainModel> getTeams();
  TeamDomainModel getTeamById(int id);
}
