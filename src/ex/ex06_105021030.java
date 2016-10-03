package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021030 張廷毓
 */
public class ex06_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=0;
		if(x<-1)
		y=3*x*x;
		else{
		if(x>=-1 && x<=1){
			y=x*x*x+3*x-3;
			}
		else
			y=2*x+3;
		}
		System.out.print(y);

	}

}
