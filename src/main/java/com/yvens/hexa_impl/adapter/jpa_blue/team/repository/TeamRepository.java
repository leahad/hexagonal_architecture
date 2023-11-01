package com.yvens.hexa_impl.adapter.jpa_blue.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yvens.hexa_impl.adapter.jpa_blue.team.entity.TeamEntity;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {
  
}
