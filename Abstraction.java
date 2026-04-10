package Javabasicdemo;
abstract class  add
{
	abstract void show();
}
public class Abstraction extends add {
public void show()
{
	System.out.println("java");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction a=new Abstraction();
		a.show();
	}

}
