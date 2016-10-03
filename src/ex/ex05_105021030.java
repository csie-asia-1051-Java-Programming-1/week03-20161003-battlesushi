package ex;
import java.util.*;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021030 張廷毓
 */
public class ex05_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long num=sc.nextLong();
		if(num%2==0){
			System.out.print("偶數");
		}
		else
			System.out.print("奇數");

	}

}
