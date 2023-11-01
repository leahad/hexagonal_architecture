package com.yvens.hexa_impl.domain.port.spi_blue.stadium;

import java.util.List;

import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;

public interface StadiumJpaPort {

  List<StadiumDomainModel> getAllStadiums();

  StadiumDomainModel getStadiumById(int id);
  
}
