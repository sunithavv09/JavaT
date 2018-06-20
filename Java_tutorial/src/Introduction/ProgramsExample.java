package Introduction;

public class ProgramsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// getting the first and last character from a string
		String str="this is java";
		System.out.println("first character is "+str.charAt(0)+ " last character is "+str.charAt(str.length()-1));

	// checking palindrome number	
	int number=1234331;
 int palin=number;
	int reminder=0;
	int reverse=0;
	
	while(palin!=0)
	{
		reminder=palin%10;
		reverse=reverse*10+reminder;
		palin=palin/10;
		
	}
	
	if (reverse==number)
	{
		System.out.println("palin");
	}else
	{
		System.out.println("not a palin");
	}

	// string with unique characters
	
	
	String stru="this java";
	char[] struarr=stru.toCharArray();
	int count=0;
	for(int i=0;i<=struarr.length-1;i++)
	{
		for(int j=i+1;j<=struarr.length-1;j++)
		{
			if(struarr[i]==struarr[j])
			{
			 count++;	
			}
		}
	}
	if(count>0)
	{
		System.out.println("not unique characters");
	}else 
	{
		System.out.println("unique");
	}
	
//counting number of words in a string
	String strcount="this is a java ";
	String[] strcountarr=strcount.split("\\s");
	System.out.println("coumt is "+strcountarr.length);
	
	
	
	
	}

}
