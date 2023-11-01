package com.yvens.hexa_impl.adapter.jpa_blue.stadium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yvens.hexa_impl.adapter.jpa_blue.stadium.entity.StadiumEntity;

@Repository
public interface StadiumRepository extends JpaRepository<StadiumEntity, Integer> {

}
