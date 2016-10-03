package hw;
import java.util.*;
/*
讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
Date: 2016/10/03
Author: 105021030 張廷毓
*/
public class hw04_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int sum=1;
		while(x>0){
			sum=sum*x;
			x--;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
