package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLExample 
{
 public static void main(String[] args) {
	 Configuration cfg=new Configuration();
     cfg.configure("hibernate.cfg.xml");
     SessionFactory factory=cfg.buildSessionFactory();
     Session s=factory.openSession();
     String query="from Student where city='Delhi'";
     Query q=s.createQuery(query);
     List<Student> list=q.list();
     for(Student student:list)
     {
    	 System.out.println(student.getName()+":"+student.getCerti().getCourse());
     }
     s.close();
     factory.close();
}
}
