/*Recursively break a number in 3 parts to get maximum sum
Given a number n, we can divide it in only three parts n/2, n/3 and n/4 (we will consider only integer part).
 The task is to find the maximum sum we can make by dividing number in three parts recursively and summing up them together.*/
 
 /*  https://practice.geeksforgeeks.org/problems/maximum-sum-problem/0   */

import java.util.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     System.out.println(calc(n));
	 }
	 }
	 static int calc(int n)
	 {
	     int dp[]=new int[n+1];
	     for(int i=0;i<=11;i++)
	     dp[i]=i;
	     
	     for(int i=12;i<=n;i++)
	     {
	         int temp=dp[i/2]+dp[i/3]+dp[i/4];
	         dp[i]=Math.max(temp,i);
	     }
	     return dp[n];
	 }
 
