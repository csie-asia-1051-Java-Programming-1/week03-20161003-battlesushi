package hw;
import java.util.*;
/*
 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
Date: 2016/10/03
Author: 105021030 張廷毓
 */
public class hw01_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long num=sc.nextLong();
		int sum=0;
		while(num>0){
			sum++;
			num=num/10;
		}
		System.out.print(sum);
		
		
		

	}

}
