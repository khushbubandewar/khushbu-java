/**
 * 
 */
package com.basic;

/**
 * @author Anil
 *
 */
public class DataTypes {
	byte byteVariable;
	short shortVariable;
	int intVariable;
	long longVariable;
	float floatVariable;
	double doubleVariable;
	char charVariable;
	boolean booleanVariable;
	
	public DataTypes()
	{
		System.out.println("The default value of data types");
		System.out.println("The default value of byte data types" +byteVariable);
		System.out.println("The default value of short data types" +shortVariable);
		System.out.println("The default value of int data types" +intVariable);
		System.out.println("The default value of long data types" +longVariable);
		System.out.println("The default value of float data types" +floatVariable);
		System.out.println("The default value of double data types" +doubleVariable);
		System.out.println("The default value of char data types" +charVariable);
		System.out.println("The default value of boolean data types" +booleanVariable);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Minimum value of byte is" + Byte.MIN_VALUE + "Maximum value of byte is " + Byte.MAX_VALUE);
		System.out.println("Minimum value of short is" + Short.MIN_VALUE + "Maximum value of short is " + Short.MAX_VALUE);
		System.out.println("Minimum value of int  is" + Integer.MIN_VALUE + "Maximum value of int is " + Integer.MAX_VALUE);
		System.out.println("Minimum value of long is" + Long.MIN_VALUE + "Maximum value of long is " + Long.MAX_VALUE);
		System.out.println("Minimum value of float is" + Float.MIN_VALUE + "Maximum value of float is " + Float.MAX_VALUE);
		System.out.println("Minimum value of double is" + Double.MIN_VALUE + "Maximum value of double is " + Double.MAX_VALUE);
		System.out.println("Minimum value of char is" + Character.MIN_VALUE + "Maximum value of char is " + Character.MAX_VALUE);
		
		
	}
	/**
	 * Information of data types
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DataTypes();
	}

}
