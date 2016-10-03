package ex;
import java.util.*;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021030 張廷毓    65A 97a
 */    
public class ex03_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		int v1=ch1-'a';
		
		if(v1>=0 &&v1<26){
			v1=((int)ch1-32);
				System.out.print((char)v1);	
		}
		else{
		v1=ch1-'A';	
			if(v1>=0 &&v1<26){
				v1=((int)ch1+32);
				System.out.print((char)v1);	
			}
			else
				System.out.print("輸入錯誤非英文字母");
		}
		
		
		
		
		
		
		
		
		

	}

}
