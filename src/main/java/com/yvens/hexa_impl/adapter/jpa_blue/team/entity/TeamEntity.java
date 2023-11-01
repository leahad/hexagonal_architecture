package com.yvens.hexa_impl.adapter.jpa_blue.team.entity;

import com.yvens.hexa_impl.adapter.jpa_blue.stadium.entity.StadiumEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")
public class TeamEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  @OneToOne(mappedBy = "team")
  private StadiumEntity stadium;

  public TeamEntity() {}

  public TeamEntity(String name) {
    this.name = name;
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

  public StadiumEntity getStadium() {
    return stadium;
  }

  public void setStadium(StadiumEntity stadium) {
    this.stadium = stadium;
  }
}