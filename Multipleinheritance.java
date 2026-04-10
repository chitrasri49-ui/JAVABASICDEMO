package Javabasicdemo;
interface a{
	void show();
}
interface b
{
	void showa();
}
public class Multipleinheritance implements a,b{
public void show()
{
	System.out.println("Multiple inheritance");
}
public void showa()
{
	System.out.println("Multiple inheritance-hiding function process and using implements keyword to merge other calsses to main class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleinheritance v=new Multipleinheritance();
		v.show();
		v.showa();
	}

}
