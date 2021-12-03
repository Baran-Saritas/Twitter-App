package com.project.questapp.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="p_like")
@Data
public class Like {

	@Id
	Long id;
	@ManyToOne(fetch=FetchType.LAZY)  // veriler cagirildiginda useri hemen getirme  demek 
	@JoinColumn(name="postId",nullable=false)
	@OnDelete(action =OnDeleteAction.CASCADE)   // user silinirse ona ait postlarinda  silinmesini saglar
    @JsonIgnore		// Serilization da sorun cikmamasi icin 					
	Post post;		
	
	
	@ManyToOne(fetch=FetchType.LAZY)  // veriler cagirildiginda useri hemen getirme  demek 
	@JoinColumn(name="userId",nullable=false)
	@OnDelete(action =OnDeleteAction.CASCADE)   // user silinirse ona ait postlarinda  silinmesini saglar
    @JsonIgnore		// Serilization da sorun cikmamasi icin 					
	User user;	
}
