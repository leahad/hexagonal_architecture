package com.yvens.hexa_impl.adapter.jpa.team.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yvens.hexa_impl.adapter.jpa.team.entity.TeamEntity;
import com.yvens.hexa_impl.domain.model.team.TeamDomainModel;

@Component
public class TeamJpaMapper {
  public List<TeamDomainModel> toTeamDomainModelList(List<TeamEntity> teamEntityList) {
    List<TeamDomainModel> teamDomainModelList = new ArrayList<>();
    for (TeamEntity teamEntity : teamEntityList) {
      TeamDomainModel teamDomainModel = new TeamDomainModel(teamEntity.getId(),teamEntity.getName(), "");
      teamDomainModelList.add(teamDomainModel);
    }
    return teamDomainModelList;
  }

  public TeamDomainModel toTeamDomainModel(TeamEntity teamEntity) {
    TeamDomainModel teamDomainModel = new TeamDomainModel(teamEntity.getId(),teamEntity.getName(), "");
    return teamDomainModel;
  }

}
