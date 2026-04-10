package Javabasicdemo;

//OOPS-Object Oriented Programming Language
		/* 5 types of inheritance
		1. single inheritance
		 * 2. Multilevel inheritance
		 * 3. Hierarchy inheritance
		 * 4. Multiple inheritance
		 * 5. hybrid inheritance*/

//Single inherit
class father{
	void show() {
		System.out.println("Single inheritance");
	}
}

public class Oops_concept extends father{
     public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 Oops_concept v=new Oops_concept();
		v.show();
		}
}

