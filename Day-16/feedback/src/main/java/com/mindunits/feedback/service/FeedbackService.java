package com.mindunits.feedback.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindunits.feedback.model.FeedbackModel;
import com.mindunits.feedback.repository.FeedbackRepository;

@Service

public class FeedbackService {
	
	@Autowired
    private FeedbackRepository  feedbackRepository;

    public ArrayList<FeedbackModel> getAllFeedbacks() {
        ArrayList<FeedbackModel> feedbacks = (ArrayList<FeedbackModel >) feedbackRepository.findAll();
        return feedbacks;
    }

    public String addFeedback(FeedbackModel feedbackModel) {
        feedbackRepository.save(feedbackModel);
        return "Service Added Successfully";
    }

    public Boolean putFeedback(String fid, FeedbackModel feedbackModel) {
        Boolean isExists = feedbackRepository.findById(fid).isPresent();
        if (!isExists)
            return false;
        FeedbackModel storedFeedbackModel = feedbackRepository.findById(fid).get();
        FeedbackModel newFeedbackModel = updateFeedbackModel(storedFeedbackModel, feedbackModel);
        feedbackRepository.save(newFeedbackModel);
        return true;
    }

    public Boolean deleteFeedback(String fid) {
        Boolean isExists = feedbackRepository.findById(fid).isPresent();
        if (!isExists)
            return false;
        feedbackRepository.deleteById(fid);
        return true;
    }

    public FeedbackModel updateFeedbackModel(FeedbackModel storedFeedbackModel, FeedbackModel feedbackModel) {
        var newFeedbackModel =FeedbackModel.builder()
                .fid(storedFeedbackModel.getFid())
                .feedbackName(feedbackModel.getFeedbackName())
                .feedbackEmail(feedbackModel.getFeedbackEmail()).build();
                return newFeedbackModel;

    }

}
