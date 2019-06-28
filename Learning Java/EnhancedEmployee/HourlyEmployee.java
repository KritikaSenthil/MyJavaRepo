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
public class HourlyEmployee extends Employee{
    //instance variables

    private double hrlyWage;
private int hrsworked;
// constructor
public HourlyEmployee(String firstname, String lastname, String ssn, double hourlyWage, int hoursworked) {
super(firstname,lastname,ssn);
this.hrlyWage=hourlyWage;
this.hrsworked=hoursworked;
}
public double getHourlyWage() {
   return hrlyWage;

}
public void setHourlyWage(double hourlyWage) {
if(hourlyWage>0)
{
    this.hrlyWage = hourlyWage;
}
else
{
    throw new IllegalArgumentException("HourlyWage must be greater than 0.0"); 
}
}
public int getHoursworked() {
  return hrsworked;
  
}
public void setHoursworked(int hoursworked) {
if(hoursworked>0 && hoursworked<=168)
{
     this.hrsworked = hoursworked;
}
else
{
    throw new IllegalArgumentException("Hours Worked must be greater than 0 and less than 168");
}
}
public double earnings()
{
 double sal=0;
 if(hrsworked<=40)
sal= hrlyWage*hrsworked;
else if(hrsworked>40)
{
    sal= (40*hrlyWage)+((hrsworked-40)*(hrlyWage*1.5));
    
}
 return sal;
}
public String toString() {
   super.toString();
  System.out.println("Hourly Wage :"+getHourlyWage());
System.out.println("Hours Worked :"+getHoursworked());
System.out.println("Earnings :$"+earnings());
return " ";

}
@Override
    public double earning() {
        double sum = 0;
            if (this.hrsworked > 40){
                sum = 40* this.hrlyWage + (this.hrsworked - 40) * 1.5 * this.hrlyWage;
            }else{
                sum = this.hrsworked * this.hrlyWage;
            }
            return sum;
    }
    @Override
    public void raise(double percent){
        setHourlyWage(getHourlyWage() + (getHourlyWage() * percent/100));
    }

    
}


    