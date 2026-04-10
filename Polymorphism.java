package Javabasicdemo;

/* polymorphism have 2types 1. compile time -it called static and overloading method-same class, same function but different parameter
 *  2. runtime -it is called dynamic and overriding method-one main class and more function and same function*/ 
 
class overload
{
	int add(int a, int b) {
		return a+b;	
	}
	int add(int a, int b, int c) {
		return a*b*c;
	}
	double add (double a, double b)
	{
		return a-b;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
overload v=new overload();
System.out.println(v.add(12, 20));
System.out.println(v.add(12, 20, 30));
System.out.println(v.add(1.3, 3.0));

	}

}
