package com.training;

public class FirstExample {

	public String underStandFinally(){
		
		String number = "Four";
		try{
			//System.out.println("hi");
			int val = Integer.parseInt(number);
			System.out.println("Value: "+val);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
			return "caught";
		}
		finally{
			System.out.println("Inside FINALLY");
		}
		System.out.println("Method end");
		return null;
		
	}
	public static void main(String[] args) {
		
		FirstExample obj = new FirstExample();
		String message = obj.underStandFinally();
		System.out.println(message);
		
		String s = "Hello";
		try{
			System.out.println("String Length: "+s.length());
		}
		catch(NullPointerException e)
		{
			System.err.println("String value is NULL - Check");
			System.err.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception");
		}
		finally{
			System.out.println("Inside Finally");
		}
		System.out.println("Bye...");
	}

}
