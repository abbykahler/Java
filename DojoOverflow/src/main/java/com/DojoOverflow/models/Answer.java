package com.DojoOverflow.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
//	@Size(min=5, max=250)
//	private String answer;
//	
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="question_id")
    private Questions questions;

	private String answer;

	

	

//	private String answers;
//
//	private Date createdAt;
//
//	private Date updatedAt;
    
   
    public Answer() {
    }
    
    public Answer(String answer, Questions questions) {
		this.answer = answer;
		this.questions = questions;
	}
    
 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getCreatedAt() {
		return getCreatedAt();
	}

	public void setCreatedAt(Date createdAt) {
	}

	public Date getUpdatedAt(Date updatedAt) {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestion(Questions question) {
		this.questions = question;
	}

	@PrePersist
	protected void onCreate() {
		new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		new Date();
	}
}