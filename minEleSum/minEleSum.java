/*
formate1:
4//num of elements in array
7//sum
[1,3,4,5]
op = 2 { if we take 3,4 and sum then ans = 7(minimum selection num of element to get the sum 7) } 

formate2:
6
3
[1 1 1 6 2 1]
op == 2
*/

import java.util.*;
import java.util.Scanner;

class minEleSum{
	public static void main(String[] args){
		int num=0,i=0,j=0,sele,mincnt =999,cnt=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("enter array");
		for(i=0;i<num;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("sum ele");
		sele = sc.nextInt();
		
		
		for(i=0;i<num;i++){
			if(arr[i]<sele){
				sum = arr[i];
				for(j=i+1;j<num-1;j++){
					if(arr[j]<sele){
						sum = sum + arr[j];
		                if(sum <= sele)
							cnt++;
						else if(sum == sele){
							//cnt++;
							break;
						}
						else if(sum > sele){
							cnt=1;
							break;
						}
					}
				}
			}
			if(cnt != 1 && cnt<mincnt)
				mincnt = cnt;
			cnt = 1;
		}
		System.out.println("\n minimum number of ele need to get sum is " + mincnt);
		
	}
}

