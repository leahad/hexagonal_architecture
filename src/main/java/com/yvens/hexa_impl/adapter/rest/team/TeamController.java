package com.yvens.hexa_impl.adapter.rest.team;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yvens.hexa_impl.adapter.rest.team.dto.TeamDto;
import com.yvens.hexa_impl.adapter.rest.team.mapper.TeamRestMapper;
import com.yvens.hexa_impl.domain.port.api.team.TeamServicePort;

@RestController
@RequestMapping("/teams")
public class TeamController {

  private TeamServicePort teamServicePort;
  private TeamRestMapper teamRestMapper;

  public TeamController(TeamServicePort teamServicePort, TeamRestMapper teamRestMapper) {
    this.teamServicePort = teamServicePort;
    this.teamRestMapper = teamRestMapper;
  }

  @GetMapping("/{id}")
  public ResponseEntity<TeamDto> getTeamById(@RequestParam int id) {
    try {
      TeamDto teamDto = this.teamRestMapper.toTeamDto(this.teamServicePort.getTeamById(id));
      return ResponseEntity.ok(teamDto);
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }

  @GetMapping("")
  public ResponseEntity<List<TeamDto>> getTeams() {
    try {
      List<TeamDto> teamDtoList = this.teamRestMapper.toTeamDtoList(this.teamServicePort.getTeams());
      return ResponseEntity.ok(teamDtoList);
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }
}

