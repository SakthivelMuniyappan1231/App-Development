package com.minduints.onlineservice.repository;





import org.springframework.data.jpa.repository.JpaRepository;





import org.springframework.stereotype.Repository;


import com.minduints.onlineservice.model.*;



@Repository

public interface ServiceRepository extends JpaRepository<Service, Long>{
	
	


}