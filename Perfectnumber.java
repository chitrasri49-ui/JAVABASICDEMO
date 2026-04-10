package Javabasicdemo;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*a positive integer that equals the sum of its proper divisors (all positive divisors excluding the number itself). For example, 6 is a perfect number because its divisors (1, 2, and 3) add up to 6*/
int a=21;
int s=0; 
 for(int i=1;i<=a/2;i++)
 {
	if(a%i==0)
 {
     s+=i;
 }
 }
	/if(s==a) 
	{
		System.out.println("perfect number:"+a);

	}
	//else
		{
		System.out.println("Not Perfect number:"+a);
		}
 }

}
