package Javabasicdemo;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//implicit automatic type casting low to high
		int a=93;
		System.out.println(a);
		float b=a;
		System.out.println(b);
		byte e=-128;//hands-on
		System.out.println(e);
		float f=e;
		System.out.println(f);
		
		
//explicit manual high to low
		float c=(float) 7.8;
		int d=(int) c;
		System.out.println(d);
		double g=(double) 235.789;//hands-on
		int t=(int) g;
		System.out.println(t);
	
		
		
		
	}

}
