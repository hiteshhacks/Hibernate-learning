package com.Hitesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[]args){

        Student s1 = new Student();

        s1.setsName("Jash");
        s1.setRollNo(36);
        s1.setsAge(19);

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.Hitesh.Student.class)
                .configure()
                .buildSessionFactory();  //cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);
        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);
    }
}
