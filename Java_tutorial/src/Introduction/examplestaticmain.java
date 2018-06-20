package Introduction;


import java.util.Scanner;

public class examplestaticmain extends exampleStatic
{

	public static void main(String[] args)
	{		

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a string");
		String newStr1=scan.nextLine();
	
		stringreverse(newStr1)	;
		reverse(newStr1);
		
			}
	
	
	//reverse the String
	public  static void stringreverse(String str1)
	{
		
		int num1=10;
		
		String revstr="";
		String[] newstr=str1.split(" ");
		int count=newstr.length;
		System.out.println("string count is "+count);
		for(String rev:newstr){
			revstr=rev+" "+revstr;
		}
		System.out.println("string reverse is "+revstr);
	
	}
	
	//each character in  a string is reverse
	public static void reverse(String str)
	{
		char[] revArr=str.toCharArray();
		String revstr="";
		for( char item:revArr)
		{
			revstr=item+revstr;
		}
		System.out.println("original is:--- "+str);
		System.out.println("reverse is:--- "+revstr);
		
	}
}