package org.javapractice.com;

public class DuplicatesinArray {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,10,20,30,10,20,30};
		int freq[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int no=arr[i];
			int count=1;
			for (int j = 0; j < arr.length; j++) {
				if (no==arr[j]) {
					count++;
					freq[i]=-1;
				}
			if (freq[i]!=-1) {
				freq[i]=count;
			}
			}
		}
		
	}

}
