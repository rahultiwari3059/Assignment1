package totalprocess;

import constants.Constants;

public class MathOp {
	public String operator;
	public int A, B;
	public String sign, word;

	// constructor with three arguments
	public MathOp(int a, int b, String operator2) throws IntegerRangeException {
		validateRange(a, b);
		this.operator = operator2;
	}

	// constructor with two arguments
	public MathOp(int a, int b) throws IntegerRangeException {
		validateRange(a, b);
		this.operator = Constants.plus_P;
	}

	public String getSign() {
		return sign;

	}

	public String getWord() {

		return word;
	}

	// default implementation
	public float operate() {
		setSignWord(Constants.plus_Word, Constants.plus_Sign);
		return A + B;
	}

	// setting sign and word
	public void setSignWord(String word, String sign) {
		this.sign = sign;
		this.word = word;

	}

	// checking range of A and B if correct then assigning or else throwing
	// Exception
	public void validateRange(int A1, int B1) throws IntegerRangeException {

		if ((A1 >= Constants.lowerLlimitRange) && (A1 <= Constants.upperlimitrange)  ) {
			this.A = A1;
			

		} else {
			throw new IntegerRangeException(A1);
		}
			if ((B1 >= Constants.lowerLlimitRange) && (B1 <= Constants.upperlimitrange)  ) {
				this.B = B1;
			

			} else {

				throw new IntegerRangeException(B1);
			}
	}
}
