package Introduction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="this is java test";
		
		
	// reversing each letter	
		char[] strarr=str.toCharArray();
		String newstr="";
		for(int i=0;i<strarr.length;i++)
		{
			newstr=strarr[i]+newstr;
		}
		System.out.println(newstr);

//reversing the words
		String str1="this is java test";

		String[] wStrarr=str1.split("\\s");
	
		String newStr1=" ";
		System.out.println("array size "+wStrarr.length);
		for(int i=wStrarr.length;i>=0;i--)
		{
			newStr1=newStr1+wStrarr[i]+" ";
		}
System.out.println("asdsa "+newStr1);

	


String str3="this is java String";
String[] str31=str3.split("\\s");
List<String> str3Arr=Arrays.asList(str31);
Collections.reverse(str3Arr);
//Collections.sort(str3Arr);
//Collections.sort(str3Arr,Collections.reverseOrder());

String newstr1="";
for(String item:str3Arr)
{
	newstr1=newstr1+item+" ";
}

System.out.println(newstr1);


StringBuilder br=new StringBuilder("this is new java");
br.reverse();
System.out.println(br);

	}

	
	
}
