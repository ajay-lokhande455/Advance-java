package com.ajay;


import com.ajay.model.Employee;
import com.ajay.model.FullTimeEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class EmployeeSave
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setName("Kundan");
        emp.setAddress("Washim");

        session.save(emp);

        tx.commit();
        session.close();
        System.out.println("Employee type object saved");
    }
}
