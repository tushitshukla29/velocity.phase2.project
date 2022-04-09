package com.simplilearn.phase2.project;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tec_data")
public class Teachers {

	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		private int id;
		
		@Column(name="teacher_name")
		private String teacher_name;
		
		@Column(name="teacher_email")
		private String teacher_email;
		
		@Column(name="teacher_address")
		private String teacher_address;
		
		@Column(name="teacher_subject")
		private String teacher_subject;
		
		@Column(name="created_at")
		private Date createdAt;
		
		@Column(name="modified_at")
		private Date modifiedAt;
		
		public Teachers() {
		}
		
		public Teachers(int id) {
			this.id=id;
		}
		
		public Teachers(String teacher_name,String teacher_email,String teacher_address,String teacher_subject) {
			super();
			this.teacher_name=teacher_name;
			this.teacher_email=teacher_email;
			this.teacher_address=teacher_address;
			this.teacher_subject=teacher_subject;
			//this.createdAt= new Data();
			//this.modifiedAt=new Data();
			
		}
		
		public Teachers(int id, String teacher_name,String teacher_email,String teacher_address,String teacher_subject) {
			super();
			this.id=id;
			this.teacher_name=teacher_name;
			this.teacher_email=teacher_email;
			this.teacher_address=teacher_address;
			this.teacher_subject=teacher_subject;
			//this.createdAt= new Data();
			//this.modifiedAt=new Data();
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTeacher_name() {
			return teacher_name;
		}

		public void setTeacher_name(String teacher_name) {
			this.teacher_name = teacher_name;
		}

		public String getTeacher_email() {
			return teacher_email;
		}

		public void setTeacher_email(String teacher_email) {
			this.teacher_email = teacher_email;
		}

		public String getTeacher_address() {
			return teacher_address;
		}

		public void setTeacher_address(String teacher_address) {
			this.teacher_address = teacher_address;
		}

		public String getTeacher_subject() {
			return teacher_subject;
		}

		public void setTeacher_subject(String teacher_subject) {
			this.teacher_subject = teacher_subject;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getModifiedAt() {
			return modifiedAt;
		}

		public void setModifiedAt(Date modifiedAt) {
			this.modifiedAt = modifiedAt;
		}
		
		
		@Override
		public String toString() {
			return "Teachers[id="+id+",teacher_name="+teacher_name+",teacher_email=\"+teacher_email+\",teacher_address=\"+teacher_address+\",teacher_subject=\"+teacher_subject+\",createdAt=\"+createdAt+\",modifiedAt="+modifiedAt+"]";
		}
}
