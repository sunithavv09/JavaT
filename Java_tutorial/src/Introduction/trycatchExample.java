package Introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class trycatchExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String dfw="";
		try{
		dividebyzero1(dfw,"hello");
		}
		
		
		
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();

			System.out.println("result in main catch");

		}
		finally
		{
			System.out.println("hello");
		}
	
		System.out.println("result in main ");


	}
	
	
	public static void dividebyzero1(String str,String str1) throws FileNotFoundException 
	{
		

		int num=1;
		String str2=str;
		
		try{
			fileEx();
			int strresult=str2.length();
		
		
		int result=num/0;
		}catch (NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("NullPointerException in catch block");
		}catch (NumberFormatException e)
		{
			e.printStackTrace();
			System.out.println("NumberFormatException");
		}//catch (FileNotFoundException e)
		//{
			//e.printStackTrace();
			//System.out.println("FileNotFoundException in catch");
	
		//}
		
		
		
		finally
		{
			System.out.println("in finally block");

			
		}
		
		
		System.out.println("result is ");
	}

	
	public static void fileEx() 
	{
		try {
			throw new FileNotFoundException("infileEx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("in  throww block");
		}
		
		//FileInputStream fis=new FileInputStream("path");
		//System.out.println("after file imput stream");
		
	}
}
