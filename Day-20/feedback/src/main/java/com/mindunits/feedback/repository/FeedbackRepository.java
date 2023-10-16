package com.mindunits.feedback.repository;
import org.springframework.data.repository.CrudRepository;

import com.mindunits.feedback.model.FeedbackModel;



public interface FeedbackRepository extends CrudRepository<FeedbackModel,String> {
    
}