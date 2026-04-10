package Javabasicdemo;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1. swap-using third variable	
 //int a=98;
 //int b=78;
 //System.out.println("a="+a);
 //System.out.println("b="+b);
 //int c=a;//c=98
 //a=b;//a=78
 //b=c;//b=98
 //System.out.println("a="+a);
 //System.out.println("b="+b);
		
//2. swap-using assignment operators
 //int a=98;
 //int b=78;
 //System.out.println("a="+a);
 //System.out.println("b="+b);
 //a=a+b;//a=176
 //b=a-b;//b=176-78=98
 //a=a-b;//a=176-98=78
 //System.out.println("a="+a);
 //System.out.println("b="+b);
		
//3. swap-using bitwise ^ operator
	int a=5;
	int b=7;
    System.out.println("a="+a);
    System.out.println("b="+b);
	a=a^b;//a=2
	b=a^b;//b=5
	a=a^b;//a=7
    System.out.println("a="+a);
    System.out.println("b="+b);
    
    int d =98;
    int e=78;
    System.out.println("d="+d);
    System.out.println("e="+e);
	d=d^e;//d=44
	e=d^e;//e=98
	d=d^e;//d=78
    System.out.println("d="+d);
    System.out.println("e="+e);
    
	
	//System.out.println("a="+(a-20));//assign a value to b using arithmetic operators
	//System.out.println("b="+(b+20));//assign a value to b using arithmetic operators
	//System.out.println("a="+(a-=20));//assign b value to a using assignment operators
	//System.out.println("b="+(b+=20));//assign b value to a using assignment operators

}
}
