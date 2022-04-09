package com.simplilearn.phase2.project.util;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.simplilearn.phase2.project.Student;
import com.simplilearn.phase2.project.Subject;
import com.simplilearn.phase2.project.Teachers;
import com.simplilearn.phase2.project.classes;
public class HibernateSessionUtil {
	
	
	private static SessionFactory factory;
	
	public static SessionFactory buildSessionFactory() {
		
		return factory = new Configuration().configure("hibernate.cfg.xml")
				
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Teachers.class)
				.addAnnotatedClass(classes.class)
				.addAnnotatedClass(Subject.class)
				
			.buildSessionFactory();
		
		
	}

}
