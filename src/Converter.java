
public class Converter
{
	   public static void main(String[] args)
	    {
	    }	
	    
	    

		/*
		 * Methods
		 */
	   
	    public static String toBinary(int input)
	    {
	    	input=1000;
	        String outString="";
	        while(input != 0)
	        {
	            if(input % 2 == 1)
	            {
	                outString="1"+outString;
	            }
	            else
	            {
	                outString="0"+outString;
	            }
	            input=input/2;
	        }
	        return outString;
	    }
	

}