package com.yvens.hexa_impl.adapter.jpa_blue.stadium;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yvens.hexa_impl.adapter.jpa_blue.stadium.entity.StadiumEntity;
import com.yvens.hexa_impl.adapter.jpa_blue.stadium.mapper.StadiumJpaMapper;
import com.yvens.hexa_impl.adapter.jpa_blue.stadium.repository.StadiumRepository;
import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;
import com.yvens.hexa_impl.domain.port.spi_blue.stadium.StadiumJpaPort;

@Component
public class StadiumJpaAdapter implements StadiumJpaPort {

  private StadiumRepository stadiumRepository;
  private StadiumJpaMapper stadiumJpaMapper;

  public StadiumJpaAdapter(StadiumRepository stadiumRepository, StadiumJpaMapper stadiumJpaMapper) {
    this.stadiumRepository = stadiumRepository;
    this.stadiumJpaMapper = stadiumJpaMapper;
  }

  @Override
  public List<StadiumDomainModel> getAllStadiums() {
    List<StadiumEntity>  stadiumEntityList = this.stadiumRepository.findAll();
    return this.stadiumJpaMapper.toStadiumDomainModelList(stadiumEntityList);
  }

  @Override
  public StadiumDomainModel getStadiumById(int id) {
    StadiumEntity stadiumEntity = this.stadiumRepository.findById(id).get();
    return this.stadiumJpaMapper.toStadiumDomainModel(stadiumEntity);
  }
  
}
