package mathsOp.MathsOperation;

import constants.Constants;
import totalprocess.IntegerRangeException;
import totalprocess.MathOp;


public class Division extends MathOp {

	public Division(int A, int B, String operator) throws IntegerRangeException {

		super(A, B, operator);
		setSignWord(Constants.div_Word, Constants.div_Sign);
		

	}

	public Division(int A, int B) throws IntegerRangeException {

		super(A, B, Constants.div_Sign);
		setSignWord(Constants.div_Word, Constants.div_Sign);

	}

	// default implementation
	public float operate() {
	
		return A / B;

	}

	

}
