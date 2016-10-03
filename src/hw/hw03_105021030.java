package hw;
import java.util.*;
/*
讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
Date: 2016/10/03
Author: 105021030 張廷毓
*/
public class hw03_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int sum=1;
		for(int i=x;i>0;i--){
			sum=sum*i;
		}		
		System.out.println(sum);
	}

}
