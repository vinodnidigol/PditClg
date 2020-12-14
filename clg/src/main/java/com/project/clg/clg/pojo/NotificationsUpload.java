package com.project.clg.clg.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name="notificationsupload")
public class NotificationsUpload {
	@Id
	@GeneratedValue
	private int id ;
	@Column(name="title")
	private String title ;
	@Column(name="news")
	private String news ;
	@Lob
	@Column(name="data")
	private byte[] data ;
	
	
	public NotificationsUpload(int id, String title, String news, byte[] data) {
		super();
		this.id = id;
		this.title = title;
		this.news = news;
		this.data = data;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getNews() {
		return news;
	}


	public void setNews(String news) {
		this.news = news;
	}


	public byte[] getData() {
		return data;
	}


	public void setData(byte[] data) {
		this.data = data;
	}
	
	

}
