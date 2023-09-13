package com.basic_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basic_api.entities.RequestStage;

@Repository
public interface RequestStageRepository extends JpaRepository<RequestStage, Long>{
	
	public List<RequestStage> findAllByRequestId(Long id);

}
