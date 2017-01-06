package mathsOp.MathsOperation;

import constants.Constants;
import totalprocess.IntegerRangeException;
import totalprocess.MathOp;

public class Multiplication extends MathOp {
	
	public Multiplication(int A, int B, String operator) throws IntegerRangeException {

		super(A, B, operator);
		setSignWord(Constants.mul_Word,Constants.mul_Sign);

	}

	public Multiplication(int A, int B) throws IntegerRangeException {

		super(A, B, Constants.mul_Sign);
		setSignWord(Constants.mul_Word,Constants.mul_Sign);

	}
	//default implementation
	public 	float operate() {

		return A * B;

	}
}
