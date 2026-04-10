package Javabasicdemo;

public class Encalpsulation {
private int age;
public int getage()
{
	return age;
}
public void setage(int a)
{
	age=a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encalpsulation v=new Encalpsulation();
		v.setage(29);
		System.out.println(v.getage());
	}

}
