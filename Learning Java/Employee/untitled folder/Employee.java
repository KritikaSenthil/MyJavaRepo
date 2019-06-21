/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author srikarduggi
 */
public class Employee {
    private String firstname;
    private String lastname;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;
    
    public Employee(){
    }
    public Employee(String firstName,String lastname,String socialSecurityNumber)
    {
        super();
        this.firstname=firstname;
        this.lastname=lastname;
        this.socialSecurityNumber=socialSecurityNumber;
    }
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
       return socialSecurityNumber;
   }

   public void setSocialSecurityNumber(String socialSecurityNumber) {
       this.socialSecurityNumber = socialSecurityNumber;
   }
   
   public String toString() {
       System.out.println("Commissioned Employee: "+getFirstname()+" "+getLastname()+" with ssn: "+getSocialSecurityNumber());
       return " ";
       
   }


    
}
