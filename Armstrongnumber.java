package Javabasicdemo;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*An Armstrong number (or narcissistic number) is a positive integer equal to the sum of its own digits, each raised to the power of the total number of digits. For example, 
		 is a 3-digit Armstrong number because */
int n=153;
int a=n;
int rem;
int result=0;
while(a!=0)
{
	rem=a%10;//modules
	result+=rem*rem*rem;
	a/=10;//division
}
if(result==n)
{
	System.out.println("armstrong number");
	}
else {
	System.out.println("Not armstrong number");
}
	}

}
