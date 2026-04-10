package Javabasicdemo;
//Hierarchy inheritance
class appa
{
	void show() {
		System.out.println("Hierarchy father class");
	}
}
class daughter extends appa
{
	void showa()
	{
		System.out.println("Hierarchy daughter class");

	}
}
public class Hierarchy extends appa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchy v=new Hierarchy();
	v.show();
	daughter d=new daughter();
	d.showa();
	System.out.println("Hierarchy son class");

	}
	

}
