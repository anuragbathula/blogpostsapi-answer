package com.blogpostsapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Posts {

	@Column
	private String title;
	
	@Column
	private String body;
	
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int post_id;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	
	public Posts() {
		// TODO Auto-generated constructor stub
	}
	
	public Posts(String title, String body) {
		this.title = title;
		this.body = body;
	}
	

	@Override
	public String toString() {
		return "Posts [title=" + title + ", body=" + body + ", post_id=" + post_id + "]";
	}
	
	
	
}
