package com.demo.programes;

public class Sorting {

	public static void main(String[] args) {

		int[] input = {4,2,1,5,3,10,3};
		int temp;
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]>input[j])
				{
				temp = input[i];
				input[i]=input[j];
				input[j]=temp;
				}
				
			}
		}
		
		for(int i:input)
			System.out.print(i+" ");

}

}
