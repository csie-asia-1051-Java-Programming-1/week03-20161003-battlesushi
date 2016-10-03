package ex;
import java.util.*;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021030 張廷毓
 */
public class ex01_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2= new StringBuilder(str).reverse().toString();
		System.out.print(str2);

	}

}
