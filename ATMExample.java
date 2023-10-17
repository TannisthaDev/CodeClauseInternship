import java.util.Scanner;  

public class ATMExample  
{    
    public static void main(String args[] )  
    {  
         
        int balance = 0, withdraw=0, deposit=0,transfer=0;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Check Transaction history");  
            System.out.println("Choose 5 for Transfer money");
            System.out.println("Choose 6 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
             
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
         
        withdraw = sc.nextInt();  
                      
       
        if(balance >= withdraw)  
        {    
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {    
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
            case 2:  
                      
        System.out.print("Enter money to be deposited:");  
        deposit = sc.nextInt();  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  

            case 3:  
      
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
      
            case 4:
        System.out.println("deposit  : "+deposit);
        System.out.println("withdraw : "+withdraw);
        System.out.println("transfer: "+transfer);
        break;

        case 5:
       
        long Accno;
        int amount;
        System.out.println("enter 11 digit account no");
        Accno= sc.nextLong();
        long n= Accno;
        int c= (int)Math.floor(Math.log10(n)+1);
        if(c!=11){
            System.out.println("invalid account no");
        }
        else{
            System.out.println("enter amount");
            amount =sc.nextInt();
            if(balance>=amount){
                transfer= amount;
                balance= balance-amount;
                System.out.println("transfer successfully"+ Accno);
            }
            else{
                System.out.println("Insufficient balanace");
                
            }
        }
        break;

   
        case 6:  
        
        System.exit(0);  
            }  
        }  
    }  
}  