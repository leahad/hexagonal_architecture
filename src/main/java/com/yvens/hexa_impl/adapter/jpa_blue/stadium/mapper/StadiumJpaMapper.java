package com.yvens.hexa_impl.adapter.jpa_blue.stadium.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yvens.hexa_impl.adapter.jpa_blue.team.mapper.TeamJpaMapper;
import com.yvens.hexa_impl.adapter.jpa_blue.stadium.entity.StadiumEntity;
import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;

@Component
public class StadiumJpaMapper {

  TeamJpaMapper teamJpaMapper;

  public StadiumJpaMapper(TeamJpaMapper teamJpaMapper) {
    this.teamJpaMapper = teamJpaMapper;
  }

  public StadiumDomainModel toStadiumDomainModel(StadiumEntity stadiumEntity) {
    return new StadiumDomainModel(stadiumEntity.getId(), stadiumEntity.getName(), stadiumEntity.getCity(), teamJpaMapper.toTeamDomainModel(stadiumEntity.getTeam()));
  }

  public List<StadiumDomainModel> toStadiumDomainModelList(List<StadiumEntity> stadiumEntityList) {
    List<StadiumDomainModel> stadiumDomainModelList = new ArrayList<>();
    for (StadiumEntity stadiumEntity : stadiumEntityList) {
      stadiumDomainModelList.add(toStadiumDomainModel(stadiumEntity));
    }
    return stadiumDomainModelList;
  }

}
