package Javabasicdemo;
/*Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
 * Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.*/
class Bankaccount
{
	double initialamount;
	double availbalamt=initialamount;
	  void deposit(double deposit)
	 {
		  if(deposit>0)
		  {
			  availbalamt+=deposit;
		  }
		  else
		  {
			  System.out.println("After depoit your available balance is:"+availbalamt);
		  }
	 }
	  void withdraw(double withdraw)
	 {
		  if(withdraw>availbalamt)
		  {
			  availbalamt-=withdraw;
		  }
		  else
		  {
			  System.out.println("After withdrawal your available balance is:"+availbalamt);  
		  }
 	 }
	  void checkbalance(double availbalamt)
	  {
		  System.out.println("Your available balance is:"+availbalamt);  

	  }
}
class Savingaccount extends Bankaccount
{
	 void withdraw (double availbalamt)
	 {
		 if(availbalamt<withdraw)
		 {
			  System.out.println("insuffient balance");  

		 }
		 else if(withdraw<2000)
		 {
			  System.out.println("Musthave 2000 current ba,ance amount in your account");  
		 }
		 else
		 {
			  System.out.println(availbalamt);  
 
		 }
     }
}
public class override_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount b=new Bankaccount();
	

		//b.withdraw();
		//b=new Savingaccount();
		//b.withdraw();

	}

}
