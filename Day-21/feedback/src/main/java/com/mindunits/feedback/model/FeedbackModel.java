package com.mindunits.feedback.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "feedback")
public class FeedbackModel {
	 @Id
	    @GeneratedValue(strategy = GenerationType.UUID)
	    private String fid; 
	    private String feedbackName; 
	    private String feedbackEmail;
	   

}
