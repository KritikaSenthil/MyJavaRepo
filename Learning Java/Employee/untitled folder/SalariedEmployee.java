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
public class SalariedEmployee extends Employee {
    private double salary;
public SalariedEmployee(String firstname, String lastname, String ssn,double salary)
{
super(firstname,lastname,ssn);
this.salary=salary;
}
public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
        if(salary>0)
        {
            this.salary = salary;
        }
        else
        {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        }
            
    public double earnings()
{
return getSalary();
}
    public String toString() {
        super.toString();
System.out.println("Salary: : "+getSalary());
System.out.println("Earnings: "+earnings());
return " ";
    }

}
