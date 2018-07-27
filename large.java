/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int number1=sc.nextInt();
		System.out.println("enter number2");
		int number2=sc.netInt();
		System.out.println("enter number3");
		int number3=sc.nextInt();
		if((number1>number2)&&(number1>number3))
		System.out.println("number1 is largest");
		else if((number2>number1)&&(number2>number3))
		System.out.println("number2 is largest");
		else
		System.out.println("number3 is largest");
		
		}
}
