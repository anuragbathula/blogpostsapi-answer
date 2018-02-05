package com.blogpostsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blogpostsapi.DAO.PostsDAO;
import com.blogpostsapi.entity.Posts;

@Component
public class PostsController {
	
	@Autowired
	private PostsDAO postsDAO;
	
	@RequestMapping("/posts")
	private String getPosts(){
		List<Posts> posts = postsDAO.getAllPosts();
		String result = posts.toString();
		return result;
	}
	
}
