package datatypes;

public class Main {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		num = 200;
		System.out.println(num);
		
		// both a and b take same memory space.
		long a = 10;
		long b = 1000000;
		
		// byte num2 = 128; // error

		char var1 = 'A';
		char var2 = '가';
		char var3 = '1'; // this is a char, not int
		char var4 = '\n'; // newline char
		char var5 = ' '; // a space
		// char var6 = ''; //error
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		boolean truelyVar = true;
		boolean falseyVar = false;
		
		final double PI = 3.1415926535; // a const
		System.out.println(PI);
		
		// swap
		int x = 3, y = 5;
		System.out.printf("before: %d %d\n", x, y);
		int tmp = x;
		x = y;
		y = tmp;
		System.out.printf("after: %d %d\n", x, y);
	}

}
