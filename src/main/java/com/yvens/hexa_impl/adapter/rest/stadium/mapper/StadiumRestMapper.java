package com.yvens.hexa_impl.adapter.rest.stadium.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yvens.hexa_impl.adapter.rest.stadium.dto.StadiumDto;
import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;

@Service
public class StadiumRestMapper {

  public List<StadiumDto> toStadiumDtoList(List<StadiumDomainModel> stadiumDomainModelList) {
    List<StadiumDto> stadiumDtoList = new ArrayList<>();
    for (StadiumDomainModel stadiumDomainModel : stadiumDomainModelList) {
      StadiumDto stadiumDto = new StadiumDto(stadiumDomainModel.getId(), stadiumDomainModel.getName(),
          stadiumDomainModel.getCity());
      stadiumDtoList.add(stadiumDto);
    }
    return stadiumDtoList;
  }

  public StadiumDto toStadiumDto(StadiumDomainModel stadiumDomainModel) {
    StadiumDto stadiumDto = new StadiumDto(stadiumDomainModel.getId(), stadiumDomainModel.getName(),
        stadiumDomainModel.getCity());
    return stadiumDto;
  }
}
