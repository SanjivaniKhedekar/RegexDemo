package pkg;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class UsernameRegexDemo 
{
  	//1st character must be uppercase 
	//contains many lowercase characters
	//only 1 digit allowed
	private static final String PATTERN = "^[A-Z][a-z]*[0-9]{1}";
	public static void main(String args[])
	{ 
		List<String> values = new ArrayList<String>();	       
		values.add("Sanju1"); 
		values.add("Jui@5"); 
		values.add("Sandesh4");
		values.add("jai_Patil");
 
		Pattern pattern = Pattern.compile(PATTERN);
		for (String value : values)
		{
		  Matcher matcher = pattern.matcher(value);
		  if(matcher.matches())
		  {
			  System.out.println("Username "+ value +" is valid");
		  }else{
			  System.out.println("Username "+ value +" is invalid");
		  }		  
		}
	}
}
