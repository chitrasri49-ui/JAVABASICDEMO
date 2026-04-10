package Javabasicdemo;
interface forestanimal
{
	void show();
}
class lion implements forestanimal
{
	public void show()
	{
		System.out.println("Java interface abstraction");
	}
}
public class Interfaceabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forestanimal v=new lion();
v.show();
	}

}
