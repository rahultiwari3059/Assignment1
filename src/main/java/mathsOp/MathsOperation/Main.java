package mathsOp.MathsOperation;

import java.util.ArrayList;

import constants.Constants;
import iterationFactory.Iteration;
import model.InputModel;
import operation.OperationFactory;

public class Main {

	/*public static void main(String[] args) {

		// taking file path of input JSON
		String jsonfilepath = args[0];

		// assigning input value into variables
		int A = 10;
		int B = 200000;
		String operator = "m";
		
		// creating object of OperationFactory
		OperationFactory operationFactoryObject = new OperationFactory();

		// calling operation method of operationFactory class
		operationFactoryObject.operation(B, A, operator);
		
	}
*/
/*	static void divideByZero(int A, String operator) throws MyException {
		
		// converting operator to UpperCase
		String opera = operator.toUpperCase();

		if (opera.equals(Constants.div_D)) {
			if (A == 0) {
				throw new MyException(Constants.divideByZero);
			}
		}
	}

	static void rangeOfInteger(int A, int B) throws MyException {

		if (((A > 50000) || (B > 50000)) || ((A < 0) || (B < 0))) {
			throw new MyException(Constants.rangeOfInteger);

		}

	}

	static void invalidOperator(String operator) throws MyException {
		
		// taking operator from string
				char o =operator.charAt(0);

				// converting operator to uppercase
				char O = Character.toUpperCase(o);
				
		if (!(O == 'P') || (O == 'M') || (O == 'D') || (O == 'S') || (O == 'R')) {
			throw new MyException(Constants.invalidOperator);
		}}
*/
	

}
