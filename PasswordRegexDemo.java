package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRegexDemo 
{
	//Must contains atleast one uppercase character
	//atleast one lowercase character
	//atleast one digit
	//atleast one special character
	//min length 8 max 30
	private static final String PATTERN = "((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,30})";
	                                    
	public static void main(String args[])
	{ 
		List<String> values = new ArrayList<String>();	       
		values.add("Sanju@123"); 
		values.add("Jui@5"); 
		values.add("Sandesh$4");
		values.add("Jaipatil1#");
 
		Pattern pattern = Pattern.compile(PATTERN);
		for (String value : values)
		{
		  Matcher matcher = pattern.matcher(value);
		  if(matcher.matches())
		  {
			  System.out.println("Password "+ value +" is valid");
		  }else{
			  System.out.println("Password "+ value +" is invalid");
		  }		  
		}
	}
}
