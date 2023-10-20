package com.yvens.hexa_impl.domain.model.team;

import java.util.Date;

public class GameDomainModel {

  private int id;
  private Date name;
  private TeamDomainModel opponents;
  private String score;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getName() {
    return name;
  }

  public void setName(Date name) {
    this.name = name;
  }

  public TeamDomainModel getOpponents() {
    return opponents;
  }

  public void setOpponents(TeamDomainModel opponents) {
    this.opponents = opponents;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

}
