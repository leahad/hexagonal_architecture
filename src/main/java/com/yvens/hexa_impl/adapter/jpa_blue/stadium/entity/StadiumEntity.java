package com.yvens.hexa_impl.adapter.jpa_blue.stadium.entity;

import com.yvens.hexa_impl.adapter.jpa_blue.team.entity.TeamEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stadium")
public class StadiumEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private String city;

  @OneToOne
  @JoinColumn(name = "team_id")
  private TeamEntity team;

  public StadiumEntity(){};
  
  public StadiumEntity(String name, String city, TeamEntity team){
    this.name = name;
    this.city = city;
    this.team = team;
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  public TeamEntity getTeam() {
    return team;
  }

  public void setTeam(TeamEntity team) {
    this.team = team;
  }
}
