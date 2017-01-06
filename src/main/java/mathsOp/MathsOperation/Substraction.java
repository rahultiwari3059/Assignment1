package mathsOp.MathsOperation;

import constants.Constants;
import totalprocess.IntegerRangeException;
import totalprocess.MathOp;

public class Substraction extends MathOp {
	public Substraction(int A, int B, String operator) throws IntegerRangeException {

		super(A, B, operator);
		setSignWord(Constants.minus_Word,Constants.minus_Sign);

	}

	public Substraction(int A, int B) throws IntegerRangeException {

		super(A, B, Constants.minus_Sign);
		setSignWord(Constants.minus_Word,Constants.minus_Sign);

	}
//default implementation
public 	float operate() {

		return A - B;

	}
}
