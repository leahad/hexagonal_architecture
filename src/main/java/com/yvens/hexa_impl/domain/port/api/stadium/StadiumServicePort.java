package com.yvens.hexa_impl.domain.port.api.stadium;

import java.util.List;

import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;

public interface StadiumServicePort {

  List<StadiumDomainModel> getAllStadiums();

  StadiumDomainModel getStadiumById(int id); 

}
