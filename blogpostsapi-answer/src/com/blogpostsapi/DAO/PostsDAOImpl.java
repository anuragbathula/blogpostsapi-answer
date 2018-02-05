package com.blogpostsapi.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.blogpostsapi.entity.Posts;


@Repository
public class PostsDAOImpl implements PostsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Posts> getAllPosts() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Posts> query = session.createQuery("from Posts", Posts.class);
		List<Posts> posts = query.getResultList();
		return posts;
	}

	@Override
	public Posts getPost(int post_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
