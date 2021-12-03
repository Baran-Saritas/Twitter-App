package com.project.questapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity    // tabloya maplenmesini sagliyor 
@Table(name="user")
@Data  // user classinin getter ve setterlarini otomatik tanimlar
public class User {

	@Id    // unique oldugunu gostermek icin
	Long id;
	String username;
	String password;
	
}
