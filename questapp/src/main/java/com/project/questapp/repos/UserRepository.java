package com.project.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.questapp.entities.User;

// JpaRepository<User, Long>  1. parametre Hangi repoyu kullanicaksin diyor
//2.ise ID`si hangi tipte olucak onu soruyor
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
