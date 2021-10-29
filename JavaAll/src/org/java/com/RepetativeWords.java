package org.java.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class RepetativeWords {
/*
	public static void main(String []args){
		String s=("to the people  for the people by the people");

		Map<String,Integer>m=new LinkedHashMap();

		String[] words=s.split(" ");
		
		for(String word:words){							//surya class
		
			if(m.containsKey(word)){
				int value=m.get(word);
				m.put(word,value+1);
		}
		else{
			m.put(word,1);

		}
		}
		System.out.println(m);
		Set<Entry<String,Integer>>entrySet=m.entrySet();
		System.out.println(entrySet);
		for(Entry<String,Integer>entry:entrySet){
		if(entry.getValue()>1) {
		System.out.println(entry);
		}
		}
	}

}
*///=====================================================================================================
/*public static void main(String[]args) {
String s= ("to the people for the people by the people");

Map<String,Integer>m=new LinkedHashMap();

String[] words=s.split(" ");		//initally we split the string by using split method
for(String word:words) {			//and splited words can be stroed in string array
									//we have to assign the value for the splitted words so we can use map linkedhashmap
if(m.containsKey(word)) {			//why because linkedhashmap can be an insertion order
									//map out put printed by using enhanced for loop because conditions we don know
	int value=m.get(word);			//after that we have to initially weather their is any words are there or not
	m.put(word, value+1);			//if no in the sense we can redirect into else condition
}									//in else condition we can add words by put method and value given for all
else {								//initially to added in else condition
	m.put(word, 1);					//then the can check with the if condition if condition have the words of to only
}									//so else condition activated then the goes into else then added the 
}									//simultaneously words are added one by one in else condition upto repeated words
System.out.println(m);				//while repeated the,people coming into if condition if condition is activated bcz it already added 
Set<Entry<String,Integer>>entryset=m.entrySet();	//here we don knw what is the value is for that value 
System.out.println(entryset);						//so value get by using get method
for(Entry<String,Integer> entry:entryset) {			//then value can be added by 1 to repeated word
	if(entry.getValue()>1) {						//then output printed by using m it print in curly{} brasis
													//then using entryset out printed by using closed[] brasis
													//by using for each loop we can get repeated word by using if
	System.out.println(entry);
	}
	}
	}
}
*///==================================================================================================================
//need to try int [] a={1,4,5,6,7,8}; 
//write a program for added any 2 value we can get the sum of 10

public static void main(String[]args) {
	int a[]= {1,4,5,6,7,8};
/*int b=a.length;
System.out.println(b+1);
for (int i = 0; i < a.length; i++) {
if ((a[i]+a[i++])==10) {

	System.out.println(a[i]);
	System.out.println(a[i++]);
*/
int sum=0;
for (int i : a) {
	
//	sum=sum+i;
	if (sum+i==10) {
	}System.out.println(sum);
		System.out.println(i);
		
	
}



}
}