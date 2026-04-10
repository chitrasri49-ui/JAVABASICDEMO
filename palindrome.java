package Javabasicdemo;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=121;
		int b=a;
		int result=0;
		int palin;
		while(b!=0)
		{
			palin=b%10;
			result=result*10+palin;
			b=b/10;
		}
		System.out.print(result);
if(a==result) {
	System.out.println(" it is a palindrome number");
}
else
{
	System.out.println(" its not a palindrome number");

}
	}

}
