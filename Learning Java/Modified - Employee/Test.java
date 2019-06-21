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
public class Test {
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        CommissionEmployee employee1 = new CommissionEmployee("Fred", "Jones", "111-11-1111", 2000.0, .05);
        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Sue", "Smith", "222-22-2222", 3000.0, .05, 300);
        SalariedEmployee employee3 = new SalariedEmployee("Shan", "Yang", "333-33-3333", 1150.0);
        HourlyEmployee employee4 = new HourlyEmployee("Ian", "Tanning", "444-44-4444", 15.0, 50);
        HourlyEmployee employee5 = new HourlyEmployee("Angela", "Domchek", "555-55-5555", 20.0, 40);
 
        Employee[] emp = new Employee[5];
        emp[0]=employee1;
        emp[1]=employee2;
        emp[2]=employee3;
        emp[3]=employee4;
        emp[4]=employee5;
        
        System.out.println("Employee Information. ");
            for(int i = 0; i<emp.length; i++){
              System.out.printf("%s", emp[i]);
     }
            
            System.out.println();
             System.out.println();
              System.out.println();
            
     for(int i = 0; i<emp.length; i++){
         if (emp[i] instanceof SalariedEmployee){
             emp[i].raise(4);
         }
         else{
             emp[i].raise(2);
         }
     }
     System.out.println("Employee information after raises.  ");
    
            for(int i = 0; i<emp.length; i++){
              System.out.printf("%s", emp[i]);
     
}
}
}

    
