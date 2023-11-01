package com.yvens.hexa_impl.adapter.rest_red.stadium;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yvens.hexa_impl.adapter.rest_red.stadium.dto.StadiumDto;
import com.yvens.hexa_impl.adapter.rest_red.stadium.mapper.StadiumRestMapper;
import com.yvens.hexa_impl.domain.port.api_red.stadium.StadiumServicePort;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {

    private StadiumServicePort stadiumServicePort;
    private StadiumRestMapper stadiumRestMapper;

    public StadiumController(StadiumServicePort stadiumServicePort, StadiumRestMapper stadiumRestMapper) {
        this.stadiumServicePort = stadiumServicePort;
        this.stadiumRestMapper = stadiumRestMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StadiumDto> getStadiumById(@PathVariable int id) {
        try {
            StadiumDto stadiumDto = this.stadiumRestMapper.toStadiumDto(this.stadiumServicePort.getStadiumById(id));
            return ResponseEntity.ok(stadiumDto);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("")
    public ResponseEntity<List<StadiumDto>> getTeams() {
        try {
            List<StadiumDto> StadiumDtoList = this.stadiumRestMapper.toStadiumDtoList(this.stadiumServicePort.getAllStadiums());
            return ResponseEntity.ok(StadiumDtoList);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}

