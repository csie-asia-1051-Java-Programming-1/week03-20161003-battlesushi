package hw;
import java.util.*;
/*
讓使用者輸入多個數，統計正數、負數及零各有多少個。
Date: 2016/10/03
Author: 105021030 張廷毓
*/
public class hw02_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0, b=0,c=0;
		boolean run=true;
		while(run==true){
		float x=sc.nextFloat();
		if(x>0)
		a++;
		else{
		if(x==0)
		c++;
		else
		b++;	
		}
		System.out.println("是否繼續(Y/N)??");
		char A=sc.next().charAt(0);
		if(A=='Y' ||A=='y')
			run=true;
		else
		if(A=='N' ||A=='n')
			run=false;
		}
		System.out.println("總計個數");
		System.out.println("正數:"+a);
		System.out.println("負數:"+b);
		System.out.print("零:"+c);
		
		
	}

}
