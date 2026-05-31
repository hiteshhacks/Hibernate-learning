//package com.Hitesh;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Main {
//    public static void main(String[]args){
//
//        Student s1 = new Student();
//
//        s1.setsName("Jash");
//        s1.setRollNo(36);
//        s1.setsAge(19);
//        Student s2 = null;
//
//        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(com.Hitesh.Student.class)
//                .configure()
//                .buildSessionFactory();  //cfg.buildSessionFactory();
//        Session session = sf.openSession();
//
//        s2=session.find(Student.class,34);
//
////        Transaction transaction = session.beginTransaction();
//
////        session.persist(s1);
////        transaction.commit();
//        session.close();
//        sf.close();
//
//        System.out.println(s2);
//    }
//}


//package com.Hitesh;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Main {
//    public static void main(String[]args){
//
//        Student s1 = new Student();
//
//        s1.setsName("Harshal");
//        s1.setRollNo(37);
//        s1.setsAge(21);
//
//
//        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(com.Hitesh.Student.class)
//                .configure()
//                .buildSessionFactory();  //cfg.buildSessionFactory();
//        Session session = sf.openSession();
//
//        s1 = session.find(Student.class,37);
//        Transaction transaction = session.beginTransaction();
//
//         session.remove(s1);
//        transaction.commit();
//
//        session.close();
//        sf.close();
//
//        System.out.println(s1);
//    }
//}
package com.Hitesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[]args){

        Alien a1 = new Alien();
        Laptop l1 = new Laptop();
        l1.setBrand("Asus");
        l1.setRam(24);
        l1.setModel("ROG");

        a1.setAname("Harshal");
        a1.setAid(47);
        a1.setTech("Python");
        a1.setLaptop(l1);



        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.Hitesh.Alien.class)
                .configure()
                .buildSessionFactory();  //cfg.buildSessionFactory();

        Session session = sf.openSession();


        Transaction transaction = session.beginTransaction();

        session.persist(a1);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(a1);
    }
}
