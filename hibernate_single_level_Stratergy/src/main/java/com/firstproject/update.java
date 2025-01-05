package com.firstproject;

import com.firstproject.model.Employee;
import com.firstproject.model.FullTimeEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class update
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        FullTimeEmployee emp = new FullTimeEmployee();
        emp.setId(2);
        emp.setSalary(2000);
        emp.setName("JAY");
        emp.setAge(23);
        emp.setAddress("Pune");
        emp.setDesignation("frontend-Developer");
        session.update(emp);
        tx.commit();
        session.close();
        sf.close();
    }
}
