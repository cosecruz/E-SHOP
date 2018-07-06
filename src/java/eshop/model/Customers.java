/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.model;

/**
 *
 * @author EBUKA
 */
import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customers implements java.io.Serializable{
 
 @Column(name = "first_name")
 private String FirstName;
 
@Column(name = "last_name")
 private String LastNname;
 
 @Column(name = "Password")
 private int Password;
 
 @Column(name = "Confirm_Password")
 private int CPassword;
 
 @Id
 @Column(name = "e_mail")
 private String Email;
 
 @Column(name = "Phone_number")
 private long Number;
 
 @Column(name = "DoB")
 private String DoB;
 
 @Column(name = "gender")
 private String Gender;
 
 


    /**
     * @return the Password
     */
    public int getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(int Password) {
        this.Password = Password;
    }


    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Number
     */
    public long getNumber() {
        return Number;
    }

    /**
     * @param Number the Number to set
     */
    public void setNumber(long Number) {
        this.Number = Number;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }

    /**
     * @param DoB the DoB to set
     */
    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastNname
     */
    public String getLastNname() {
        return LastNname;
    }

    /**
     * @param LastNname the LastNname to set
     */
    public void setLastNname(String LastNname) {
        this.LastNname = LastNname;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the CPassword
     */
    public int getCPassword() {
        return CPassword;
    }

    /**
     * @param CPassword the CPassword to set
     */
    public void setCPassword(int CPassword) {
        this.CPassword = CPassword;
    }
 
}
