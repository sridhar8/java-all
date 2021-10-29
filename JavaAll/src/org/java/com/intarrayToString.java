package org.java.com;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class intarrayToString {
	public static void main(String[] args) {
	/*	int []ary={1,2,3,4,5,6,7,8,9,10};
		System.out.println(ary.length);
		
//		String rre=String.join("", IntStream.of(ary).mapToObj(String::valueOf).toArray(String[]::new));
		String re=IntStream.of(ary).mapToObj(String::valueOf). collect(Collectors.joining(","));
		System.out.println(re);
	}
//		int []ary={1,2,3,4,5,6,7,8,9,10};
//		System.out.println(ary.length);							//need to try more to convert int array inti string
//		String r=Arrays.toString(ary);
//		String ar[]=r.substring(1, r.length()-1).split(",");
//		System.out.println(Arrays.toString(ar));
//		System.out.println(Arrays.toString(ar).subSequence(2, 6));
//}
}*/
//=========================================================================

/*
	int intary[]={1,2,3,4,5,6,7,8,9,10};
	System.out.println(intary.length);
													//int array into string array
	String strary[]=new String[intary.length];
	System.out.println(strary);
	for (int i = 0; i < intary.length; i++) {
strary[i]=String.valueOf(intary[i]);		
	}
	
	System.out.println(Arrays.toString(strary));
	System.out.println(strary.length);
String str= Arrays.toString(strary).toString();
System.out.println(str);
System.out.println(Arrays.toString(strary).toString().length());
	*/

/*
String arr[]= {"1","2","3","4","5","6","7","8"};
System.out.println(arr.length);
String str=Arrays.toString(arr);
System.out.println(str);
str=convertStringArrayToString(arr,",");
System.out.println(str);
System.out.println(str.length());
System.out.println(str.subSequence(1, 5));
}

	private static String convertStringArrayToString(String[] arr, String delimiter) {StringBuilder sb=new StringBuilder();
	for(String str:arr)
		sb.append(str).append(delimiter);
	return sb.substring(0,sb.length()-1);
	
	}}
*///==========================================================================================================
int ary[]= {1,2,3,4,5,6,7,8,9,10};//convertion int array into string 
int b=ary.length;					//length has been nit same for arrray and string 
System.out.println(b);				//space also considerd as a index number 
String sty=Arrays.toString(ary);	//array out print by using in loop 
System.out.println(sty);			//but string output normally we can print
sty=convertIntArraytoString(ary," ");//by using this line we can add method
System.out.println(sty);				//append-adding a value at last
System.out.println(sty.length());		//need to know delimeter
System.out.println(sty.subSequence(12,20));
System.out.println(sty.subSequence(6,12));
System.out.println(sty.subSequence(2,6));
System.out.println(sty.charAt(0));
//System.out.println(sty.a);
//sty.substring(b, b);
	}

private static String convertIntArraytoString(int[] ary, String d) {
	StringBuilder ss=new StringBuilder();
		for (int sty:ary)
			ss.append(sty).append(d);
		return ss.substring(0,ss.length()-1);
			
	}

	
			
	}
	//=====================================================
	/*
	int intary[]={1,2,3,4,5,6,7,8,9,10};
	System.out.println(intary.length);
	String str="";
	for (int k = 0; k < intary.length; k++) {
		str=str+Integer.toString(intary[k]);
	}
	
	System.out.println(str);
	System.out.println(str.substring(7, 10));
	
	//=========================================================================
//	System.out.println(a);// for arrays output print by using for loop
//	int a=1234;
//	String d=Arrays.toString(a);
//	int s=d.length();
//	System.out.println(Arrays.toString(a)); //But after converting into string it can be print
//		System.out.println(Arrays.toString(a).length());
//	System.out.println(Arrays.toString(a));
//		System.out.println(a.length);
//	String n= Arrays.toString(a);
//	System.out.println(n.length());
	
//	System.out.println(n.length());
//	String s=(a.toString());
//	System.out.println(s.length());
//	for (int i = 0; i < n.length(); i++) {
//		if (a[i]==10) {
//			System.out.print(n.substring(7, 10));
//		}
//		System.out.println(n.length());
	
}}*/