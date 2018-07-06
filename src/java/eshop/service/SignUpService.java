/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.service;

import eshop.model.Customers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author EBUKA
 */
@Service
@Transactional
public class SignUpService {
    @Autowired
    private SessionFactory sessionFactory;
    public String signUp(Customers customer){
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
        return "success";
    }
}
