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
public class CommissionEmployee extends Employee {
     private double grossSlaes;
    private double commissionRate;
    public CommissionEmployee(String firstname, String lastname, String ssn,double grossSales, double commissionrate) {
     super(firstname,lastname,ssn);
     this.grossSlaes=grossSales;
     this.commissionRate=commissionrate;
    }
   public double getGrossSlaes() {
  return grossSlaes;
}
   public void setGrossSlaes(double grossSlaes) {
 this.grossSlaes = grossSlaes;
   }
   public double getCommissionRate() {
      return commissionRate;}
   
   public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
   }
   public double earnings()
{
    return getCommissionRate()*getGrossSlaes();
}
   public String toString() {
       super.toString();
       System.out.println("Gross Sales: "+getGrossSlaes());
       System.out.println("Commission Rate: "+getCommissionRate());
       System.out.println("Earnings: "+earnings());
        return "";
    
}

}
