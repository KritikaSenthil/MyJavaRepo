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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSlry;
public BasePlusCommissionEmployee(String firstname,String lastname,String ssn,double grossSales, double commissionrate,double basesalary)
{
super(firstname,lastname,ssn,grossSales,commissionrate);
this.baseSlry=basesalary;
}
public double getBaseSalary() {
     return baseSlry;
}
public void setBaseSalary(double baseSalary) {
this.baseSlry = baseSalary;
}
public double earnings()
{
    return getBaseSalary()+super.earnings();

}
public String toString() {
    super.toString();
System.out.println("Gross Sales: "+getGrossSales());
System.out.println("Commission Rate: "+getCommissionRate()+" with Base Salary of: "+getBaseSalary());
System.out.println("Earnings: "+earnings());
return " ";
}

    
}

