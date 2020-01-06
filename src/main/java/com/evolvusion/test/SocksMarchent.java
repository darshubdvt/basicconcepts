package com.evolvusion.test;

public class SocksMarchent {
	public static void main(String[] args) {
		//int a [1,1,2,3];
		//System.out.println(pairOfSocks(new int[] {2,1,2,1,2,2}));
		pairSocks();
	}

	public static int pairOfSocks(int[] pairSocks) {
		int total = 0;
		for (int i = 0; i < pairSocks.length - 1; i++) {
			if (i < pairSocks.length-1 && pairSocks[i] == pairSocks[i + 1]) {
				total++;
				i = i + 1;
			}
		}

		return total;

	}
	
	public static void pairSocks()
	{
		int[] array= {7,8,2,3,7,7,3,2};
		
		int[] a=new int[100];
		
		for(int i=0;i<array.length;i++)
		{
			a[array[i]]++;
		}
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>0)
			{
			System.out.println("the number of pairs "+j+" is "+ a[j]/2);
			}
		}
		
	}
}




