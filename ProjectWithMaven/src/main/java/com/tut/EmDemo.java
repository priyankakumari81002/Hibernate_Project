package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo 
{
 public static void main(String[] args) 
 {
	 Configuration cfg=new Configuration();
     cfg.configure("hibernate.cfg.xml");
     SessionFactory factory=cfg.buildSessionFactory();
     
     Student student1=new Student();
     student1.setId(1234);
     student1.setName("Priyanka");
     student1.setCity("Delhi");
     
     
    Certificate certifcate=new Certificate();
    certifcate.setCourse("JDBC");
    certifcate.setDuration("2 months");
    student1.setCerti(certifcate);
    
    Student student2=new Student();
    student2.setId(5678);
    student2.setName("Om");
    student2.setCity("Bokaro");
    
    
   Certificate certifcate1=new Certificate();
   certifcate1.setCourse("Hibernate");
   certifcate1.setDuration("3 months");
   student2.setCerti(certifcate1);
   
   Session s=factory.openSession();
   Transaction tx=s.beginTransaction();
   s.save(student1);
   s.save(student2);
   tx.commit();
   s.close();
   factory.close();
}
}
