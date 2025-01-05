package com.firstproject;

import com.firstproject.model.ContractEmployee;
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
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        FullTimeEmployee emp = new FullTimeEmployee();
        emp.setName("JAY");
        emp.setAge(23);
        emp.setAddress("Pune");
        emp.setDesignation("Frontend-Developer");
        emp.setSalary(3000);
        session.save(emp);
        tx.commit();
        session.close();
        sf.close();
    }
}
