package backjoon9020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int k = 0; k < n; k++) {
			List<Integer> sNum=new ArrayList<>();
			int num=sc.nextInt();
			//입력한 수보다 작은 소수들
			// 소수들의 합이 num이 되면 됨
			for (int i = 2; i < num; i++) {
				boolean isCheck=false;
				for (int j = 2; j < i; j++) {
					if(i%j==0) {
						isCheck=true;
					}
				}
				if(!isCheck) {
					sNum.add(i);
				}
			}//소수for
			int a=0;
			int b=0;
			
			for (int i = sNum.size()/2; i < sNum.size(); i++) {
				if(sNum.contains(num-sNum.get(i-1))){
					b=sNum.get(i-1);
					a=num-b;
				}
			}
			System.out.println(a+" "+b);
		}//for
	}
}
