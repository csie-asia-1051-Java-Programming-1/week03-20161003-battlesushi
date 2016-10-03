package ex;
import java.util.*;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021030 張廷毓
 */
public class ex04_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long num=sc.nextLong();
		Long sum=0L;
		while(num>0){
			sum=sum+num%10;
			num=num/10;
		}
		System.out.print(sum);
		
		
		
		

	}

}
