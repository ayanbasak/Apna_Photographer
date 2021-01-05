package com.apna.photographer.completeDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {
	
	//define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mess")
	private String mess;
	
	//define constructors
	
	public Message() {
		
	}

	public Message(int id, String name, String email, String mess) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.mess = mess;
	}

	public Message(String name, String email, String mess) {
		
		this.name = name;
		this.email = email;
		this.mess = mess;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + ", email=" + email + ", mess=" + mess + "]";
	}

	
	
	
}
