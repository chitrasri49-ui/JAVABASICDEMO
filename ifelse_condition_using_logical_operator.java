package Javabasicdemo;

public class ifelse_condition_using_logical_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Logical operator && || !
		int a=90, b=89, c=150;
//using && operator both condition are pass it will pass
		if(a>b && a>c)
		{
			System.out.println("A is greater than all");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater than all");
		}
		else
		{
			System.out.println("C is greater than all");
		}
//using || operator either one condition is pass it will pass
		int d=70, e=50, f=170;
		if(d>e || d>f)
		{
			System.out.println("D is greater than all");
		}
		else if(e>d || e>f)
		{
			System.out.println("E is greater than all");
		}
		else
		{
			System.out.println("F is greater than all");
		}
//using ! operator if true condition give false result 
				int g=70;
				if(!(g<0))
				{
					System.out.println("G is Positive value");
				}
				else
				{
					System.out.println("G is negative value");
				}
	}

}
