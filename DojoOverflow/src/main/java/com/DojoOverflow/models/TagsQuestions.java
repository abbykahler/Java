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
	@Table(name="tagsQuestions")
	public class TagsQuestions {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="tagId")
	    private Tags tags;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="questionId")
	    private Questions questions;
	    
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    
	
		public TagsQuestions() {
		}
		
		
		
		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public Tags getTags() {
			return tags;
		}



		public void setTags(Tags tags) {
			this.tags = tags;
		}



		public Questions getQuestions() {
			return questions;
		}



		public void setQuestions(Questions questions) {
			this.questions = questions;
		}



		public Date getCreatedAt() {
			return createdAt;
		}



		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}



		public Date getUpdatedAt() {
			return updatedAt;
		}



		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}



		@PrePersist
		protected void onCreate() {
			this.createdAt = new Date();
		}
		@PreUpdate
		protected void onUpdate() {
			this.updatedAt = new Date();
		} 
	}
	