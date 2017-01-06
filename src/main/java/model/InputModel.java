package model;

public class InputModel {
private int A;
private int B;
private String Operator;


@Override
public String toString() {
	return "InputModel [A=" + A + ", B=" + B + ", Operator=" + Operator + "]";
}
public int getA() {
	return A;
}
public void setA(int a) {
	A = a;
}
public int getB() {
	return B;
}
public void setB(int b) {
	B = b;
}
public String getOperator() {
	return Operator;
}
public void setOperator(String operator) {
	Operator = operator;
}
	
}
