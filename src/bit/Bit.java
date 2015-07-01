/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit;

import Model.Customer;
import login.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sithara Gunawardhana
 */
public class Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        SessionFactory sessionFactory = null  ;
//        Session session=sessionFactory.openSession();
//        session.beginTransaction();
//        
//        Customer customer = new Customer();
//        customer.setName("Dulaj");
//        session.saveOrUpdate(customer);
//        session.flush();
//       
//        session.close();
     
        Login login =new Login();
        login.main(null);
        
//        Customer customer=new Customer();
//        customer.setId(1);
//        customer.setName("Dulaj");
//        
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session=sessionFactory.openSession();
//        session.beginTransaction();
//        session.update(customer);
//        session.getTransaction().commit();
//        session.close();
//        
        
        
    }

}
