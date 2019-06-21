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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
public BasePlusCommissionEmployee(String firstname,String lastname,String ssn,double grossSales, double commissionrate,double basesalary)
{
super(firstname,lastname,ssn,grossSales,commissionrate);
this.baseSalary=basesalary;
}
public double getBaseSalary() {
     return baseSalary;
}
public void setBaseSalary(double baseSalary) {
this.baseSalary = baseSalary;
}
public double earnings()
{
    return getBaseSalary()+super.earnings();

}
public String toString() {
    super.toString();
System.out.println("Gross Sales: "+getGrossSlaes());
System.out.println("Commission Rate: "+getCommissionRate()+" with Base Salary of: "+getBaseSalary());
System.out.println("Earnings: "+earnings());
return " ";
}

    
}
