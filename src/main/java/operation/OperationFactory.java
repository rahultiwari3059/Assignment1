package operation;

import mathsOp.MathsOperation.Division;
import mathsOp.MathsOperation.Multiplication;
import mathsOp.MathsOperation.Remainder;
import mathsOp.MathsOperation.Substraction;
import totalprocess.IntegerRangeException;
import totalprocess.MathOp;

public class OperationFactory {

	public void operation(int A1, int B1, String operator1) throws IntegerRangeException {
		// assigning input value into variables
		int A = A1;
		int B = B1;
		String operator = operator1;

		// argument constructor
		MathOp mathOpObject = new MathOp(A, B, operator);

		// taking operator from string
		char o = mathOpObject.operator.charAt(0);

		// converting operator to uppercase
		char O = Character.toUpperCase(o);

		// initializing the base class MathOp
		MathOp MathOpObject1 = null;

		switch (O) {
		case 'P':
			MathOpObject1 = new MathOp(A,B);	
			break;
		case 'S':
			MathOpObject1 = new Substraction(A,B);
			break;
		case 'M':
			MathOpObject1 = new Multiplication(A,B);
			break;
		case 'D':
			MathOpObject1 = new Division(A,B);
			break;
		case 'R':
			MathOpObject1 = new Remainder(A,B);
			break;
		default:
			System.out.println("Invalid Operator");
		}
		System.out.println(MathOpObject1.operate());
		System.out.println("Result: " + A + MathOpObject1.getSign() + B + " = " + MathOpObject1.operate());
		System.out.println("Result: " + A + MathOpObject1.getWord() + B + " = " + MathOpObject1.operate());
	}
}
