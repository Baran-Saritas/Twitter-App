package com.project.questapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.questapp.entities.Comment;

// burda entitiyde olusturdugumuz repolari import edicez 

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
