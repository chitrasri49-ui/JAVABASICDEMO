package Javabasicdemo;
import java.util.Scanner;

public class task2 {


	private static Scanner a;

	public static void main(String[] args) throws InterruptedException {
        a = new Scanner(System.in);
	    double Initialamt=2000.00;
	    System.out.println("Welcome to ATM");
	    System.out.println("your current balance is:"+Initialamt);
	    System.out.println("Enter your Pin:");
        int password =a.nextInt();        
	    int pin = 1234;
		if( password==pin){
	    	System.out.println("Deposit amount:");
	    }
	    else {
	    	System.out.println("Invalid pin, please enter valid pin");
	    }
	    int options=1;
        switch(options)
        {
        case 1: System.out.println("1.Deposit");
        break;
        case 2: System.out.println("2.Withdrawal"); 
        break;
        case 3: System.out.println("3.Checkbalance");
        break;
        default : System.out.println("Cancel");
        }
//deposit amount option        
        double depositamt =a.nextDouble();    
        if(options==1)
        {
        	System.out.println("Deposited amount is:"+depositamt);
        }
        else
        {
        	System.out.println("Cancelled Deposit option");
        }
        double total=depositamt+Initialamt;
		System.out.println("Total amount after deposit:"+total);

//withdrawal option

        double withdrawalamt=a.nextDouble();
		if(options==2) 
		{
        	System.out.println("give your Withdrawal amount");
        }
        else if(withdrawalamt<=0) 
        {
        	System.out.println("Invalid amount");
        }
        else if(withdrawalamt>total) 
        {
        	System.out.println("Insuffient balance");
        }
        else {
			System.out.println("collet your case");
        }
		double balance=total-withdrawalamt;
		System.out.println("Total amount after withdraw:"+balance);

//checking balance		
		
		
        if(options==3) {
        	System.out.println("you have chosen check balance option");
	    }
        //else if()
	    else {
	    	System.out.println("Your current available balance is:"+ balance);
	    }
	}
}
