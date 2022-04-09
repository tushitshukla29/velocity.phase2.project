package com.simplilearn.phase2.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="classes_data")
public class classes {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="classroom")
	private String classroom;
	
	@Column(name="room_number")
	private String room_number;
	
	@Column(name="section")
	private String section;

	public classes(int id) {
		super();
		this.id=id;
	}
	public classes(){
		super();
	}
	
	public  classes(String classroom, String room_number, String section) {
		super();
		this.classroom = classroom;
		this.room_number = room_number;
		this.section = section;
	}


	public  classes(int id, String classroom, String room_number, String section) {
		super();
		this.id = id;
		this.classroom = classroom;
		this.room_number = room_number;
		this.section = section;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getclassroom() {
		return classroom;
	}

	public void setclassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getRoom_number() {
		return room_number;
	}

	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	@Override
	public String toString() {
		return "classes [id=" + id + ", classroom=" + classroom + ", roomno=" + room_number + ", section=" + section + "]";
	}
	
}
