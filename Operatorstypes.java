package Javabasicdemo;

public class Operatorstypes {
	
//1.Arithmetic operators(+,-,*,/,%)
public static void main (String[] args) {
	int a=98;
	int b=78;
	System.out.println(a+b);//addition
	int c=a+b;
	System.out.println(c);
    System.out.println("c="+c);
    
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
    
//2.Relational Operators(<,<=,>,>=,==,!=)
    int d=98;
    int e=78;
    System.out.println(d<e);
    System.out.println(d<=e);
    System.out.println(d>e);
    System.out.println(d>=e);
    System.out.println(d==e);
    System.out.println(d!=e);
    
//3.Assignment operators(+=,-=,*=,/=,%=)
    int f=98;
    int g=78;
    System.out.println("f="+f);
    System.out.println("g="+g);
    System.out.println(f+=g);
    System.out.println("f="+f);
    int h=98;
    int j=78;
    System.out.println(h-=j);
    int k=98;
    int l=78;
    System.out.println(k*=l);
    int m=98;
    int n=78;
    System.out.println(m/=n);
    int o=98;
    int p=78;
    System.out.println(o%=p);

//4.Unary operators(++,--) Pre/post increment& decrement
    
int q=98;
int r=78;
int s=98;
int t=78;
System.out.println(++q);
System.out.println(q);
System.out.println(r++);
System.out.println(r);
System.out.println(--s);
System.out.println(s);
System.out.println(t--);
System.out.println(t);

//5.ternary operators(?, :) like if else condition-line reduce purpose
int u=98;
System.out.println(u>0?"positive":"negative");
System.out.println(u%2==0?"even":"odd");

//6.Bitwise operators(&,|,^,~)
int v=5;
int w=7;
System.out.println(v&w);
System.out.println(v|w);
System.out.println(v^w);
System.out.println(~v);

}
	
}
