package Javabasicdemo;

public class reversenumbertask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12345;
int result=0;
int reverse;
while(a!=0)
{
	reverse=a%10;
	result=result*10+reverse;
	a=a/10;
}
System.out.print(result);

	}

}
