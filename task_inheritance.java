package Javabasicdemo;
/*Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
 * Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.
 */
abstract class birds
{
	   abstract void fly();
	   abstract void makesound();
 }
public class task_inheritance extends birds {
	 class Eagle extends birds
	{
	 void fly()
		{
			System.out.println("Eagle flying");

		}
	 void makesound()
		{
			System.out.println("eagle makes Kuk-kuk-kuk sound");

		}
	}
	 class Hawk extends birds
		{
		 void fly()
			{
				System.out.println("hawk is flying");

			}
			 void makesound()
			{
				System.out.println("hawk make kee-eee-ark sound");
			}
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			task_inheritance v=new task_inheritance();
			v.fly();
			v.makesound();
			Eagle b=new Eagle();
			b.fly();
			b.makesound();
			Hawk H= new Hawk();
			H.fly();
		    H.makesound();
		  
	}
}
