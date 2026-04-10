package Javabasicdemo;
//super keyword used only to call parent class object 
class parent
{
	int a=80;
}

public class Keywordtype_super extends parent {
	public void show()
	{
		int b=89;
		int c=super.a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keywordtypes_finalandsuper v=new Keywordtypes_finalandsuper();
		v.show();
	}

}
