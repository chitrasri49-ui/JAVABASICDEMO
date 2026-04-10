package Javabasicdemo;
// multilevel inheritance
 class grandfather
 {
	 void show()
	 {
		 System.out.println("Multilevel inheritance sub class1");
	 }
 }
 class daddy extends grandfather
 {
	 void showa()
	 {
		 System.out.println("Multilevel inheritance sub class2");
 
	 }
 }
public class multilevel extends daddy 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multilevel v=new multilevel();
		v.show();
		v.showa();
		
	}

}
