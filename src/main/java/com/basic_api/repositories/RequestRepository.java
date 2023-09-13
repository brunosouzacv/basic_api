package com.basic_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.basic_api.entities.Request;
import com.basic_api.entities.enums.RequestState;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
	
	public List<Request> findAllByOwnerId(Long id);
	
	@Query("UPDATE Request SET state = ?2 WHERE id = ?1")
	public Request updateStatus(Long id, RequestState state);

}
