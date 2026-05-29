## learning Hibernate ORM 
Hibernate is an open-source ORM (Object Relational Mapping) framework for Java. It simplifies database operations by mapping Java objects to database tables and vice versa. Instead of writing SQL queries manually, developers can work with Java objects, and Hibernate handles the database interactions automatically.

# steps to set up hibernate
1. create maven project 
2. add dependencies of postgres and hibernate in the pom.xml
3. create file
4. keep class name same as table name 
5. set up getter, setter and override 
6. set Entity and ID from JPA
7. Create session factory
8. create sessions 
9. create transaction 
10. close and commit 

# simple version 
```
package com.Hitesh;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[]args){

        Student s1 = new Student();
        s1.setsName("Suyash");
        s1.setRollNo(35);
        s1.setsAge(19);


        Configuration cfg =new Configuration();
        cfg.addAnnotatedClass(com.Hitesh.Student.class);
        cfg.configure();

        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.persist(s1);
        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);
    }
}
```
# Optimised version 
```
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

```

