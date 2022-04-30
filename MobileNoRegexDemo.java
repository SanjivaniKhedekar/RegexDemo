package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoRegexDemo 
{
	//start with 8/9
	//10 digits
	private static final String PATTERN = "[8-9][0-9]{9}";
	public static void main(String args[])
	{ 
		List<String> values = new ArrayList<String>();	       
		values.add("8451279678"); 
		values.add("6058621558"); 
		values.add("9028850078");
		values.add("726458132796222");
 
		Pattern pattern = Pattern.compile(PATTERN);
		for (String value : values)
		{
		  Matcher matcher = pattern.matcher(value);
		  if(matcher.matches())
		  {
			  System.out.println("Mobile no "+ value +" is valid");
		  }else{
			  System.out.println("Mobile no "+ value +" is invalid");
		  }		  
		}
	}
}
