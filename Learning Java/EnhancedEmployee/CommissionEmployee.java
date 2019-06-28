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
public class CommissionEmployee extends Employee {
    // instance variables
    private double grossSales;
    private double commRate;
     // constructor
    public CommissionEmployee(String firstname, String lastname, String ssn,double grossSales, double commissionrate) {
     super(firstname,lastname,ssn);
     this.grossSales=grossSales;
     this.commRate=commissionrate;
    }
       // Setters Getters.
   public double getGrossSales() {
  return grossSales;
}
   public void setGrossSales(double grossSales) {
 this.grossSales = grossSales;
   }
   public double getCommissionRate() {
      return commRate;}
   
   public void setCommissionRate(double commissionRate) {
        this.commRate = commissionRate;
   }
   public double earnings()
{
    return getCommissionRate()*getGrossSales();
}
    // toString method displays contents of the Object.
   public String toString() {
       super.toString();
       System.out.println("Gross Sales: "+getGrossSales());
       System.out.println("Commission Rate: "+getCommissionRate());
       System.out.println("Earnings: "+earnings());
        return "";
    
}
   
       @Override
    public double earning() {
        return (getGrossSales() * getCommissionRate());
    }
    @Override
    public void raise(double percent){
        setCommissionRate(getCommissionRate()+ (getCommissionRate()*percent/100));
    }

}

