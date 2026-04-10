package Javabasicdemo;
class animal
{
	void sound()
	{
		System.out.println("Animal make different sounds");
	}
}
class dog extends animal
{
	void sound() 
	{
		System.out.println("Dog makes barking");
	}
}
class cat extends animal
{
	void sound()
	{
		System.out.println("cat makes meows");	
	}
}
public class Ploymorphismoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animal v;
v=new animal();
v.sound();
v= new dog();
v.sound();
v=new cat();
v.sound();
	}

}
