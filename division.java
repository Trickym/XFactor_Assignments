/*
Divide two integers without using division, multiplication and mod operator: division-without-division-operator
Perform division without using division, multiplication and mod operator.
private static Integer divide(Integer numerator, Integer denominator)
*/

import java.util.*;

class Division
{
	
	private static int divide(int numerator, int denominator)
	{
		
		int sign, quotient = 0;
        if(numerator < 0 && denominator > 0)
        {
            sign = -1;
        }
        else if(numerator > 0 && denominator < 0)
        {
            sign = -1;
        }
        else
        {
            sign = 1;
        }
	
		numerator = Math.abs(numerator);
		denominator = Math.abs(denominator);
	
		while (numerator >= denominator)
		{
			numerator -= denominator;
			++quotient;
		}
	
		return sign * quotient;
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numerator:");
		int num1 = sc.nextInt();

		System.out.println("Enter denominator:");
		int num2 = sc.nextInt();

		System.out.println(num1+" / "+num2+" = "+divide(num1, num2));

		sc.close();
	}
}

/*
Output:
Enter numerator:
12
Enter denominator:
3
12 / 3 = 4
Enter numerator:
-12
Enter denominator:
3
-12 / 3 = -4
*/
