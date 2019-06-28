/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassig2;

/**
 *
 * @author kritikasenthil
 */
public abstract class Employee {
    // instance variables
    private String firstname;
    private String lastname;
    private String ssn;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;
    
    public Employee(){
    }
     // constructor
    public Employee(String firstName,String lastname,String socialSecurityNumber)
    {
        super();
        this.firstname=firstname;
        this.lastname=lastname;
        this.ssn=socialSecurityNumber;
    }
    // Setters Getters.
    public String getFirstname() {
       return firstname;
   }
    public void setFirstname(String firstname) {
       this.firstname = firstname;
   }

   public String getLastname() {
       return lastname;
   }

   public void setLastname(String lastname) {
       this.lastname = lastname;
   }

   public String getSocialSecurityNumber() {
       return ssn;
   }

   public void setSocialSecurityNumber(String socialSecurityNumber) {
       this.ssn = socialSecurityNumber;
   }
   
    @Override
   public String toString() {
       System.out.println("Commissioned Employee: "+getFirstname()+" "+getLastname()+" with ssn: "+getSocialSecurityNumber());
       return " ";
       
   }

            
    public abstract double earning();
    
    public abstract void raise(double percent);


    public static void main(String[] args) {
       
    }
}

