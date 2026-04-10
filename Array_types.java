package Javabasicdemo;

public class Array_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Single & multi dimensional array and jagged array
		//Syntax
		int a[]= {1,2,3,4,5};
		//access
		System.out.println(a[0]);	
		//modify
		a[0]=100;
		System.out.println(a[0]);
		//finding length
		System.out.println(a.length);	
		
//single dimensional array
		int b[]= {1,2,3,4,5};
		for (int i=0;i<=b.length;i++)
		{
			System.out.println(i);// (i) or (b[i])
		}
//Multi dimensional array
int c[] []= {{1,2,3},{4,5,6}};
for(int m=0;m<c.length;m++)
{
	for (int n=0;n<c[m].length;n++)
	{
		System.out.print(c[m][n]);
	}
	System.out.println();
}
//Jagged array
int s[][]= {{1,2,3},{4,5},{6,7,8}};
for(int q=0;q<s.length;q++)
{
	for(int r=0;r<s[q].length;r++)
	{
		System.out.print(s[q][r]);
	}
	System.out.println();

}
		}

}
