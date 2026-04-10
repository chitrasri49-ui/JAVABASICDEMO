package Javabasicdemo;
import java.util.*;

public class task4_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fibonacci series- a sequence where each number (Fibonacci number) is the sum of the two preceding ones, usually starting from 0 and 1.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your fibo number:");
		int fibo=s.nextInt();
		int i=0, j=1;
        int a=1;
        System.out.println("Fibonacci Series");

        while (a <= fibo) {
        	int result=i+j;
        	i=j;
        	j=result;
        	
        	a++;
        }
        
	}
}
			     
			 



