package hw;
import java.util.*;
/*
讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
Date: 2016/10/03
Author: 105021030 張廷毓
*/
public class hw05_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<=x;i++){
			sum=sum+i*(i+1);
		}
		System.out.print(sum);
		
		
		
		
		
		
	}

}
