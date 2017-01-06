package mathsOp.MathsOperation;

import constants.Constants;
import totalprocess.IntegerRangeException;
import totalprocess.MathOp;

public class Remainder extends MathOp {
	
		
		public Remainder(int A, int B, String operator) throws IntegerRangeException {

			super(A, B, operator);
			setSignWord(Constants.rem_Word,Constants.rem_Sign);

		}

		public Remainder(int A, int B) throws IntegerRangeException {

			super(A, B,Constants.rem_Sign);
			setSignWord(Constants.rem_Word,Constants.rem_Sign);

		}
	//default implementation
	public float operate() {

			return A % B;

		}
}
