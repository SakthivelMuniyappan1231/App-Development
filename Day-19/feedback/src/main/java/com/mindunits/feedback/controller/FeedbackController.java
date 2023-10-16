package com.mindunits.feedback.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.mindunits.feedback.constant.Api;
import com.mindunits.feedback.model.FeedbackModel;
import com.mindunits.feedback.service.FeedbackService;


@RestController
@RequestMapping(Api.FEEDBACK)
public class FeedbackController {
	@Autowired
    private FeedbackService feedbackService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllFeedbacks() {
        ArrayList<FeedbackModel> feedback = feedbackService.getAllFeedbacks();
        return ResponseEntity.ok().body(feedback);
    }

    @PostMapping("/postFeedback")
    public ResponseEntity<?> addFeedback(@RequestBody FeedbackModel feedbackModel) {
        String res = feedbackService.addFeedback(feedbackModel);
        return ResponseEntity.ok().body(res);
    }

    @PutMapping("/putFeedback")
    public ResponseEntity<?> putFeedback(@RequestParam String fid, @RequestBody FeedbackModel feedbackModel) {
        Boolean flag = feedbackService.putFeedback(fid, feedbackModel);
        if (flag)
            return ((BodyBuilder) ResponseEntity.ok()).body("Updated Successfully");
        return ((BodyBuilder) ResponseEntity.notFound()).body("Service Id Not Found");
    }
    @DeleteMapping("/deleteFeedback")
    public ResponseEntity<?> deleteFeedback(@RequestParam String fid) {
        Boolean flag = feedbackService.deleteFeedback(fid);
        if (flag)
            return ((BodyBuilder) ResponseEntity.ok()).body("Deleted Successfully");
        return ((BodyBuilder) ResponseEntity.notFound()).body("Service Id Not Found");
    }

}
