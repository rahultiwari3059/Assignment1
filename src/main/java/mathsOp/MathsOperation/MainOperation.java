package mathsOp.MathsOperation;

import constants.Constants;
import totalprocess.DivideByException;
import totalprocess.IntegerRangeException;
import totalprocess.MathOp;

public class MainOperation {

	public static void main(String[] args) {

		// assigning input value into variables
		int A = 500000;
		int B = 1000;
		String operator = "d";

		// swapping value of A and B
		int temp = A;
		A = B;
		B = temp;

		MathOp MathOpObject1 = null;
		
		// taking operator from string
		char o = operator.charAt(0);

		// converting operator to Uppercase
		char O = Character.toUpperCase(o);
		
		// switch case to choose appropriate operation
		try
		{
			switch (O) {
			case 'P':
				MathOpObject1 = new MathOp(A, B);
				break;
			case 'S':
				MathOpObject1 = new Substraction(A, B);
				break;
			case 'M':
				MathOpObject1 = new Multiplication(A, B);
				break;
			case 'D':
				if(B==0)
				{
					throw new DivideByException(B);
				}
				
				MathOpObject1 = new Division(A, B);
				
				break;
			case 'R':
				MathOpObject1 = new Remainder(A, B);
				break;
			default:
				System.out.println(Constants.invalid_Operator);
			}
		} catch (IntegerRangeException e) {
			e.printStackTrace();
		} catch (DivideByException e) {
			e.printStackTrace();
		}
		System.out.println(MathOpObject1.operate());
		System.out.println("Result: " + A + MathOpObject1.getSign() + B + " = " + MathOpObject1.operate());
		System.out.println("Result: " + A + MathOpObject1.getWord() + B + " = " + MathOpObject1.operate());
	}

}
