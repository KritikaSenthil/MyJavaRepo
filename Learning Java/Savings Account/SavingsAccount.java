/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savings.account;

/**
 *
 * @author kritikasenthil
 */
class SavingsAccount 
{
        static private double annualInterestRate;
        private double savingsBalance;
        
        public SavingsAccount()
        {
            this.savingsBalance = 0;

        }
        public SavingsAccount(double savingsBalance)
        {
            this.savingsBalance=savingsBalance;
        }
        public double getSavingsBalance()
        {
            return (this.savingsBalance);
        }
        
        public static void modifyInterestRate(double newInterestRate)
        {
                annualInterestRate=newInterestRate;
        }

        public void calculateMonthlyInterest()
        {
                double interest = 0;
                interest= (this.savingsBalance*(annualInterestRate/100)/12);
                this.savingsBalance+=interest;
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
                SavingsAccount s1 = new SavingsAccount(2000.0);
                SavingsAccount s2 = new SavingsAccount(3000.0);
                
                

                SavingsAccount.modifyInterestRate (4.0);
                
                
                System.out.printf("\nMonth"+"\t"+"Saver1"+"\t"+"Saver2");
                for(int i = 1; i<13; i++) {
                    
                    s1.calculateMonthlyInterest();
                    s2.calculateMonthlyInterest();
                    System.out.print(i+"\t"+String.format("%.2f",s1.getSavingsBalance())+"\t"+String.format("%.2f",s2.getSavingsBalance()));
                    
                    System.out.println();
               }
              
                SavingsAccount.modifyInterestRate (5.0);
                for(int i = 1; i<13; i++) {
                    s1.calculateMonthlyInterest();
                    s2.calculateMonthlyInterest();
                    System.out.print(i+"\t"+String.format("%.2f",s1.getSavingsBalance())+"\t"+String.format("%.2f",s2.getSavingsBalance()));
               }

            
                                        
    }
 }   


    
            
    