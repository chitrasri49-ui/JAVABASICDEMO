package Javabasicdemo;
//this keyword used only within current class only
public class Keywordtypes_this {
int a=100;
public void show(int a)
{
	System.out.println(a);
	System.out.println(this.a);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keywordtypes_this v=new Keywordtypes_this();
		v.show(500);
	}

}
