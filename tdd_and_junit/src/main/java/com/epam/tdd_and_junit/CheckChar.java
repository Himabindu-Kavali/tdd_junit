package com.epam.tdd_and_junit;

public class CheckChar {
	

	public  String removeA(String string) 
	{
		// TODO Auto-generated method stub
		String result;
		StringBuilder sb =new StringBuilder(string);
		if(string.charAt(0)=='A' && string.charAt(1)=='A')
		{
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
		}
		else {
		if(string.charAt(0)=='A')
			sb.deleteCharAt(0);
		if(string.charAt(1)=='A')
			sb.deleteCharAt(1);
		}
		result=sb.toString();
		return result;
	}

	}

