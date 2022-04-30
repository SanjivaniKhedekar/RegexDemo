package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdRegexDemo 
{
	private static final String PATTERN = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA-z]{2,3}$";
    
	public static void main(String args[])
	{ 
		List<String> values = new ArrayList<String>();	       
		values.add("SanjuChavan70@yahoo.com"); 
		values.add("Jui@.in"); 
		values.add("Sandesh_Khedekar@gmail.com");
		values.add("h@example.com");
		values.add("hello@2020@example.com");
		values.add("hello@example.co.uk");
 
		Pattern pattern = Pattern.compile(PATTERN);
		for (String value : values)
		{
		  Matcher matcher = pattern.matcher(value);
		  if(matcher.matches())
		  {
			  System.out.println("Email Id "+ value +" is valid");
		  }else{
		  }		  
		}
	}
}
