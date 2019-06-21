/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts.app;

import javafx.scene.image.Image;

/**
 *
 * @author kritikasenthil
 */
public class Contact {
    private String fname="";
    private String lname="";
    private String email="";
    private String homeAddress="";
    private String phoneNumber="";
    private Image image;
    //photo

    public Contact(String fname, String lname, String email, String homeAddress, String phoneNumber) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }
    
    public Contact(){
        
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getFullName(){
        if (this.getFname().equals("")&&this.getLname().equals("")){
            return "New Contact";
        }
        else{
            return getFname()+" "+getLname();
        }
        
    }
    
    public String getCompareString(){
        if (this.getFname().equals("")&&this.getLname().equals("")){
            return "contactnew";
        }
        else{
            return this.getLname()+this.getFname();
        }
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }
    
}
