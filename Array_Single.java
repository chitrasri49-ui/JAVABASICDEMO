package Javabasicdemo;

public class Array_Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//finding the highest value of listed element
int a[]	= {1,2,3,4,5};
int b=a[0];

for(int i=1; i<a.length; i++) {

if(a[i]>b)
{
	b=a[i];
//System.out.print(b);
}
}
System.out.println(b);

	}
}
