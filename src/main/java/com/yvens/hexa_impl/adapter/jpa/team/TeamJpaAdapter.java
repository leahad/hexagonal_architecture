package com.yvens.hexa_impl.adapter.jpa.team;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yvens.hexa_impl.adapter.jpa.team.entity.TeamEntity;
import com.yvens.hexa_impl.adapter.jpa.team.mapper.TeamJpaMapper;
import com.yvens.hexa_impl.adapter.jpa.team.repository.TeamRepository;
import com.yvens.hexa_impl.domain.model.team.TeamDomainModel;
import com.yvens.hexa_impl.domain.port.spi.team.TeamJpaPort;

@Component
public class TeamJpaAdapter implements TeamJpaPort {

  private final TeamJpaMapper teamJpaMapper;
  private TeamRepository teamRepository;

  public TeamJpaAdapter(TeamJpaMapper teamJpaMapper, TeamRepository teamRepository) {
    this.teamJpaMapper = teamJpaMapper;
    this.teamRepository = teamRepository;
  }


  @Override
  public List<TeamDomainModel> getAllTeams() {
    List<TeamEntity> teams = this.teamRepository.findAll();
    return this.teamJpaMapper.toTeamDomainModelList(teams);
  }

  @Override
  public TeamDomainModel getTeamById(int id) {
    TeamEntity team = this.teamRepository.findById(id).orElse(null);
    return this.teamJpaMapper.toTeamDomainModel(team);
  }
  
}
