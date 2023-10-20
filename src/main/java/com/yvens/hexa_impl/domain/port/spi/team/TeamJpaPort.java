package com.yvens.hexa_impl.domain.port.spi.team;

import java.util.List;

import com.yvens.hexa_impl.domain.model.team.TeamDomainModel;

public interface TeamJpaPort {

  List<TeamDomainModel> getAllTeams();

  TeamDomainModel getTeamById(int id);
}
