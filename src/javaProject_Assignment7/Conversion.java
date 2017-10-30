//Package declaration is mandatory
package javaProject_Assignment7;

public class Conversion {
	//Declare variables
	int i = -7;
	String s;
	
	//Main started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation of class
		Conversion objCon = new Conversion();
		//Convert integer to string using tostring() (inbuilt java function)
		objCon.s = Integer.toString(objCon.i);
		System.out.println(objCon.s);
		System.out.println(objCon.i+100);//here + is binary plus operator
		System.out.println(objCon.s+100);//Here + is string concatenation operator
	}

}