/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit;

import login.Login;

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
        
    }

}
