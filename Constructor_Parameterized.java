package Javabasicdemo;
//2 types of constructors-2. Parameterized Constructor-with parameter and without call function call in sub class

public class Constructor_Parameterized {
	Constructor_Parameterized(int num)
	{
		System.out.println(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Parameterized c=new Constructor_Parameterized(100);
	}
}
