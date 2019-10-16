package com.exercise101subprogramas.app;
import java.util.Scanner;
public class SubProgramas 
{

	public static void main(String[] args) 
	{
	    //Variables declaration
		int num1=0;
		int num2=0;
		int result=0;
		
		//Objects declaration
		Scanner input=new Scanner(System.in);
		
		System.out.println(ShowTunnedMessage("Ale"));
		
		ShowMessage();		
		//System.out.println("Dame un numero: ");
		num1=input.nextInt();
		ShowMessage();
	    //System.out.println("Dame otro numero");
	    num2=input.nextInt();
	    
	    result=AddNumbers(num1,num2);
	    
	    System.out.println("The result is: "+result);

	}
	
	//Method to ask numbers
	public static void ShowMessage()
	{
		System.out.println("Input a number: ");
	}
	
	//Method to show a tuned message
	public static String ShowTunnedMessage(String message)
	{
		return "Hola "+message;
	}
	
	//First method to add numbers
	public static int AddNumbers(int num1, int num2)
	{
		return num1+num2;
		
	}

}
