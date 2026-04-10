package Javabasicdemo;
//super keyword used only to call parent class object 
class parents
{
	final int a=80;
	final void add()
	{
		System.out.println("java");
	}
}
public class Keywordtypes_finalandsuper extends parents {
public void show()
{
	int b=89;
	int c=super.a+b;
	System.out.println(c);
	super.add();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keywordtypes_finalandsuper v=new Keywordtypes_finalandsuper();
		v.show();
	}

}
