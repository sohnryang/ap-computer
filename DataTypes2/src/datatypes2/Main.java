package datatypes2;

public class Main {

	public static void main(String[] args) {
		{
			// double > int > byte
			byte num1 = 100;
			int num2 = num1;
			double num3 = num2;
			assert num3 == 100.0;
		}

		{
			// float > int
			float num4 = 1.2f;
			// int num5 = num4; // error
			assert num4 == 1.2f;
		}
		
		{
			// int > char
			char ch1 = 'A';
			int num6 = ch1;
			System.out.println(num6);
			float num7 = ch1;
			System.out.println(num7);
		}
		
		{
			long num1 = 5;
			int num2 = 3;
			// int num3 = num1 + num2; // error
			long num4 = num1 + num2; 
			System.out.println(num4);
		}
		
		{
			byte num1 = 5;
			byte num2 = 3;
			// byte result1 = num1 + num2; //error
			// byte result2 = num1 + 5; //error
			int result3 = num1 + num2;
			System.out.println(result3);
		}
	}

}
