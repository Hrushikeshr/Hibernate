package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started..." );
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        //Creating student
        Student student = new Student(102,"Golu","BBSR");
        System.out.println(student);
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }
}
