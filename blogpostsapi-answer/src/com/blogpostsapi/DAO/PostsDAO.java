package com.blogpostsapi.DAO;
import java.util.List;

import com.blogpostsapi.entity.Posts;

public interface PostsDAO {
	
		public List<Posts> getAllPosts();
		public Posts getPost(int post_id);

}
