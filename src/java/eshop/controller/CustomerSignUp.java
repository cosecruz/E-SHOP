/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.controller;

import eshop.model.Customers;
import eshop.service.SignUpService;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author EBUKA
 */
@Named("signUp")
@SessionScoped
public class CustomerSignUp implements java.io.Serializable{
    private String email;
    private long number;
    private String dateOfBirth;
    private String gender;
    private String firstName;
    private String lastName;
    private int password;
    private int cPassword;
    @Autowired
    private SignUpService service;
    
    public CustomerSignUp(){}
    
    public String signUp(){
        Customers customer = new Customers();
        customer.setEmail(getEmail());
        customer.setNumber(getNumber());
        customer.setDoB(getDateOfBirth());
        customer.setLastNname(getLastName());
        customer.setFirstName(getLastName());
        customer.setGender(getGender());
        customer.setPassword(getPassword());
        customer.setCPassword(cPassword);
        
        String status = service.signUp(customer);
        if(status.equals("success")){
            return "CartPage";
        }
        return "SignupPage";
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the number
     */
    public long getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(long number) {
        this.number = number;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 
    
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * @return the cPassword
     */
    public int getcPassword() {
        return cPassword;
    }

    /**
     * @param cPassword the cPassword to set
     */
    public void setcPassword(int cPassword) {
        this.cPassword = cPassword;
    }
}
