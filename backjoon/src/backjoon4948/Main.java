package backjoon4948;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.nextInt()!=0) {
			int m=sc.nextInt();
			List<Integer> mList=new ArrayList<>();
			for (int i = m; i <=2*m; i++) {
				boolean isCheck=false;
				for (int j = 2; j <=i; j++) {
					if(i%j==0) {
						isCheck=true;
						return;
					}
				}//소수판별반복문
				if(!isCheck) {
					mList.add(i);
				}				
			}//m반복문
			System.out.println(mList.size());			
		}//while
	}//main

}
