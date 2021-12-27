package com.project.questapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.questapp.entities.Comment;
import com.project.questapp.repos.CommentRepository;

@Service
public class CommentService {

	CommentRepository commentRepository;
	private PostService postService;
	private UserService userService;
	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}
	
	public List<Comment> getAllComments(Optional<Long> commentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comment getOneCommentById(Long commentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comment createOneComment(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comment updateOnePost(Long commentId, Comment updateComment) {
		// TODO Auto-generated method stub
		return null;
	}

}
