package com.simplilearn.phase2.project;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="roll_number")
	private String roll_number;
	
	@Column(name="address")
	private String address;

	@Column(name="clas")
	private String clas;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dob")
	private String dob;

	
	public Student(int id) {
		super();
		this.id=id;
		
	}
	
	public Student(String name, String roll_number,String address,String clas, String gender,String dob) {
		super();
		this.name=name;
		this.roll_number=roll_number;
		this.address=address;
		this.clas=clas;
		this.gender=gender;
		this.dob=dob;
		}
	

	public Student(int id,String name, String roll_number,String address,String clas ,String gender,String dob) {
		super();
		this.id=id;
		this.name=name;
		this.roll_number=roll_number;
		this.address=address;
		this.clas=clas;
		this.gender=gender;
		this.dob=dob;
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

	public String getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Student[id= " +id+ ", name= " +name+ ", roll_number= " +roll_number+ " ,address= " +address+ " , clas= " +clas+ ", gender= " +gender+ ",dob=" +dob +"]";
}
}