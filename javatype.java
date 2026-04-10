package Javabasicdemo;

import java.util.*;

public class javatype {
	private static Scanner b;

	public static void main(String[] args) {
		b = new Scanner(System.in);
     System.out.println("enter integer value:");
     int a = b.nextInt();
     System.out.println("a="+a);
     System.out.println("enter character value:");
     char a1=b.next().charAt(0);
     System.out.println("a1="+a1);
     System.out.println("enter float value:");
     float a2=b.nextFloat();
     System.out.println("a2="+a2);
     System.out.println("enter byte value:");
     byte a3=b.nextByte();
     System.out.println("a3="+a3);
     System.out.println("enter short value:");
     short a4=b.nextShort();
     System.out.println("a4="+a4);
     System.out.println("enter long value:");
     long a5=b.nextLong();
     System.out.println("a5="+a5);
     System.out.println("enter Double value:");
     double a6=b.nextDouble();
     System.out.println("a6="+a6);
     System.out.println("enter String value:");
     java.lang.String a7=b.nextLine();
     System.out.println("a7="+a7);

     
	}

}
