package com.yvens.hexa_impl.adapter.rest_red.team.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yvens.hexa_impl.adapter.rest_red.team.dto.TeamDto;
import com.yvens.hexa_impl.domain.model.team.TeamDomainModel;

@Service
public class TeamRestMapper {

  public List<TeamDto> toTeamDtoList(List<TeamDomainModel> teamDomainModelList) {
    List<TeamDto> teamDtoList = new ArrayList<>();
    for (TeamDomainModel teamDomainModel : teamDomainModelList) {
      TeamDto teamDto = new TeamDto(teamDomainModel.getId(), teamDomainModel.getName());
      teamDtoList.add(teamDto);
    }
    return teamDtoList;
  }

  public TeamDto toTeamDto(TeamDomainModel teamDomainModel) {
    TeamDto teamDto = new TeamDto(teamDomainModel.getId(), teamDomainModel.getName());
    return teamDto;
  }

}
