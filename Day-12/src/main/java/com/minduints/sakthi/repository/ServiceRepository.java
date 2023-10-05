package com.minduints.sakthi.repository;
import org.springframework.data.repository.CrudRepository;

import com.minduints.sakthi.model.ServiceModel;

public interface ServiceRepository extends CrudRepository<ServiceModel,String> {
    
}