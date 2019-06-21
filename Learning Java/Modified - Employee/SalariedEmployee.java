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
public class SalariedEmployee extends Employee{
    // instance variables
    private double slry;
    // constructor
public SalariedEmployee(String firstname, String lastname, String ssn,double salary)
{
super(firstname,lastname,ssn);
this.slry=salary;
}
//Setters Getters.

public double getSalary() {
    return slry;
}
public void setSalary(double salary) {
        if(salary>0)
        {
            this.slry = salary;
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
    //toString displays the contents of the Object.
    @Override
    public double earning (){
        return slry;
    }
    @Override
    public void raise(double percent){
        setSalary(getSalary()+(getSalary()*percent/100));
    }

}

