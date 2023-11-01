package com.yvens.hexa_impl.application.service.stadium;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;
import com.yvens.hexa_impl.domain.port.api_red.stadium.StadiumServicePort;
import com.yvens.hexa_impl.domain.port.spi_blue.stadium.StadiumJpaPort;

@Service
public class StadiumApplicationService implements StadiumServicePort {

  private StadiumJpaPort stadiumJpaPort;

  public StadiumApplicationService(StadiumJpaPort stadiumJpaPort) {
    this.stadiumJpaPort = stadiumJpaPort;
  }

  @Override
  public List<StadiumDomainModel> getAllStadiums() {
    // Logique à implmenter au besoin avant de retourner les données
    return this.stadiumJpaPort.getAllStadiums();
  }

  @Override
  public StadiumDomainModel getStadiumById(int id) {
    // Logique à implmenter au besoin avant de retourner les données
    return this.stadiumJpaPort.getStadiumById(id);
  }
  
}
