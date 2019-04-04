 package strings;

import java.util.HashMap;
import java.util.Set;

public class DupilcateCharInString
	{
	    static void duplicateChar(String inputString)
	    {
	 
	        char [] chars = inputString.toLowerCase().toCharArray();
	 
	        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
	 
	        for (char c :chars )
	        {
	 
	            if(charCount.containsKey(c))
	            {
	 
	              charCount.put(c,charCount.get(c)+1);
	            }
	            else
	            {
	                //If it is not present, put that word into wordCount with 1 as it's value
	 
	               charCount.put(c, 1);
	            }
	        }
	 
	        Set<Character> charInString =charCount.keySet();
	 
	        //Iterating through all words in wordCount
	 
	        for (Character ch : charInString)
	        {
	            //if word count is greater than 1
	 
	            if(charCount.get(ch) > 1)
	            {
	                //Printing that word and it's count
	 
	                System.out.println(ch+" : "+charCount.get(ch));
	            }
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        duplicateChar("BreadButterBread");
	 
	    }
	}

