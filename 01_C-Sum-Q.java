//https://www.spoj.com/problems/CSUMQ/

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n;
		n = scn.nextInt();
		
		int arr[] = new int[n];
    	for(int i=0; i<n; i++){
        	arr[i] = Integer.parseInt(scn.next());
		}

		//prefix arr
		int p[] = new int[n];
		for(int i=0; i<n; i++){
			if(i==0){
				p[i] = arr[i];
			}
			else{
				p[i] = arr[i]+p[i-1];
			}
		}

		int q = scn.nextInt();
		
		for(int i=0; i<q; i++){
			int sum = 0;
			int l = Integer.parseInt(scn.next());
			int r = Integer.parseInt(scn.next());
			
			if(l<=0){
				sum = p[r];
			}
			else{
				sum = p[r] - p[l-1];
			}
			
			System.out.println(sum);
		}
		
	}
}
