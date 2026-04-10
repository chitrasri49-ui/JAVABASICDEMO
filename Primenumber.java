package Javabasicdemo;
import java.util.*;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner a = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = a.nextInt();

		        int flag = 0; // 0 means prime, 1 means not prime

		        if (num <= 1) {
		            flag = 1;
		        } else {
		            for (int i = 2; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    flag = 1;
		                    break;
		                }
		            }
		        }

		        if (flag == 0) {
		            System.out.println(num + " is a prime number.");
		        } else {
		            System.out.println(num + " is not a prime number.");
		        }

		        a.close();
	}

}
