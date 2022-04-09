package com.simplilearn.phase2.project;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects_data")
public class Subject {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="subject_name")
	private String subject_name;
	
	@Column(name="subject_code")
	private String subject_code;
	
	public Subject() {
		super();
		
	}
	public Subject(int id) {
		super();
		this.id=id;
	}
	
	public Subject(String subject_code,String subject_name) {
		super();
		this.subject_code=subject_code;
		this.subject_name=subject_name;
	}
	public Subject(int id,String subject_code,String subject_name) {
		super();
		this.id=id;
		this.subject_code=subject_code;
		this.subject_name=subject_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public String getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}
	
	@Override
	public String toString() {
		return "Subject[id="+id+",subject_name="+subject_name+",subject_code=\"+subject_code+\",]";
	}


}
