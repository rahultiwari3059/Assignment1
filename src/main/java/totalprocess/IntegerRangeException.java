package totalprocess;

import constants.Constants;

public class IntegerRangeException extends Exception {

	public IntegerRangeException(int num) {
		
		super(num + Constants.rangeOfInteger);
	}
}
