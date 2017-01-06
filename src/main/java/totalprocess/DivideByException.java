package totalprocess;

import constants.Constants;

public class DivideByException extends Exception{

	
	public DivideByException(int num)
	{
		
		super(num+Constants.divideByZero);
	}
}
