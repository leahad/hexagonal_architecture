package com.yvens.hexa_impl.adapter.jpa.stadium.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yvens.hexa_impl.adapter.jpa.stadium.entity.StadiumEntity;
import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;

@Component
public class StadiumJpaMapper {

  public StadiumDomainModel toStadiumDomainModel(StadiumEntity stadiumEntity) {
    return new StadiumDomainModel(stadiumEntity.getId(), stadiumEntity.getName(), stadiumEntity.getCity());
  }

  public List<StadiumDomainModel> toStadiumDomainModelList(List<StadiumEntity> stadiumEntityList) {
    List<StadiumDomainModel> stadiumDomainModelList = new ArrayList<>();
    for (StadiumEntity stadiumEntity : stadiumEntityList) {
      stadiumDomainModelList.add(toStadiumDomainModel(stadiumEntity));
    }
    return stadiumDomainModelList;
  }

}
